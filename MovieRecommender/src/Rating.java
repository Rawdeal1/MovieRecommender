import java.util.Objects;

public class Rating {
	int userId;
	int movieId;
	int uRating;
			
	public Rating(int userId, int movieId, int uRating) {
		if(userId <1 || movieId < 1|| uRating<-5|| uRating>5)
			throw new IllegalArgumentException();
		
		this.userId = userId;
		this.movieId = movieId;
		this.uRating = uRating;
	}
	
	@Override
	  public boolean equals(final Object obj)
	  {
	    if (obj instanceof Rating)
	    {
	      final Rating other = (Rating) obj;
	      return Objects.equals(userId, other.userId) 
	          && Objects.equals(movieId, other.movieId)
	          && Objects.equals(uRating, other.uRating);
	    }
	    else
	    {
	      return false;
	    }
	  }
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public int getRating() {
		return uRating;
	}
	public void setRating(int rating) {
		this.uRating = rating;
	}
	
	@Override
	public String toString() {
		return "Rating [userId=" + userId + ", movieId=" + movieId + ", rating=" + uRating + "]";
	}
}
