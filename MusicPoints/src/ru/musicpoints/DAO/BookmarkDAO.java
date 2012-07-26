package ru.musicpoints.DAO;

import java.sql.SQLException;
import java.util.Collection;

import ru.musicpoints.logic.Bookmark;
import ru.musicpoints.logic.MusicPoint;
import ru.musicpoints.logic.User;

public interface BookmarkDAO {
	public void addBookmark(Bookmark bookmark) throws SQLException;

	public void updateBookmarks(Long bookmark_id, Bookmark bookmark)
			throws SQLException;

	public Bookmark getBookmarkById(Long bookmark_id) throws SQLException;

	public Collection getAllBookmarks() throws SQLException;

	public void deleteBookmark(Bookmark t_class) throws SQLException;

	public Collection getUsersByMusicPoint(MusicPoint musicPoint)
			throws SQLException;

	public Collection getMusicPointsByUser(User user) throws SQLException;
}
