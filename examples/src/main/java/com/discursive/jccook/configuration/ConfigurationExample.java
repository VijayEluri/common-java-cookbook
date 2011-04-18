/* 
 * ========================================================================
 * 
 * Copyright 2005 Tim O'Brien.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * ========================================================================
 */
package com.discursive.jccook.configuration;

import java.net.URL;

import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.ConfigurationFactory;

public class ConfigurationExample {

	public static void main(String[] args) throws Exception  {

		ConfigurationExample example = new ConfigurationExample();

		ConfigurationFactory factory = new ConfigurationFactory();
		URL configURL = example.getClass().getResource("configuration.xml");
		factory.setConfigurationURL( configURL );
		
		Configuration config = factory.getConfiguration();
		
		System.out.println( "Timeout: " + config.getFloat("timeout"));
		System.out.println( "Region: " + config.getString("region"));
		System.out.println( "Name: " + config.getString("name"));
		System.out.println( "Speed: " + config.getInt("speed"));
	}
}
