package com.eudi;

import java.io.Serializable;
import java.util.Date;

/**
 * @author <a href="mailto:zlex.dongliang@gmail.com">梁栋</a>
 * @since 1.0
 */
public class User implements Serializable {

	private static final long serialVersionUID = 5590768569302443813L;
	private String username;
	private Date birthday;
	private int age;

	/**
	 * @param username
	 * @param birthday
	 */
	public User(String username, Date birthday) {
		this.username = username;
		this.birthday = birthday;
	}

	// 省略
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return String.format("%s\t%s\t", username, birthday);
	}
}