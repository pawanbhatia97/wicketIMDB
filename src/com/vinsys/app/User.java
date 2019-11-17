package com.vinsys.app;

import java.io.Serializable;

public class User  implements Serializable{
private String userid;
private String passcode;
public String getUsername() {
	return userid;
}
public void setUsername(String username) {
	this.userid = username;
}
public String getPassword() {
	return passcode;
}
public void setPassword(String password) {
	this.passcode = password;
}

}
