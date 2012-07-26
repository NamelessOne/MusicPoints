package ru.musicpoints.DAO;

import java.sql.SQLException;
import java.util.Collection;

import ru.musicpoints.logic.MapPoint;


public interface MapPointDAO {
	  public void addMapPoint(MapPoint mapPoint) throws SQLException;
	  public void updateMapPoint(Long mapPoint_id, MapPoint mapPoint) throws SQLException;
	  public MapPoint getMapPointById(Long mapPointy_id) throws SQLException;
	  public Collection getAllMapPoints() throws SQLException;
	  public void deleteMapPoint(MapPoint mapPoint) throws SQLException;
}
