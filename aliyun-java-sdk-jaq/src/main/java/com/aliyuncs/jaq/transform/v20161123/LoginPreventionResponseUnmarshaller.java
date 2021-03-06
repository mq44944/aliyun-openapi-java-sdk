/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.jaq.transform.v20161123;

import com.aliyuncs.jaq.model.v20161123.LoginPreventionResponse;
import com.aliyuncs.jaq.model.v20161123.LoginPreventionResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class LoginPreventionResponseUnmarshaller {

	public static LoginPreventionResponse unmarshall(LoginPreventionResponse loginPreventionResponse, UnmarshallerContext context) {
		
		loginPreventionResponse.setErrorCode(context.integerValue("LoginPreventionResponse.ErrorCode"));
		loginPreventionResponse.setErrorMsg(context.stringValue("LoginPreventionResponse.ErrorMsg"));

		Data data = new Data();
		data.setFnalDecision(context.integerValue("LoginPreventionResponse.Data.FnalDecision"));
		data.setEventId(context.stringValue("LoginPreventionResponse.Data.EventId"));
		data.setUserId(context.stringValue("LoginPreventionResponse.Data.UserId"));
		data.setFinalScore(context.integerValue("LoginPreventionResponse.Data.FinalScore"));
		data.setFinalDesc(context.stringValue("LoginPreventionResponse.Data.FinalDesc"));
		data.setDetail(context.stringValue("LoginPreventionResponse.Data.Detail"));
		data.setCaptchaCheckData(context.stringValue("LoginPreventionResponse.Data.CaptchaCheckData"));
		loginPreventionResponse.setData(data);
	 
	 	return loginPreventionResponse;
	}
}