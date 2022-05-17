package com.sheri.wms.dto;

public class UserDto {

	private String userName;
	private String firstName;
	private String lastName;
	private String password;
	public UserDto(String userName, String firstName, String lastName)
	{
		this.userName=userName;
		this.firstName=firstName;
		this.lastName=lastName;
	}
	public UserDto()
	{
		
	}
	public String getUserName() 
	{
		return userName;
	}
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
