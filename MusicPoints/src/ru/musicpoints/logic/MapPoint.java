package ru.musicpoints.logic;

import java.util.HashSet;
import java.*;
import java.util.Set;

public class MapPoint extends ModelEntity {
	private String place_x;
	private String place_y;
	private String map_x;
	private String map_y;
	private String link;
	private Set musicPoints = new HashSet();
	public String getPlace_x() {
		return place_x;
	}
	public void setPlace_x(String place_x) {
		this.place_x = place_x;
	}
	public String getPlace_y() {
		return place_y;
	}
	public void setPlace_y(String place_y) {
		this.place_y = place_y;
	}
	public String getMap_x() {
		return map_x;
	}
	public void setMap_x(String map_x) {
		this.map_x = map_x;
	}
	public String getMap_y() {
		return map_y;
	}
	public void setMap_y(String map_y) {
		this.map_y = map_y;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public Set getMusicPoints() {
		return musicPoints;
	}
	public void setMusicPoints(Set musicPoints) {
		this.musicPoints = musicPoints;
	}


}
