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
package com.discursive.jccook.lang.builders.equals;

import java.math.BigDecimal;
import java.util.Date;

// START lang-ex-2
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
// OMIT lang-ex-2

import com.discursive.jccook.lang.builders.State;

public class PoliticalCandidate {

	private String lastName;
	private String firstName;
	private Date dateOfBirth;
	private BigDecimal moneyRaised;
	private State state;

	public PoliticalCandidate() {}
	public PoliticalCandidate( String lastName, String firstName, Date dateOfBirth,
											   BigDecimal moneyRaised, State state ) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.dateOfBirth = dateOfBirth;
		this.moneyRaised = moneyRaised;
		this.state = state;
	}
	
	public String getLastName() { return lastName; }
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getFirstName() { return firstName; }
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public Date getDateOfBirth() { return dateOfBirth; }
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public BigDecimal getMoneyRaised() { return moneyRaised; }
	public void setMoneyRaised(BigDecimal moneyRaised) {
		this.moneyRaised = moneyRaised;
	}
	
	public State getState() { return state; }
	public void setState(State state) {
		this.state = state;
	}

	// END OMIT lang-ex-2
    // Member variables - omitted for brevity

    // Constructors - omitted for brevity

    // get/set methods - omitted for brevity
	
	// A hashCode which creates a hash from the two unique identifiers
    public int hashCode( ) {
        return new HashCodeBuilder(17, 37)
                       .append(firstName)
                       .append(lastName).toHashCode( );
    }

    // An equals which compares two unique identifiers
    public boolean equals(Object o) {
        boolean equals = false;
        if ( o != null && 
            PoliticalCandidate.class.isAssignableFrom(o.getClass()) ) {
            PoliticalCandidate pc = (PoliticalCandidate) o;
            equals = (new EqualsBuilder( )
                       .append(firstName, pc.firstName)
                       .append(lastName, pc.lastName)).isEquals( );
        }
        return equals;
    }
// END lang-ex-2
    
	
}
