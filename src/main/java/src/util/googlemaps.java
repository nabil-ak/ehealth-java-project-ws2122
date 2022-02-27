/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.util;
import com.google.maps.FindPlaceFromTextRequest;
import com.google.maps.model.FindPlaceFromText;
import com.google.maps.GeoApiContext;
import com.google.maps.NearbySearchRequest;
import com.google.maps.model.LatLng;
import com.google.maps.model.PlaceType;
import com.google.maps.model.PlacesSearchResponse;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import src.models.*;
/**
 *
 * Google Maps API
 */
public class googlemaps {
    
    /**
     * The Api Key for the Google API
     */
    private static final String apiKey = "APIKEY";
    
    /**
     * Get the coordinates of the users address
     * @param user
     * @return true when the Lat and Long were successfully updated, otherwise false
     */
    public static boolean getLatLong(user user){
        GeoApiContext apiBuilder = new GeoApiContext.Builder().apiKey(apiKey).build();
        FindPlaceFromTextRequest api = new FindPlaceFromTextRequest(apiBuilder);
        api.input(user.getStreet()+" "+user.getHousenumber()+" "+user.getZipcode()+" "+user.getCity());
        api.inputType(FindPlaceFromTextRequest.InputType.TEXT_QUERY);
        api.fields(FindPlaceFromTextRequest.FieldMask.GEOMETRY);
        
        try {
            FindPlaceFromText response = api.await();
            System.out.println(response.candidates.length);
            if(response.candidates.length == 0){
                apiBuilder.shutdown();
                return false;
            }
            user.setLat(response.candidates[0].geometry.location.lat);
            user.setLng(response.candidates[0].geometry.location.lng);
        } catch (Exception ex) {
            ex.printStackTrace();
            apiBuilder.shutdown();
            return false;
        }
        apiBuilder.shutdown();
        return true;
    }
    
    /**
     * Get a List of specific Doctors near the users location
     * @param user the user which wants the doctors
     * @param symptom the symptom of the user
     * @param radius the radius we want to search in
     * @return a list of doctors
     */
    public static ArrayList<doctor> getDoctors(user user, symptom symptom, int radius){
        ArrayList<doctor> doctors = new ArrayList<doctor>();
        GeoApiContext apiBuilder = new GeoApiContext.Builder().apiKey(apiKey).build();
        NearbySearchRequest api = new NearbySearchRequest(apiBuilder);
        
        api.keyword(symptom.getDoctortype());
        api.type(PlaceType.DOCTOR);
        api.radius(radius);
        api.location(new LatLng(user.getLat(), user.getLng()));
        
        try {
            PlacesSearchResponse response;
            
            do{
            response = api.await();
            api = new NearbySearchRequest(apiBuilder);
            api.pageToken(response.nextPageToken);
            
            if(response.results.length == 0){
                apiBuilder.shutdown();
                return null;
            }
            for(int i = 0; i < response.results.length; i++){
                doctors.add(new doctor(response.results[i].placeId, response.results[i].name, response.results[i].vicinity));
            }
            if(response.nextPageToken != null){
                TimeUnit.SECONDS.sleep(2);
            }
            }while(response.nextPageToken != null);
            
        } catch (Exception ex) {
            ex.printStackTrace();
            apiBuilder.shutdown();
            return null;
        }
        apiBuilder.shutdown();
        return doctors;
    }  
    
}
