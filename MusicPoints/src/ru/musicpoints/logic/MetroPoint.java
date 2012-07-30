package ru.musicpoints.logic;

public class MetroPoint extends ModelEntity {
	private int metro_station_id;
	private int music_point_id;

	public int getMetro_station_id() {
		return metro_station_id;
	}

	public void setMetro_station_id(int metro_station_id) {
		this.metro_station_id = metro_station_id;
	}

	public int getMusic_point_id() {
		return music_point_id;
	}

	public void setMusic_point_id(int music_point_id) {
		this.music_point_id = music_point_id;
	}

}
