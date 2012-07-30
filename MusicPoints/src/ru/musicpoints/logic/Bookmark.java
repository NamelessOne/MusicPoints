package ru.musicpoints.logic;

public class Bookmark extends ModelEntity {
	private int user_id;
	private int music_point_id;

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public int getMusic_point_id() {
		return music_point_id;
	}

	public void setMusic_point_id(int music_point_id) {
		this.music_point_id = music_point_id;
	}
}
