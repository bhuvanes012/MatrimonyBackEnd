package com.matrimonial.model;
public class ApiResponse {
    private String message;
    private Object responseData; // Change to Object instead of a generic type

    // Constructors
    public ApiResponse() {}

    public ApiResponse(String message, Object responseData) {
        this.message = message;
        this.responseData = responseData;
    }

    // Getters and Setters
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getResponseData() {
        return responseData;
    }

    public void setResponseData(Object responseData) {
        this.responseData = responseData;
    }
}
