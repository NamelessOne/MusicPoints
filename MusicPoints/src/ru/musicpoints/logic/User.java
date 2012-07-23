package ru.musicpoints.logic;

import java.util.HashSet;
import java.util.Set;

public class User {
	private int id;
	private String name;
	private String email;
	private String about;
	private int show_contacts;
	private int user_picture_id;
	private Set reviews = new HashSet();
	private Set musicPoints = new HashSet();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public int getUser_picture_id() {
		return user_picture_id;
	}

	public void setUser_picture_id(int user_picture_id) {
		this.user_picture_id = user_picture_id;
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
}
