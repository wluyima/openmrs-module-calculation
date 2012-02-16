/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.calculation.provider;

import org.openmrs.calculation.Calculation;

/**
 * A simple {@link CalculationProvider} for testing purposes
 */
public class TestCalculationProvider implements CalculationProvider {
	
	/**
	 * @see org.openmrs.calculation.provider.CalculationProvider#getCalculationInstance(String,
	 *      String)
	 */
	@Override
	public Calculation getCalculationInstance(String calculationName, String configuration) {
		throw new RuntimeException("Not yet implemented");
	}
}
