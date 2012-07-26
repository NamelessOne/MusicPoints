package ru.musicpoints.DAO;

import java.sql.SQLException;
import java.util.Collection;

import ru.musicpoints.logic.MetroStation;

public interface MetroStationDAO {
	public void addMetroStation(MetroStation metroStation) throws SQLException;

	public void updateMetroStation(Long metroStation_id, MetroStation metroStation)
			throws SQLException;

	public MetroStation getMetroStationById(Long metroStation_id) throws SQLException;

	public Collection getAllMetroStations() throws SQLException;

	public void deleteMetroStation(MetroStation metroStation) throws SQLException;
}
