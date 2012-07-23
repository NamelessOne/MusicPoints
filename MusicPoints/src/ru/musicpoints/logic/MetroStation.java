package ru.musicpoints.logic;

import java.util.HashSet;
import java.util.Set;

public class MetroStation {
	private int id;
	private String name;
	private int line;
	private Set metroPoints = new HashSet();

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

	public int getLine() {
		return line;
	}

	public void setLine(int line) {
		this.line = line;
	}

	public Set getMetroPoints() {
		return metroPoints;
	}

	public void setMetroPoints(Set metroPoints) {
		this.metroPoints = metroPoints;
	}
}
