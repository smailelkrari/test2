package modele;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Comment {
	//id
		//value
		//user
		//video 
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String commentId;
	
	//the core of the comment
	private String comment;

	public Comment(String comment) {
		super();
		this.comment = comment;
	}
}
