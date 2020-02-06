package com.glarimy.cmad;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class User {
	@Id
	private String uid;
	private List<String> devices;

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public List<String> getDevices() {
		return devices;
	}

	public void setDevices(List<String> devices) {
		this.devices = devices;
	}

	@Override
	public String toString() {
		return "Event [uid=" + uid + ", devices=" + devices + "]";
	}

}
