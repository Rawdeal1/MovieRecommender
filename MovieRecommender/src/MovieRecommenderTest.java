import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MovieRecommenderTest {
	RecommenderAPI movieR;
	@Before
	public void setup() throws Exception
	{
		movieR = new MovieRecommender();
	}
	
	@After
	public void tearDown()
	{
		movieR = null;
	}
	
	@Test
	public void testAddUser() 
	{
		assertEquals(5,movieR.getUsers().size());
		User test = new User("Joe","Blogs",88,"M","Programmer",6);
		movieR.addUser("Joe","Blogs",88,"M","Programmer",6);		
		assertEquals(6,movieR.getUsers().size());
		assertEquals(test,movieR.getUsers().get(5));
	}
	
	@Test
	public void testRemoveUser()
	{
		assertEquals(5,movieR.getUsers().size());
		movieR.addUser("Joe","Blogs",88,"M","Programmer",6);
		assertEquals(6,movieR.getUsers().size());
		movieR.removeUser(6);
		assertEquals(5,movieR.getUsers().size());		
	}
	
	@Test
	public void testAddMovie() 
	{
		assertEquals(9,movieR.getMovies().size());
		Movie test = new Movie(10,"movie1","2000" ,"website.com","1","1","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0");
		movieR.addMovie(10,"movie1","2000" ,"website.com","1","1","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0");		
		assertEquals(10,movieR.getMovies().size());
		assertEquals(test,movieR.getMovies().get(9));
	}
	
	@Test
	public void testAddRating() 
	{
		assertEquals(50,movieR.getRatings().size());
		Rating test = new Rating(55, 1, 5);
		movieR.addRating(55, 1, 5);		
		assertEquals(51,movieR.getRatings().size());
		assertEquals(test,movieR.getRatings().get(50));
	}
	
	@Test
	public void testTopTenMovies() throws Exception
	{
		Set<Integer> t = new HashSet<Integer>();
		t.add(1);
		t.add(2);
		t.add(3);
		t.add(5);
		t.add(10);

		assertEquals(t, movieR.getTopTenMovies(1));
	}

	@Test
	public void testUserReccomendations() throws Exception
	{
		Set<Integer> t = new HashSet<Integer>();
		t.add(1);
		t.add(2);
		t.add(3);
		t.add(7);
		t.add(10);
		assertEquals(t , movieR.getUserRecommendations(1));
	}

}
