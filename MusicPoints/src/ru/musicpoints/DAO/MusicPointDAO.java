package ru.musicpoints.DAO;

import java.sql.SQLException;
import java.util.Collection;

import ru.musicpoints.logic.MapPoint;
import ru.musicpoints.logic.MusicPoint;

public interface MusicPointDAO {
	public void addMusicPoint(MusicPoint musicPoint) throws SQLException;

	public void updateMusicPoint(Long musicPointn_id, MusicPoint musicPoint)
			throws SQLException;

	public MusicPoint getMusicPointById(Long musicPoint_id) throws SQLException;

	public Collection getAllMusicPoints() throws SQLException;

	public void deleteMusicPoint(MusicPoint musicPoint) throws SQLException;

	public Collection getMusicPointsByMapPoint(MapPoint mapPoint)
			throws SQLException;

}
