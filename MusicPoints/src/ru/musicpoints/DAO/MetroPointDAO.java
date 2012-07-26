package ru.musicpoints.DAO;

import java.sql.SQLException;
import java.util.Collection;

import ru.musicpoints.logic.Bookmark;
import ru.musicpoints.logic.MetroPoint;
import ru.musicpoints.logic.MetroStation;
import ru.musicpoints.logic.MusicPoint;

public interface MetroPointDAO {
	public void addBookmark(MetroPoint metroPoint) throws SQLException;

	public void updateMetroPoint(Long metroPoint_id, MetroPoint metroPoint)
			throws SQLException;

	public Bookmark getMetroPointById(Long metroPoint_id) throws SQLException;

	public Collection getAllMetroPoints() throws SQLException;

	public void deleteMetroPoint(MetroPoint metroPoint) throws SQLException;

	public Collection getMusicPointsByMetroStation(MetroStation metroStation)
			throws SQLException;

	public Collection getMetroStationsByMusicPoint(MusicPoint musicPoint) throws SQLException;
}
