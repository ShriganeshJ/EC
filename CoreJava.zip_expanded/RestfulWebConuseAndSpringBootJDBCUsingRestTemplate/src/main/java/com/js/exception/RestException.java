package com.js.exception;

import java.io.IOException;

import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.web.client.ResponseErrorHandler;

public class RestException implements ResponseErrorHandler {

	@Override
	public boolean hasError(ClientHttpResponse response) throws IOException {
		
		
	        boolean hasError = false;
	        int rawStatusCode = response.getRawStatusCode();
	        if (rawStatusCode != 200){
	            hasError = true;
	        }
	        return hasError;
		
		
		
	}

	@Override
	public void handleError(ClientHttpResponse response) throws IOException {
		
		System.out.println("Sending......Mail Tooooo Client.......Data Not Found.....");
		
		
     
	}

}
