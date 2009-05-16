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
package com.discursive.jccook.httpclient;

import java.io.IOException;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.methods.GetMethod;

public class GetExample {

	public static void main(String[] args) {
		HttpClient client = new HttpClient();
		String url = "http://www.discursive.com/jccook/";
		HttpMethod method = new GetMethod( url );
	
		try {
			client.executeMethod( method );
			String response = method.getResponseBodyAsString();

			System.out.println( response );
		} catch( HttpException he ) {
			System.out.println( "HTTP Problem: " + he.getMessage() );
		} catch( IOException ioe ) {
			System.out.println( "IO Exeception: " + ioe.getMessage() );
		} finally {
			method.releaseConnection();
			method.recycle();
		}
	}
}
