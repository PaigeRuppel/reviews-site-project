package reviews;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.stereotype.Component;

@Component
public class ReviewRepository {

	// This class should be a @Component so that it can be injected into
	// ReviewsController.
	
	private Map<Long, Review> reviewsMap = new HashMap<>();
	
	
	// It should have a constructor that creates your Review instances and
	// populates an instance variable of type Map<Long, Review> that stores your
	// reviews, using each review's id as the map key.

	
	public ReviewRepository() {
		Review season5Episode1 = new Review (501, "5", "01", "Redemption Part II", "09/23/1991");
		Review season5Episode2 = new Review(502, "5", "02", "Darmok", "09/30/1991");
		Review season5Episode3 = new Review(503, "5", "03", "Ensign Ro", "10/07/1991");
		
		reviewsMap.put(501L, season5Episode1);
		reviewsMap.put(502L, season5Episode2);
		reviewsMap.put(503L, season5Episode3);
	}
	
	// It should have a method with the signature public Collection<Review>
	// findAll() that returns all of your reviews.
	public Collection<Review> findAll() {
		return reviewsMap.values();
	}
	
	// It should have a method with the signature public Review findOne(Long id)
	// that returns the review with the specified id.
	public Review findOne(Long id) {
		return reviewsMap.get(id);
	}
	
}
