package reviews;

import java.util.ArrayList;
import java.util.Collection;


public class Review {
	
	private long id;  //id will be arbitrary
	private String season;
	private String episodeNumber; // season and episode number
	private String episodeTitle; // episode title
	private String imageUrl;      // this may not be correct?
	private String reviewContent; // review content
	private String description; // brief synopsis of the episode
	private String airDate; // airDate
	private String reviewDate; // reviewDate
	
	Collection<String> tags = new ArrayList<String>(); // this will feature characters, themes, races, etc.
	

	public Review(long id, String season, String episodeNumber, String episodeTitle, String airDate) {
		this.id = id;
		this.season = season;
		this.episodeNumber = episodeNumber;
		this.episodeTitle = episodeTitle;
		this.airDate = airDate;
		description = "blank";
		reviewDate = "today";
	}
	
	public long getId() {
		return id;
	}
	
	public String getSeason() {
		return season;
	}
	
	public String getEpisodeNumber() {
		return episodeNumber;
	}
	
	public String getTitle() {
		return episodeTitle;
	}
	
	public String getAirDate() {
		return airDate;
	}
	
	public String getDescription() {	// brief description/synopsis of episode
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getImageUrl() { // any image url
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	
	
	public String getReviewContent() {	// actual review will live here
		return reviewContent;
	}
	public void setReviewContent(String reviewContent) {
		this.reviewContent = reviewContent;
	}


	public String getReviewDate() {	
		return reviewDate;
	}
	public void setReviewDate(String reviewDate) {
		this.reviewDate = reviewDate;
	}

	public Collection<String> getTags() {
		return tags;
	}
	public void setTags(Collection<String> tags) {
		this.tags = tags;
	}


	

	






	
	

	
	
	
	
}
