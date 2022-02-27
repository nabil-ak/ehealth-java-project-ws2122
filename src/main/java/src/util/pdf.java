/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.util;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import java.io.File;
import java.io.FileOutputStream;
import src.models.user;
/**
 *
 * Pdf Class used to export the Profil
 */
public class pdf {

    /**
     * The current Font
     */
    private  BaseFont baseFont;

    /**
     * Create an PDF
     * @param user the user to export
     * @param pdf the file location
     * @return true if the file was successfully created, otherwise false
     */
    public boolean create(user user, File pdf){
        try {
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream(pdf));
            document.open();
            baseFont = BaseFont.createFont("/assets/font/CircularStd-Bold.otf", BaseFont.WINANSI, BaseFont.EMBEDDED);
                
            Image img = Image.getInstance(getClass().getResource("/assets/img/appicon-90x90.png")); 
            img.setAbsolutePosition(40, 760);
            img.scaleAbsolute(50, 50);
            document.add(img);
            
            Font fontHEADER = new Font(baseFont, 20);
            Paragraph p = new Paragraph("Profil", fontHEADER);
            p.setAlignment(Element.ALIGN_CENTER);
            document.add(p);
            document.add( Chunk.NEWLINE );
            
            PdfPTable table = new PdfPTable(2);
            addRows(table, "Firstname", user.getFirstname());
            addRows(table, "Lastname", user.getLastname());
            addRows(table, "Street and Housenumber", user.getStreet()+". "+user.getHousenumber());
            addRows(table, "Zipcode and City", user.getZipcode()+"  "+user.getCity());
            addRows(table, "Email", user.getEmail());
            addRows(table, "Gender", user.getGender());
            addRows(table, "Date of Birth", String.valueOf(user.getDateofbirth().getDayOfMonth())+"."+String.valueOf(user.getDateofbirth().getMonthValue())+"."+String.valueOf(user.getDateofbirth().getYear()));
            addRows(table, "Insurancename", user.getInsurancename());
            addRows(table, "Insurancetype", user.getInsurancetype());
            addRows(table, "Health Information", user.getHealthinformation());
            document.add(table);
            
            document.close();
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
        return true;
    }
    
    /**
     * Add rows to the PDF-Table
     * @param table 
     * @param first first colum
     * @param second second colum
     */
    private void addRows(PdfPTable table, String first, String second){
        Font fontFirst = new Font(baseFont, 16);
        Font fontSecond = new Font(baseFont, 13);
        table.addCell(new PdfPCell(new Phrase(first,fontFirst)));
        table.addCell(new PdfPCell(new Phrase(second,fontSecond)));
    }
}
