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
		
		Scanner select=new Scanner(System.in);
		Scanner choice=new Scanner(System.in);
		
		Theatre testtheatre=new Theatre(1, "PVR Noida");
		testtheatre.createRows(1, 10, 7);
		theatres.add(testtheatre);
		
		Theatre testtheatre1=new Theatre(2, "Logix Noida");
		testtheatre.createRows(1, 5, 7);
		theatres.add(testtheatre1);
		
		shows.add(new Show("Avengers","10-10-2020","3PM",theatres.get(0)));
		shows.add(new Show("Joker", "12-10-2020", "6PM", theatres.get(0)));
		shows.add(new Show("Wonderwoman","9-10-2020", "12PM", theatres.get(0)));
		shows.add(new Show("A Wednesday", "06-10-2020", "9PM", theatres.get(0)));
		shows.add(new Show("300", "05-10-2020", "9AM", theatres.get(0)));
		
		do {
			
			System.out.println("-----------------");
			System.out.println("movie ticket booking system");
			System.out.println("Please Enter 1 to Add Theatre");
			System.out.println("Please Enter 2 to Add Show");
			System.out.println("Please Enter 3 to Display Shows");
			System.out.println("Please Enter 4 to Make Booking");
			System.out.println("Please Enter 5 to Cancel Booking");
			System.out.println("Please Enter 6 to Exit\n");
			System.out.println("enter the option");
			option=select.nextInt();
			
			if(option==1) {
				System.out.println("add theatre selected");
				System.out.println("------------------------");
				System.out.println("enter the name of theatre");
				String theatrename=choice.nextLine();
				System.out.println("enter a number for theatre");
				int theatreno=choice.nextInt();
				System.out.println("enter the number of rows");
				int rowcount=choice.nextInt();
				Theatre theatre=new Theatre(theatreno, theatrename);
//				theatre.createRows(1, 10, rowcount);
				theatre.createRows(1,5, 5);
				theatres.add(theatre);
			}
			
			if (option==2) {
				System.out.println("add show selected");
				System.out.println("--------------------");
				System.out.println("Enter the date of the Show [DD-MM-YYYY]:");
				String showdate=choice.nextLine();
				System.out.println("enter  name of movie");
				String showname=choice.nextLine();
				System.out.println("enter time of movie");
				String showtime=choice.nextLine();
				System.out.println("Select a theatre by typing the number:");
				int theatreno=choice.nextInt();

				for (int i = 0; i < theatres.size(); i++) {
					System.out.println(i+1 + " " + theatres.get(i).getDescription());
				}
				
				shows.add(new Show(showname, showdate, showtime, theatres.get(theatreno-1)));
			}
			
			if (option==3) {
				System.out.println("Display shows selected");
				System.out.println("----------------");
				
				for (int i = 0; i < shows.size(); i++) {
					int shownumber = i+1;
					System.out.println("Show Number - " +shownumber);
					System.out.println("Show Name - " +shows.get(i).getShowname());
					System.out.println("Show Date - " +shows.get(i).getShowdate());
					System.out.println("Show Time - " +shows.get(i).getShowtime());
					
					System.out.println("\n");
					
					
				}
				
				System.out.println("End of show list");
			}
			
			if (option==4) {
				
			}
			
		} while (false);
		
		
	}
}
