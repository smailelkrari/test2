package modele;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Interaction {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String interactionId;
	
	private User user;
	
	// interaction type 
	private Like interactionTypeLike;
	
	private Like interactionTypeComment;
	
	private Video video;
	
	private Chaine chaine;
	
	private Playlist playlist;
	
	

	public Interaction( User user, Like interactionType,
			Video video, Chaine chaine, Playlist playlist) {
		super();
		
		this.user = user;
		this.interactionTypeLike = interactionType;
		//depending on the interaction type 
		//instanciate a method of on of the members
		/*
		 * if interaction type = like
		 * video.liked();
		 * 
		 */
		this.video = video;
		this.chaine = chaine;
		this.playlist = playlist;
	}
	
	//interaction like
	public Interaction(User user,Video video, Like interactionType){
		this.user = user;
		this.video = video;
		this.interactionTypeLike = interactionType;
		video.liked();
		
	}
	// interaction comment
	public Interaction(User user, Video video, String comment) {
		// TODO Auto-generated constructor stub
		this.user = user;
		this.video = video;
		video.commented(comment);
		
	}
	//interaction follow
	public Interaction(User user, Chaine channel) {
		// TODO Auto-generated constructor stub
		this.user = user;
		this.chaine = channel;
		channel.followed();
		
	}

	public String getInteractionId() {
		return interactionId;
	}

	public void setInteractionId(String interactionId) {
		this.interactionId = interactionId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Like getInteractionType() {
		return interactionTypeLike;
	}

	public void setInteractionType(Like interactionType) {
		this.interactionTypeLike = interactionType;
	}

	public Video getVideo() {
		return video;
	}

	public void setVideo(Video video) {
		this.video = video;
	}

	public Chaine getChaine() {
		return chaine;
	}

	public void setChaine(Chaine chaine) {
		this.chaine = chaine;
	}

	public Playlist getPlaylist() {
		return playlist;
	}

	public void setPlaylist(Playlist playlist) {
		this.playlist = playlist;
	}
	
	
	
	
	
}
