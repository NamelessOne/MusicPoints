package ru.musicpoints.DAO;

import java.sql.SQLException;
import java.util.Collection;

import ru.musicpoints.logic.MusicPoint;
import ru.musicpoints.logic.Review;
import ru.musicpoints.logic.User;

public interface ReviewDAO {
	public void addReview(Review review) throws SQLException;

	public void updateReview(Long review_id, Review review) throws SQLException;

	public Review getReviewById(Long review_id) throws SQLException;

	public Collection getAllReviews() throws SQLException;

	public void deleteReview(Review review) throws SQLException;

	public Collection getReviewsByMusicPoint(MusicPoint musicPoint)
			throws SQLException;

	public Collection getReviewsByUser(User user) throws SQLException;
}
