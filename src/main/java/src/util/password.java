/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.util;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.nio.charset.StandardCharsets;
/**
 *
 * Password Class to Hash Password and check also check them
 * Source: https://www.baeldung.com/sha-256-hashing-java
 */
public class password {

    /**
     * Hash a Password with the SHA-256 Hash function
     * @param password
     * @return password as sha256-hash
     */
    public static String getHash(String password){
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(password.getBytes(StandardCharsets.UTF_8));
            return bytesToHex(hash);
        } catch (NoSuchAlgorithmException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    /**
     * Check if the passworts are the same
     * @param password that the user provided
     * @param hash from the database
     * @return true if the password is correct, otherwise false
     */
    public static boolean check(String password, String hash){
        return getHash(password).equals(hash);
    }
    
    /**
     * Convert Bytes to HEX-String
     * @param hash in bytes
     * @return string of hash
     */
    private static String bytesToHex(byte[] hash) {
    StringBuilder hexString = new StringBuilder(2 * hash.length);
    for (int i = 0; i < hash.length; i++) {
        String hex = Integer.toHexString(0xff & hash[i]);
        if(hex.length() == 1) {
            hexString.append('0');
        }
        hexString.append(hex);
    }
    return hexString.toString();
    }
}
