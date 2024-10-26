package com.matrimonial.utility;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;

public class ImageConvertor {
	
	
	
	 public static void convertBase64ToImage(String base64String, String outputFilePath) {
	        // Decode Base64 string to byte array
	        byte[] imageBytes = Base64.getDecoder().decode(base64String);

	        try (FileOutputStream fos = new FileOutputStream(outputFilePath)) {
	            // Write byte array to file
	            fos.write(imageBytes);
	            System.out.println("Image saved successfully to " + outputFilePath);
	        } catch (IOException e) {
	            System.out.println("Error saving image: " + e.getMessage());
	        }
	    }

}
