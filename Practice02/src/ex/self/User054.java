package ex.self;

import java.util.Date;

public class User054 {
	
	private String nickname;
	private String password;
	private String firstname;
	private String lastname;
	private String email;
	private Date created;

	public User054(String nickname, String password, String firstname, String lastname, String email) {
		super();
		this.nickname = nickname;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.created = new Date();
	}

	public String getNickname() {
		return nickname;
	}

	public String getPassword() {
		return password;
	}
	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public String getEmail() {
		return email;
	}

	public Date getCreated() {
		return created;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setCreated(Date created) {
		this.created = created;
	}
	
	@Override
	public String toString() {
		return "User{" + "nickname=" + nickname + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email + ", created=" + created + '}'; 
	}


}
