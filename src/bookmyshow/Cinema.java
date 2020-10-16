package bookmyshow;

import java.util.ArrayList;
import java.util.Random;
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
	     int k=0;
		
		testtheatre.createRows(k++, 6, 6);
		theatres.add(testtheatre);
		

		
		shows.add(new Show("Avengers","10-10-2020","3PM",theatres.get(0)));
		shows.add(new Show("Joker", "12-10-2020", "6PM", theatres.get(0)));
		shows.add(new Show("Wonderwoman","9-10-2020", "12PM", theatres.get(0)));
		shows.add(new Show("A Wednesday", "06-10-2020", "9PM", theatres.get(0)));
		shows.add(new Show("300", "05-10-2020", "9AM", theatres.get(0)));
		

		
		
		do {
			
			
			System.out.println("movie ticket booking system");
			System.out.println("-----------------");
//			System.out.println("Please Enter 1 to Add Theatre");
//			System.out.println("Please Enter 2 to Add Show");
			System.out.println("Please Enter 1 to Display Shows");
			System.out.println("Please Enter 2 to Make Booking");
			System.out.println("Please Enter 3 to Cancel Booking");
			System.out.println("Please Enter 4 to Exit\n");
			System.out.println("enter the option");
			option=select.nextInt();
			
//			if(option==1) {
//				System.out.println("add theatre ");
//				System.out.println("------------------------");
//				System.out.println("enter the name of theatre");
//				String theatrename=choice.nextLine();
//				System.out.println("enter a number for theatre");
//				int theatreno=choice.nextInt();
//				System.out.println("enter the number of rows");
//				int rowcount=choice.nextInt();
//				Theatre theatre=new Theatre(theatreno, theatrename);
//    			theatre.createRows(1, 10, rowcount);
//				theatre.createRows(1,5, 5);
//				theatres.add(theatre);
//			}
//			
//			if (option==2) {
//				System.out.println("add show selected");
//				System.out.println("--------------------");
//				System.out.println("Enter the date of the Show [DD-MM-YYYY]:");
//				String showdate=choice.nextLine();
//				System.out.println("enter  name of movie");
//				String showname=choice.nextLine();
//				System.out.println("enter time of movie");
//				String showtime=choice.nextLine();
//				System.out.println("Select a theatre by typing the number:");
//				int theatreno=choice.nextInt();
//
//				for (int i = 0; i < theatres.size(); i++) {
//					System.out.println(i+1 + " " + theatres.get(i).getDescription());
//				}
//				
//				shows.add(new Show(showname, showdate, showtime, theatres.get(theatreno-1)));
//			}
			
			if (option==1) {
				System.out.println("Name of theatre - "  +testtheatre.getDescription() );
				System.out.println("-------------------------");
				
				System.out.println("Display shows running");
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
			
			if (option==2) {
				System.out.println("Select Movie");
				System.out.println("---------------------");
				Random rn=new Random();
				int customerid=rn.nextInt(999);
				Customer customer=new Customer(customerid);
				customers.add(customer);
				
				for (int i = 0; i < shows.size(); i++) {
					int shownumber= i+1;
					System.out.println("Show Number - " +shownumber);
					System.out.println("Show Name - " +shows.get(i).getShowname());
					System.out.println("Show Date - " +shows.get(i).getShowdate());
					System.out.println("Show Time - "+shows.get(i).getShowtime());
					
					System.out.println("\n");
				}
				
				System.out.println("-----------------");
				System.out.println("enter the show number");
				int shownumber=choice.nextInt();
				int repeat=0;
				System.out.println();
				
				
//				System.out.println("Different types of seat available are-");
//				System.out.println("press 1 for Luxury Seats");
//				System.out.println("press 2 for Premium Seats");
//				System.out.println("press 3 for General Seats");

//                System.out.println("enter rowclass");
//				int input=choice.nextInt();
//                int rowcount =0;
                
				
				
				do {
					System.out.println("Seat Plan is  -  ");
					shows.get(shownumber-1).getTheatre().printSeatPlan();
					System.out.println("select your seat");
					System.out.println("enter the row");
					int selectedrow=choice.nextInt();
					System.out.println("enter the  seat");
					int selectedseat=choice.nextInt();
					System.out.println();
					Booking booking=new Booking(customer, shows.get(shownumber-1));
					
					if (booking.reservedSeat(selectedrow-1, selectedseat-1)) {
						bookings.add(booking);
						System.out.println("Seat has been booked");
						
					}
					else {
                    System.out.println("seat has been already booked"); 
					}
					System.out.println();
					System.out.println("enter 1 to book another seat ");
					System.out.println("enter 2 for checkout");
					repeat=choice.nextInt();
					
				}
				
				while(repeat==1);
				System.out.println();
				System.out.println("your bill");
				System.out.println("---------------");
				int totalcost=0;
				
				for (Booking booking:bookings)
				{
					if(booking.getCustomer().getCid()==customer.getCid())
					{
						totalcost +=booking.getCost();
					}
				}
				System.out.println("Customer Id - " +customer.getCid());
				System.out.println("Total Cost - " +totalcost+ "Ruppees");
				System.out.println();
			}
			
			if (option==3) {
				System.out.println("Cancel the booked ticket");
				System.out.println("---------------------------");
				System.out.println("enter the Customer ID");
			    int customerid=choice.nextInt();
			    
			    for (Customer customer : customers) {
					if(customer.getCid()==customerid)
					{
						for (Booking booking:bookings)
						{
							if(booking.getCustomer().getCid()==customer.getCid()) 
							{
                            if(booking.unreserveSeat()) {
						}

					}
				}
						System.out.println("your ticket has been canceled");
			}
			
		} 
			    System.out.println();
			}
			    if(option==4) {
			    	System.exit(0);
			    }
		}
			    while (true);
		
		
	}
}
	
