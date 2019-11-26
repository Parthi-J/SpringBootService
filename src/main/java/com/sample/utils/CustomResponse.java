/**
 * 
 */
package com.sample.utils;

import lombok.Getter;
import lombok.Setter;

/**
 * @author user
 *
 */
@Getter
@Setter
public class CustomResponse<T> {

	private String message;
	private T data;
	private Boolean error;

	public CustomResponse(String message, T data) {
		this.message = message;
		this.data = data;
		this.error = false;
	}

	public CustomResponse(String message, T data, Boolean error) {
		this.message = message;
		this.data = data;
		this.error = error;
	}

	public CustomResponse(String message) {
		this.message = message;
		this.data = null;
		this.error = false;
	}

}
