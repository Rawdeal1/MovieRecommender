import java.io.FileNotFoundException;
import java.util.Scanner;

public class Driver {
	private Scanner input;
	private MovieRecommender movieR;
	
	public static void main (String args[]) throws FileNotFoundException
	{
		MovieRecommender movieR = new MovieRecommender();
		new Driver();
		movieR.readInUser();
	}
	
	public Driver() throws FileNotFoundException
	{
		input = new Scanner(System.in);
		movieR = new MovieRecommender();
		mainMenu();
	}
	
	void mainMenu() throws FileNotFoundException
	{
		//asks the user for input and sends it to the bestMatch method
		int option = displayMenu();
		
		while (option != 0 )
		{
			switch(option)
			{
			case 1:
				String firstName;
				String lastName;
				int age;
				String gender;
				String occupation;
				int id;
				System.out.print("Enter First Name: ");
				firstName = input.next();
				System.out.print("Enter Last Name: ");
				lastName = input.next();
				System.out.print("Enter Age: ");
				age = input.nextInt();
				System.out.print("Enter Gender");
				gender = input.next();
				System.out.print("Enter Occupation");	
				occupation = input.next();
				System.out.print("Enter Id");	
				id = input.nextInt();
				movieR.addUser(firstName, lastName, age, gender, occupation, id);
				break;
			case 2:
				System.out.println("Enter ID of user to remove");
				int idInput = input.nextInt();
				movieR.removeUser(idInput); 
				break;
			case 3:
				System.out.print("Enter your ID");
				break;
			case 4: 
				//Sets the movie Id to the last Id in the arraylist + 1. This should make sure every entry is unique.
				System.out.print("Enter Movie Title: ");
				String title = input.next();
				System.out.print("Enter Year: ");
				String year = input.next();
				System.out.print("Enter URL: ");
				String url = input.next();
				System.out.println("Enter 1 if your movie fits the genre and 0 if it doesnt");
				System.out.println("Unknown ");
				String unknown = input.next();
				System.out.print("Action: ");	
				String action = input.next();
				System.out.print("Adventure ");	
				String adventure = input.next();
				System.out.print("Animation ");
				String animation = input.next();
				System.out.print("Children ");
				String children = input.next();
				System.out.print("Comedy");
				String comedy = input.next();
				System.out.print("Crime");
				String crime = input.next();
				System.out.print("Documentory");
				String documentory = input.next();
				System.out.print("Drama");
				String drama = input.next();
				System.out.print("Fantasy");
				String fantasy = input.next();
				System.out.print("Film-Noir");
				String filmNoir = input.next();
				System.out.print("Horror");
				String horror = input.next();
				System.out.print("Musical");
				String musical = input.next();
				System.out.print("Mystery");
				String mystery = input.next();
				System.out.print("Romance");
				String romance = input.next();
				System.out.print("Sci-Fi");
				String sciFi = input.next();
				System.out.print("Thriller");
				String thriller = input.next();
				System.out.print("War");
				String war = input.next();
				System.out.print("Western");
				String western = input.next();
				movieR.addMovie(movieR.movieId, title, year, url, unknown, action, adventure, animation, children, comedy, crime, documentory, drama, fantasy, filmNoir, horror, musical, mystery, romance, sciFi, thriller, war, western);
				movieR.movieId ++;
				break;
			case 5:
				System.out.println("Enter your ID");
				int userID = input.nextInt();
				System.out.println("Enter Movie ID");
				int movieID = input.nextInt();
				System.out.println("Enter your Rating (1-5)");
				int rating = input.nextInt();
				while (rating > 5 || rating < 1){
					System.out.println("Error enter a value between (1-5)");
					System.out.println("Enter your Rating (1-5)");
					rating = input.nextInt();
				}
				movieR.addRating(userID, movieID, rating);					
				System.out.println("Rating added succesfully");
				break;
			case 6:
				System.out.println("Enter your ID: ");
				int usersID = input.nextInt();
				for(int iD : movieR.getTopTenMovies(usersID))
				{
					System.out.println(movieR.getMovie(iD));
				}				
				break;
			case 7:
				System.out.println("Enter your ID: ");
				usersID = input.nextInt();
				for(int iD : movieR.getUserRecommendations(usersID))
				{
					System.out.println(movieR.getMovie(iD));
				}
				break;
			case 8:
				for(int i = 0; i < movieR.movie.size(); i++) {   
					System.out.println(movieR.movie.get(i));
				}  
				for(int i = 0; i < movieR.user.size(); i++) {   
					System.out.println(movieR.user.get(i));
				}  
				for(int i = 0; i < movieR.ratingArray.size(); i++) {   
					System.out.println(movieR.ratingArray.get(i));
				} 
				break;
			case 9:
				movieR.readInMovies();
				movieR.readInUser();
				movieR.readInRatings();
				break;
			}
			
			//Scanner fix Buffer clear
			input.nextLine();
			
			option = displayMenu();
		}
		
		System.out.println("Goodbye!");
		System.exit(0);
	}
	
	private int displayMenu()
	{
		System.out.println("1) Add a user");
		System.out.println("2) Remove a user");
		System.out.println("3) Select user");
		System.out.println("4) Add movie");
		System.out.println("5) Add Rating");
		System.out.println("6) Top 10 movies");
		System.out.println("7) Your Recommendations");
		System.out.println("8) Print Data");
		System.out.println("9) Load in Data");
		System.out.println("0) Exit");
		
		System.out.print(">>");
		return input.nextInt();
	}
}
