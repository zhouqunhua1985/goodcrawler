/**
 * ########################  SHENBAISE'S WORK  ##########################
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.sbs.goodcrawler.exception;

/**
 * @author whiteme
 * @date 2013年10月20日
 * @desc 
 */
public class ExtractException extends Exception{

	private static final long serialVersionUID = 7761968909463699377L;

	public ExtractException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public ExtractException(String arg0) {
		super(arg0);
	}
	
}
