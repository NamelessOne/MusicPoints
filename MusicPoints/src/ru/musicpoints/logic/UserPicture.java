package ru.musicpoints.logic;

import java.util.HashSet;
import java.util.Set;

public class UserPicture {
	private int id;
	private String file_name;
	private Set users = new HashSet();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFile_name() {
		return file_name;
	}

	public void setFile_name(String file_name) {
		this.file_name = file_name;
	}

	public Set getUsers() {
		return users;
	}

	public void setUsers(Set users) {
		this.users = users;
	}
}
