package ru.musicpoints.logic;

import java.util.HashSet;
import java.util.Set;

public class MusicPoint {
	private int id;
	private int ration;
	private String name;
	private String address;
	private String description;
	private String prices;
	private String equipment;
	private String contacts;
	private String schedule;
	private boolean active;
	private Set reviews = new HashSet();
	private Set photos = new HashSet();
	private Set videous = new HashSet();
	private Set users = new HashSet();
	private Set metroStations = new HashSet();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRation() {
		return ration;
	}

	public void setRation(int ration) {
		this.ration = ration;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPrices() {
		return prices;
	}

	public void setPrices(String prices) {
		this.prices = prices;
	}

	public String getEquipment() {
		return equipment;
	}

	public void setEquipment(String equipment) {
		this.equipment = equipment;
	}

	public String getContacts() {
		return contacts;
	}

	public void setContacts(String contacts) {
		this.contacts = contacts;
	}

	public String getSchedule() {
		return schedule;
	}

	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Set getReviews() {
		return reviews;
	}

	public void setReviews(Set reviews) {
		this.reviews = reviews;
	}

	public Set getPhotos() {
		return photos;
	}

	public void setPhotos(Set photos) {
		this.photos = photos;
	}

	public Set getVideous() {
		return videous;
	}

	public void setVideous(Set videous) {
		this.videous = videous;
	}

	public Set getUsers() {
		return users;
	}

	public void setUsers(Set users) {
		this.users = users;
	}

	public Set getMetroStations() {
		return metroStations;
	}

	public void setMetroStations(Set metroStations) {
		this.metroStations = metroStations;
	}
}
