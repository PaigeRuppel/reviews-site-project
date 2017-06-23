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
		Review season5Episode1 = new Review(501, "5", "01", "Redemption Part II", "09/23/1991");
		season5Episode1.setDescription(
				"The season opener continues a two-part episode focused on a civil war that has broken out within the Klingon Empire. "
				+ "Leuitenant Worf fights on the side of the Gowrons against the Duras clan. Captain Picard and the Enterprise investigate possible Romulan interference in the conflict and must thwart a Romulan ploy to overtake the Vulcan empire. "
				+ "Favorite part: Data learns the Vulcan nerve pinch and gains a measured nod of approval from none other than Spock.");
		season5Episode1.setReviewRating("5 Stars");
		season5Episode1.setImageUrl("/static/images/pv501.jpg");
		Review season5Episode2 = new Review(502, "5", "02", "Darmok", "09/30/1991");
		season5Episode2.setDescription("Lorem ipsum blah blah blah Favorite part: Riker's dumbfounded face when Picard saves the day in garbled alien metaphor speak.");
		season5Episode2.setReviewRating("4 Stars");
		season5Episode2.setImageUrl("/static/images/pv502.jpg");
		Review season5Episode3 = new Review(503, "5", "03", "Ensign Ro", "10/07/1991");
		season5Episode3.setDescription("Lorem ipsum blah blah blah");
		season5Episode3.setReviewRating("4 Stars");
		season5Episode3.setImageUrl("/static/images/pv503.jpg");
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
