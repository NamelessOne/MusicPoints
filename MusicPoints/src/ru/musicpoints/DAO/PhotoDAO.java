package ru.musicpoints.DAO;

import java.sql.SQLException;
import java.util.Collection;

import ru.musicpoints.logic.MusicPoint;
import ru.musicpoints.logic.Photo;

public interface PhotoDAO {
	public void addPhoto(Photo photo) throws SQLException;

	public void updatePhoto(Long photo_id, Photo photo) throws SQLException;

	public Photo getPhotoById(Long photo_id) throws SQLException;

	public Collection getAllPhotos() throws SQLException;

	public void deleteMusicPoint(Photo photo) throws SQLException;

	public Collection getPhotosByMusicPoint(MusicPoint musicPoint)
			throws SQLException;

}
