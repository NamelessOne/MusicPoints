package ru.musicpoints.DAO;

import java.sql.SQLException;
import java.util.Collection;

import ru.musicpoints.logic.Bookmark;
import ru.musicpoints.logic.User;

public interface UserDAO {
	public void addUser(User user) throws SQLException;

	public void updateUser(Long user_id, User user) throws SQLException;

	public User getUserkById(Long user_id) throws SQLException;

	public Collection getAllUsers() throws SQLException;

	public void deleteUser(User user) throws SQLException;
}
