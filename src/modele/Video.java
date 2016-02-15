package modele;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Video implements Interactionnable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long videoId;
	private String title;
	private Integer lenght;
	
	//the number of likes
	private Integer nbrLikes;
	//number of dislikes
	
	
	
	private String lastComment;
	
	//the comments
	
	public Integer getNbrLikes() {
		return nbrLikes;
	}

	public void setNbrLikes(Integer nbrLikes) {
		this.nbrLikes = nbrLikes;
	}

	public Long getVideoId() {
		return videoId;
	}

	public void setVideoId(Long videoId) {
		this.videoId = videoId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getLenght() {
		return lenght;
	}

	public void setLenght(Integer lenght) {
		this.lenght = lenght;
	}

	
	
	public Video(String title, Integer lenght) {
		super();
		this.title = title;
		this.lenght = lenght;
		this.nbrLikes =0;
		this.lastComment = null;
	}

	@Override
	public void commented(String comment) {
		// TODO Auto-generated method stub
		lastComment = comment;
	}

	@Override
	public void liked() {
		// TODO Auto-generated method stub
		nbrLikes++;
	}

	@Override
	public void followed() {
		// TODO Auto-generated method stub
		
	}

	

	
	
}
