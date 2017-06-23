package reviews;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//This class should be a @Controller.

@Controller
public class ReviewsController {


	// It should inject ReviewRepository as a @Resource.
	@Resource
	private ReviewRepository revRep;
	

	// It should have a method mapped to a url that puts all of your reviews
	// into the model, forwarding to a "reviews" template.
	@RequestMapping("/reviews")
	public String fetchReviews(Model model) {

		model.addAttribute("reviewsAsCollection", revRep.findAll());
		return "reviewIteration";
	}
	
//	private Map<>
	
//	@RequestMapping("/reviews")
//	public String fetchIds(Long id){
//		
	
	// It should have a method mapped to a url including an id parameter that
	// puts one of your reviews into the model, forwarding to a "review"
	// template. This method should expect an "id" query parameter in order to
	// select a specific review.
}
