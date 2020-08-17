package comparable.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class MainClass {
	public static void main(String[] args) 
    { 
        ArrayList<Movie> list = new ArrayList<Movie>(); 
        list.add(new Movie("Force Awakens", 8.3, 2015)); 
        list.add(new Movie("Star Wars", 8.7, 1977)); 
        list.add(new Movie("Empire Strikes Back", 8.8, 1980)); 
        list.add(new Movie("Return of the Jedi", 8.4, 1983)); 
  
        Collections.sort(list); 
  
        System.out.println("Movies after sorting by year : "); 
        for (Movie movie: list) 
        { 
            System.out.println(movie.getName() + " " + 
                               movie.getRating() + " " + 
                               movie.getYear()); 
        }
        System.out.println("\n\n");
        MovieByRating byRating = new MovieByRating();
        Collections.sort(list,byRating);
        System.out.println("Movies after sorting by rating : "); 
        for (Movie movie: list) 
        { 
            System.out.println(movie.getName() + " " + 
                               movie.getRating() + " " + 
                               movie.getYear()); 
        } 
    } 
}
