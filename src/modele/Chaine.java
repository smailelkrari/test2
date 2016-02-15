package modele;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Chaine implements Interactionnable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long channelId;
	
	//The channel owner
	@OneToOne
	private User channelOwner;

	//The channel playlists
	@OneToMany
	private List<Playlist> channelPlaylists;
	
	// The channel videos that are not included in a playlist
	@OneToMany
	private List<Video> channelVideos;
	
	//the number of followers
	private int nbrFollowers;
	/*
	//the channel followers
	@OneToMany
	private List<User> channelFollowers;*/
	//add a list of interactions corressponding to the channel
	
	

	@Override
	public void liked() {
		// TODO Auto-generated method stub
		
	}

	public Chaine(User channelOwner) {
		super();
		this.channelOwner = channelOwner;
		this.nbrFollowers = 0;
	}

	public int getNbrFollowers() {
		return nbrFollowers;
	}

	public void setNbrFollowers(int nbrFollowers) {
		this.nbrFollowers = nbrFollowers;
	}

	@Override
	public void followed() {
		// TODO Auto-generated method stub
		nbrFollowers++;
	}

	@Override
	public void commented(String comment) {
		// TODO Auto-generated method stub
		
	}
	
 

}
