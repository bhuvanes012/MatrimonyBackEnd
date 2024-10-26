package com.matrimonial.Test;

import com.matrimonial.utility.ImageConvertor;

public class TestDemo {

	public static void main(String[] args) {
		String base64String = "iVBORw0KGgoAAAANSUhEUgAAAAEAAAABCAQAAAC1HAwCAAAAC0lEQVR42mP8/wcAAgAB/AE2fLIAAAAASUVORK5CYII=";
        
		ImageConvertor.convertBase64ToImage(base64String, "out.png");
	
	}
}
