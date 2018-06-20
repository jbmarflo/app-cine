package net.cine.app.model;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Movie {
	
	static final String ACTIVE_STATE = "1";
	static final String INACTIVE_STATE = "0";
	static final String ACTIVE_WORD_STATE = "Activo";
	static final String INACTIVE_WORD_STATE = "Inactivo";
	private int id;
	private String title;
	private int duration;
	private String classification;
	private String type;
	private String image = "cinema.png"; //Image for default
	private Date releaseDate;
	private String state = ACTIVE_STATE;
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the duration
	 */
	public int getDuration() {
		return duration;
	}
	/**
	 * @param duration the duration to set
	 */
	public void setDuration(int duration) {
		this.duration = duration;
	}
	/**
	 * @return the classification
	 */
	public String getClassification() {
		return classification;
	}
	/**
	 * @param classification the classification to set
	 */
	public void setClassification(String classification) {
		this.classification = classification;
	}
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	
	public String stateWord() {
		Map<String, String> states = new HashMap<String, String>();
		states.put(INACTIVE_STATE, INACTIVE_WORD_STATE);
		states.put(ACTIVE_STATE, ACTIVE_WORD_STATE);
		
		return states.get(state);
	}
	
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @return the image
	 */
	public String getImage() {
		return image;
	}
	/**
	 * @param image the image to set
	 */
	public void setImage(String image) {
		this.image = image;
	}
	/**
	 * @return the releaseDate
	 */
	public Date getReleaseDate() {
		return releaseDate;
	}
	/**
	 * @param releaseDate the releaseDate to set
	 */
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Movie [id=" + id + ", title=" + title + ", duration=" + duration + ", classification=" + classification
				+ ", gender=" + type + ", image=" + image + ", releaseDate=" + releaseDate + ", state=" + state + "]";
	}
	
	
	
}
