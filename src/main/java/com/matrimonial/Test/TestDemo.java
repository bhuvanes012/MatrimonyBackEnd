package com.matrimonial.Test;

import java.io.File;

import com.matrimonial.utility.ImageConvertor;

public class TestDemo {

	public static void main(String[] args) {
		String base64String = "iVBORw0KGgoAAAANSUhEUgAAAAEAAAABCAQAAAC1HAwCAAAAC0lEQVR42mP8/wcAAgAB/AE2fLIAAAAASUVORK5CYII=";
        
		ImageConvertor.convertBase64ToImage(base64String, "out.png");
		String projectPath = System.getProperty("user.dir");
		System.out.println("Current project path: " + projectPath);
		
		// Specify the path where you want to create the folder
        String parentPath = "http://127.0.0.1:80";
        String folderName = "testFolder"; // Folder name


        File folder = new File(parentPath + File.separator + folderName);

        if (!folder.exists()) {
            try {
                boolean created = folder.mkdirs();
                if (created) {
                    System.out.println("Folder created successfully at: " + folder.getPath());
                } else {
                    System.out.println("Failed to create folder due to an unknown issue.");
                }
            } catch (SecurityException e) {
                System.out.println("Failed to create folder due to a security exception: " + e.getMessage());
            }
        } else {
            System.out.println("Folder already exists at: " + folder.getPath());
        }
	}
}
