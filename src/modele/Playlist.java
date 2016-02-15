package modele;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Playlist {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long playlistId;
	
	@OneToMany
	private List<Video> playlistVideos;
	
}
