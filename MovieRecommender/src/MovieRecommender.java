import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
public class MovieRecommender implements RecommenderAPI {
	public ArrayList<Movie> movie;
	public ArrayList<User> user;
	public ArrayList<Rating> ratingArray;
	private static Scanner input;
	public int movieId = 0;
	
	public MovieRecommender() {
		movie = new ArrayList<Movie>();
		user = new ArrayList<User>();
		ratingArray = new ArrayList<Rating>();
		
	}
	
	 void readInUser() throws FileNotFoundException
	{
		input = new Scanner(System.in);
	    File userFile = new File("C:/Users/seankearney/Assignment2/MovieRecommender/Data/users5.dat");
	    Scanner inUsers = new Scanner(userFile);
        //each field is separated(delimited) by a '|'
        String delims = "[|]";
        while (inUsers.hasNextLine()) 
        {
           // get data from data source
           String userDetails = inUsers.nextLine();
           // parse user details string
           String[] userTokens = userDetails.split(delims);
           // output user data to console.
           if (userTokens.length == 7) 
           {
        	   String firstName = userTokens[1];
        	   String lastName = userTokens[2];
        	   int age = Integer.parseInt(userTokens[3]);
        	   String gender = userTokens[4];
        	   String occupation = userTokens[5];
        	   int id = Integer.parseInt(userTokens[0]);
        	   user.add(new User(firstName, lastName, age, gender, occupation, id));
           }else
           {
               System.out.println("Invalid member length");
           }
       }
	}
	
	
	 void readInMovies() throws FileNotFoundException
	{
		MovieRecommender m = new MovieRecommender();
		input = new Scanner(System.in);
	    File movieFile = new File("C:/Users/seankearney/Assignment2/MovieRecommender/Data/items5.dat");
	    Scanner inMovie = new Scanner(movieFile);
        //each field is separated(delimited) by a '|'
        String delims = "[|]";
        while (inMovie.hasNextLine()) 
        {
           // get data from data source
           String movieDetails = inMovie.nextLine();
           // parse user details string
           String[] movieTokens = movieDetails.split(delims);
           // output user data to console.
           if (movieTokens.length == 23) 
           {
        	   String title = movieTokens[1];
        	   String year = movieTokens[2];
        	   String url = movieTokens[3];
        	   String unknown = movieTokens[4];
        	   String action = movieTokens[5];
        	   String adventure = movieTokens[6];
        	   String animation = movieTokens[7];
        	   String children = movieTokens[8];
        	   String comedy = movieTokens[9];
        	   String crime = movieTokens[10];
        	   String documentory = movieTokens[11];
        	   String drama = movieTokens[12];
        	   String fantasy = movieTokens[13];
        	   String filmNoir = movieTokens[14];
        	   String horror = movieTokens[15];
        	   String musical = movieTokens[16];
        	   String mystery = movieTokens[17];
        	   String romance = movieTokens[18];
        	   String sciFi = movieTokens[19];
        	   String thriller = movieTokens[20];
        	   String war = movieTokens[21];
        	   String western = movieTokens[22];      	   
        	   addMovie(movieId, title, year, url, unknown, action, adventure, animation, children, comedy, crime, documentory, drama, fantasy, filmNoir, horror, musical, mystery, romance, sciFi, thriller, war, western);
        	   movieId ++;  
           }else
           {
               System.out.println("Invalid member length");
           }
       }
	}

	 void readInRatings() throws FileNotFoundException
		{
			input = new Scanner(System.in);
		    File ratingFile = new File("C:/Users/seankearney/Assignment2/MovieRecommender/Data/ratings5.dat");
		    Scanner inUsers = new Scanner(ratingFile);
	        //each field is separated(delimited) by a '|'
	        String delims = "[|]";
	        while (inUsers.hasNextLine()) 
	        {
	           // get data from data source
	           String ratingInfo = inUsers.nextLine();
	           // parse user details string
	           String[] ratingTokens = ratingInfo.split(delims);
	           // output user data to console.
	           if (ratingTokens.length == 4) 
	           {
	        	   int userId = Integer.parseInt(ratingTokens[0]);
	        	   int movieId = Integer.parseInt(ratingTokens[1]);
	        	   int rating = Integer.parseInt(ratingTokens[2]);
	        	   ratingArray.add(new Rating(userId, movieId, rating));
	           }else
	           {
	               System.out.println("Invalid member length in ratings");
	               break;
	           }
	           
	           Collections.sort(ratingArray, new Comparator<Rating>(){
	   			@Override
	   			public int compare(Rating r1, Rating r2) {
	   				return (int) r2.getRating() - r1.getRating();
	   			}});
	       }
		}
	@Override
	public void addUser(String firstName, String lastName, int age, String gender, String occupation, int id) {
		user.add(new User(firstName, lastName, age, gender, occupation, id));
		
	}

	@Override
	public void removeUser(int idInput) {
		Iterator<User> it = user.iterator();
		while (it.hasNext()) {
		  User user = it.next();
		  if (user.getId() == idInput) {
		    it.remove();
		    System.out.println("Removed");
		  }
		}		
	}

	@Override
	public void addMovie(int movieId, String title, String year, String url, String unknown, String action, String adventure,
			String animation, String children, String comedy, String crime, String documentory, String drama,
			String fantasy, String filmNoir, String horror, String musical, String mystery, String romance,
			String sciFi, String thriller, String war, String western) {
		movie.add(new Movie(movieId, title, year, url, unknown, action, adventure, animation, children, comedy, crime, documentory, drama, fantasy, filmNoir, horror, musical, mystery, romance, sciFi, thriller, war, western));
		
	}

	@Override
	public void addRating(int userID, int movieID, int rating) {
		ratingArray.add(new Rating(userID, movieID, rating));
		
	}

	@Override
	public void getMovie(int movieID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getUserRatings(int userID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Set<Integer> getUserRecommendations(int userID) {
		Set<Integer> user1;
		Set<Integer> user2;
		ArrayList<CompUser> compUser;
		compUser = new ArrayList<CompUser>();	
		user1 = getTopTenMovies(userID);
		
		for (User user : user)
		{
			int counter = 0;
			user2 = getTopTenMovies(user.getId());
			for (int movie : user1)
			{
				if (user2.contains(movie))
				{
					counter++;
					System.out.println("counter incremented");
				}
			}
			compUser.add(new CompUser(user.getId(), counter));
		}
        Collections.sort(compUser, new Comparator<CompUser>(){
			public int compare(CompUser s1, CompUser s2) {
				return (int) s2.getSimilar() - s1.getSimilar();
			}});
        int u;
        
        //0 will return the users own top 10.  1 will be the user with the most in common that isnt the main user.
        u = compUser.get(1).getUser();
        return getTopTenMovies(u);
	}

	@Override
	public Set<Integer> getTopTenMovies(int userID) {
		int k = 10;
		Set<Integer> highRatedMovies = new HashSet<Integer>();
		for(Rating ratingArray : ratingArray)
		{
			if(ratingArray.getRating() >= 2 && ratingArray.getUserId() == userID && k>0)
			{
				highRatedMovies.add(ratingArray.getMovieId());
				k--;
			}
		}
		return highRatedMovies;
	}
}

	


