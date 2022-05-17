package com.sheri.wms.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="wm_user")

public class UserEntity extends BaseEntity  
{
		@Id
	    @Column(name="user_name")
		private String username;
		@Column(name="password")
		private String password;
		@Column(name="first_name")
		private String firstname;
		@Column(name="last_name")
		private String lastname;
		
		public String getUsername()
		{
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getFirstname() {
			return firstname;
		}
		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}
		public String getLastname() {
			return lastname;
		}
		public void setLastname(String lastname) {
			this.lastname = lastname;
		}
		
		
		
}
