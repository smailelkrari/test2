package modele;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * @author Proprietaire
 *
 */

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String userId;

	@NotNull
	private String userName;

	@NotNull
	private String firstName;

	@NotNull
	private String lastName;

	// for localisation purposes !
	// maybe add a function that gets the adress from the users ip and add this function in the set adresse
	@NotNull
	private String adresse;

	// the age could be important to restrict the access to videos for +18 users
	@NotNull
	private Integer userAge;
	
	// implements validator diapo 41 chartre
	@Pattern(regexp = "[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\."
			+ "[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@"
			+ "(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message = "{invalid.email}")
	private String userMail;

	// store the encrypted password
	@NotNull
	private String hashedPassword;

	// the user's channel
	@OneToOne
	private Chaine userChannel;
	
	// followed channels
	@OneToMany
	private List<Chaine> followedChannels;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String userId, String userName, String firstName,
			String lastName, String adresse, Integer age, String userMail,
			String hashedPassword, Chaine userChannel,
			List<Chaine> followedChannels) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.adresse = adresse;
		this.userAge = age;
		this.userMail = userMail;
		this.hashedPassword = hashedPassword;
		this.userChannel = userChannel;
		this.followedChannels = followedChannels;
	}

	

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public Integer getAge() {
		return userAge;
	}

	public void setAge(Integer age) {
		this.userAge = age;
	}

	public String getUserMail() {
		return userMail;
	}

	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}

	public String getHashedPassword() {
		return hashedPassword;
	}

	public void setHashedPassword(String hashedPassword) {
		this.hashedPassword = hashedPassword;
	}

	public Chaine getUserChannel() {
		return userChannel;
	}

	public void setUserChannel(Chaine userChannel) {
		this.userChannel = userChannel;
	}

	public List<Chaine> getFollowedChannels() {
		return followedChannels;
	}

	public void setFollowedChannels(List<Chaine> followedChannels) {
		this.followedChannels = followedChannels;
	}

	//Instanciating a like interaction
	public Interaction like(Video video, int value){
		Like aime = new Like(value);
		Interaction like = new Interaction(this,video,aime);
		return like;
		
	}
	//the user comments a video
	public Interaction comment(Video video,String comment){
		Comment commentaire = new Comment(comment);
		Interaction commentInteraction = new Interaction(this,video,comment);
		
		return commentInteraction;
		
		
	}
	//the user follows a channe
	public Interaction follow(Chaine channel){
		Interaction followInteraction = new Interaction(this,channel);
		return followInteraction;
		
	}
	
}
