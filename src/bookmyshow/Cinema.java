package bookmyshow;

import java.util.ArrayList;
import java.util.Scanner;

public class Cinema {

	public static void main(String[] args) {
		int option=0;
		
		ArrayList<Show> shows=new ArrayList<Show>();
		ArrayList<Theatre> theatres = new ArrayList<Theatre>();
		ArrayList<Booking> bookings = new ArrayList<Booking>();
		ArrayList<Customer> customers = new ArrayList<Customer>();
		
		Scanner sc=new Scanner(System.in);
		Scanner in=new Scanner(System.in);
		
		Theatre testtheatre=new Theatre(1, "PVR Noida");
		testtheatre.createRows(1, 10, 7);
		theatres.add(testtheatre);
		
		shows.add(new Show("Avengers","10-10-2020","3PM",theatres.get(0)));
		shows.add(new Show("Joker", "12-10-2020", "6PM", theatres.get(0)));
		shows.add(new Show("Wonderwoman","9-10-2020", "12PM", theatres.get(0)));
		shows.add(new Show("A Wednesday", "06-10-2020", "9PM", theatres.get(0)));
		
		do {
			
			System.out.println("-----------------");
			System.out.println("movie ticket booking system");
			System.out.println("Please Enter 1 to Add Theatre");
			System.out.println("Please Enter 2 to Add Show");
			System.out.println("Please Enter 3 to Display Shows");
			System.out.println("Please Enter 4 to Make Booking");
			System.out.println("Please Enter 5 to Cancel Booking");
			System.out.println("Please Enter 6 to Exit\n");
			
		} while (false);
		
		
	}
}
