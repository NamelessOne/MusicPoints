package ru.musicpoints.logic;

import java.util.HashSet;
import java.util.Set;

public class User extends ModelEntity {
	private String name;
	private String email;
	private String about;
	private String user_pic_file;
	private int show_contacts;
	private Set reviews = new HashSet();
	private Set musicPoints = new HashSet();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public int getShow_contacts() {
		return show_contacts;
	}

	public void setShow_contacts(int show_contacts) {
		this.show_contacts = show_contacts;
	}

	public Set getReviews() {
		return reviews;
	}

	public void setReviews(Set reviews) {
		this.reviews = reviews;
	}

	public Set getMusicPoints() {
		return musicPoints;
	}

	public void setMusicPoints(Set musicPoints) {
		this.musicPoints = musicPoints;
	}

	public String getUser_pic_file() {
		return user_pic_file;
	}

	public void setUser_pic_file(String user_pic_file) {
		this.user_pic_file = user_pic_file;
	}
}
