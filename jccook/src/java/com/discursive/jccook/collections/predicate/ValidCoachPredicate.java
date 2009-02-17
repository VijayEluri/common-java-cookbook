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
package com.discursive.jccook.collections.predicate;

import org.apache.commons.collections.Predicate;

public class ValidCoachPredicate implements Predicate {

	public boolean evaluate(Object object) {
		boolean validCoach = false;
		Team team = (Team) object;
		if( team.getCoach() != null && 
			team.getCoach().getFirstName() != null &&
			team.getCoach().getLastName() != null ) {
			validCoach = true;
		}
		return validCoach;
	}

}
