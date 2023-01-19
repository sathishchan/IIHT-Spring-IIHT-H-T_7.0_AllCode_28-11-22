package com.user.model;

import java.util.Dictionary;
import java.util.Map;

public class Responseobject {

	private String status;
	private String statuscode;
//	private Dictionary<Object,Object> responseData;
//	private Long id;
	
	public Responseobject(String status, String statuscode) {
		super();
		this.status = status;
		this.statuscode = statuscode;
//		this.responseData = responseData;
	}
	
	public Responseobject() {
		super();
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatuscode() {
		return statuscode;
	}

	public void setStatuscode(String statuscode) {
		this.statuscode = statuscode;
	}
	
	
}
