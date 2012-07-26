package ru.musicpoints.DAO;

import java.sql.SQLException;
import java.util.Collection;

import ru.musicpoints.logic.MusicPoint;
import ru.musicpoints.logic.Video;

public interface VideoDAO {
	public void addVideo(Video video) throws SQLException;

	public void updateVideo(Long video_id, Video video) throws SQLException;

	public Video getVideoById(Long video_id) throws SQLException;

	public Collection getAllVideous() throws SQLException;

	public void deleteVideo(Video video) throws SQLException;

	public Collection getVideousByMusicPoint(MusicPoint musicPoint)
			throws SQLException;
}
