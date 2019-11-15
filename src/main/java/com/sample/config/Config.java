/**
 * 
 */
package com.sample.config;

import java.util.ArrayList;
import java.util.List;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author user
 *
 */
@ConfigurationProperties(prefix = "my")
public class Config {
	private List<String> servers = new ArrayList<String>();

	public List<String> getServers() {
		return this.servers;
	}
}