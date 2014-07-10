/*
 * Copyright 2014 Nastel Technologies, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.nastel.jkool.tnt4j.core;

import java.util.Map;

/**
 * <p>
 * This interface defines a way to obtain and reset statistics.
 * </p>
 *
 * @version $Revision: 7 $
 *
 */
public interface VarStats {
	/**
	 * Obtain all available statistics
	 * 
	 * @return a map of key/value statistic pairs
	 */
	public Map<String, Object> getStats();

	/**
	 * Reset all statistics to their initial values.
	 * All counters are set to 0.
	 * 
	 */
	public void resetStats();
}
