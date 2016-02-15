package modele;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestUser {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	
	@Test
	public void testLike(){
		User userTest = new User();
		Video testVideo = new Video("video test",10);
		Interaction test = userTest.like(testVideo, 1);
		int likes = 1;
		int realLikes = testVideo.getNbrLikes();
		assertEquals("Expected Number of likes 1",likes,realLikes);
		
	}
	@Test
	public void testFollow(){
		//channel owner
		User userTest = new User();
		Chaine testChaine = new Chaine(userTest);
		//channel follower
		User userTest2 = new User();
		Interaction test = userTest2.follow(testChaine);
		int likes = 1;
		int realLikes = testChaine.getNbrFollowers();
		assertEquals("Expected Number of followers 1",likes,realLikes);
		
	}
	@Test
	public void testComment(){
		User userTest = new User();
		Video testVideo = new Video("video test",10);
		Interaction test = userTest.like(testVideo, 1);
		int likes = 1;
		int realLikes = testVideo.getNbrLikes();
		assertEquals("Expected Number of likes 1",likes,realLikes);
		
	}

}
