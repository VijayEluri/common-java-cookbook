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
package com.discursive.jccook.lang.builders.reflect;

// START lang-ex-1
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

// START lang_tostring_solution
import org.apache.commons.lang.builder.ReflectionToStringBuilder;
// OMIT lang_tostring_solution
import com.discursive.jccook.lang.builders.State;

public class PoliticalCandidate {

	private String lastName;
	private String firstName;
	private Date dateOfBirth;
	private BigDecimal moneyRaised;
	private State state;

	public PoliticalCandidate() {
	}

	public PoliticalCandidate(String lastName, String firstName,
			Date dateOfBirth, BigDecimal moneyRaised, State state) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.dateOfBirth = dateOfBirth;
		this.moneyRaised = moneyRaised;
		this.state = state;
	}

	// get/set methods are omitted for brevity...
// END OMIT lang_tostring_solution
	public String toString() {
		return ReflectionToStringBuilder.reflectionToString(this);
	}
// END lang_tostring_solution
	// OMIT lang-ex-1
	public static void main(String[] args) {
		// START lang-ex-sample-1
		// Create a State
		State va = new State("VA", "Virginia");

		// Create a Birth Date
		Calendar calendar = new GregorianCalendar();
		calendar.set(Calendar.YEAR, 1743);
		calendar.set(Calendar.MONTH, Calendar.APRIL);
		calendar.set(Calendar.DAY_OF_MONTH, 13);
		Date dob = calendar.getTime();

		BigDecimal moneyRaised = new BigDecimal(293829292.93);

		// Create a Political Candidate
		PoliticalCandidate candidate = new PoliticalCandidate("Jefferson",
				"Thomas", dob, moneyRaised, va);

		System.out.println(candidate);
		// END lang-ex-sample-1
	}
	// END OMIT lang-ex-1
}
// END lang-ex-1
