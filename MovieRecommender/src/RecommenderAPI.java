
public interface RecommenderAPI {
	
	public void addUser(String firstName, String lastName, int age, String gender, String occupation, int id);
	public void removeUser(int id);
	public void addMovie (int movieId,String title, String year, String url, String unknown, String action, String adventure, String animation, String children, String comedy, String crime, String documentory, String drama, String fantasy, String filmNoir, String horror, String musical, String mystery, String romance, String sciFi, String thriller, String war, String western);
	public void addRating(int userID, int movieID, int rating);
	public void getMovie(int movieID);
	public void getUserRatings(int userID);
	public void getUserRecommendations(int userID);
	public void getTopTenMovies(int userID);
	//load()
	//write()
}
