/**
 * 
 */
package com.sample.model;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author user
 *
 */
public class Base {

	@Autowired
	private Integer id;

	@Autowired
	private String userName;

	@Autowired
	private String password;
}
