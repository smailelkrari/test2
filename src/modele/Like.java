package modele;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class Like {

	//id
	//value
	//user
	//video 
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String likeId;
	
	//-1 if its a dislike 1 if its a like
	private int value;

	public Like(int value) {
		super();
		this.value = value;
	}

}
