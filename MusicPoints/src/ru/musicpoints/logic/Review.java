package ru.musicpoints.logic;

import java.sql.Date;

public class Review extends ModelEntity {
	private int user_id;
	private Date date;
	private String text;
	private int mark;
	private int music_point_id;

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	public int getMusic_point_id() {
		return music_point_id;
	}

	public void setMusic_point_id(int music_point_id) {
		this.music_point_id = music_point_id;
	}
}
