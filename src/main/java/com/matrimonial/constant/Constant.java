package com.matrimonial.constant;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Constant {
	 @Value("${server.port}")
	    private static String appPort;

	public static String getAppPort() {
		return appPort;
	}

	public void setAppPort(String appPort) {
		this.appPort = appPort;
	}
	 
	 
	 
}
