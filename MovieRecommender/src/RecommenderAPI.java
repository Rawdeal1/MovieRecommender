import java.util.List;
import java.util.Set;

public interface RecommenderAPI {
	
	public void addUser(String firstName, String lastName, int age, String gender, String occupation, int id);
	public void removeUser(int id);
	public void addMovie (int movieId,String title, String year, String url, String unknown, String action, String adventure, String animation, String children, String comedy, String crime, String documentory, String drama, String fantasy, String filmNoir, String horror, String musical, String mystery, String romance, String sciFi, String thriller, String war, String western);
	public void addRating(int userID, int movieID, int rating);
	public String getMovie(int movieID);
	public void getUserRatings(int userID);
	public Set<Integer> getUserRecommendations(int userID);
	public Set<Integer> getTopTenMovies(int userID);
	public void load() throws Exception;
	public void write()throws Exception;
	public List<User> getUsers();
	public List<Movie> getMovies();
	public List<Rating> getRatings();
}
