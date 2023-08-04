/*
 * Class: CMSC203 
 * Instructor: Grinberg
 * Description: Movie questionnaire
 * Due: 09/26/2022
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Michael Bushman
*/
import java.util.Scanner;
public class MovieDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// variables
	Scanner sc = new Scanner (System.in);
	Movie movie = new Movie();
	String movieTitle;
	String movieRating;
	int movieTickets;
	
	System.out.println("Enter the name of a movie");
	movieTitle = sc.nextLine();
	movie.setTitle(movieTitle);
	
	System.out.println("Enter the rating of the movie");
	movieRating = sc.nextLine();
	movie.setRating(movieRating);
	
	System.out.println("Enter the number of tickets sold for this movie");
	movieTickets = sc.nextInt();
	movie.setSoldTickets(movieTickets);
	
	System.out.println(movie.toString());
	
	}

}
