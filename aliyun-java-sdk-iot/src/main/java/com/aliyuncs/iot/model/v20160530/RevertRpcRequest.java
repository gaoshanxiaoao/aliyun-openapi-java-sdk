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
package com.aliyuncs.iot.model.v20160530;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class RevertRpcRequest extends RpcAcsRequest<RevertRpcResponse> {
	
	public RevertRpcRequest() {
		super("Iot", "2016-05-30", "RevertRpc");
	}

	private Long productKey;

	private String deviceName;

	private String rpcContent;

	private Integer timeOut;

	public Long getProductKey() {
		return this.productKey;
	}

	public void setProductKey(Long productKey) {
		this.productKey = productKey;
		putQueryParameter("ProductKey", productKey);
	}

	public String getDeviceName() {
		return this.deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
		putQueryParameter("DeviceName", deviceName);
	}

	public String getRpcContent() {
		return this.rpcContent;
	}

	public void setRpcContent(String rpcContent) {
		this.rpcContent = rpcContent;
		putQueryParameter("RpcContent", rpcContent);
	}

	public Integer getTimeOut() {
		return this.timeOut;
	}

	public void setTimeOut(Integer timeOut) {
		this.timeOut = timeOut;
		putQueryParameter("TimeOut", timeOut);
	}

	@Override
	public Class<RevertRpcResponse> getResponseClass() {
		return RevertRpcResponse.class;
	}

}
