package bookmyshow;

import java.util.ArrayList;

public class Show {

	private String showname;
	private String showdate;
	private String showtime;
	private Theatre theatre;
	private ArrayList<Seat> seats;
	private int freeSeats;
	public Show(String showname, String showdate,String showtime, Theatre theatre) {
		this.showname = showname;
		this.showdate = showdate;
		this.showtime=showtime;
		this.theatre = theatre;
	}
	
	

	public void loadSeats() {
		for (Row row : theatre.getRows()) {
			for (Seat seat : row.getSeats())
			{
				seats.add(seat);
			}	
       		}
	        }
	
	public int getFreeSeatsCount()
	{
	for (Seat seat : seats)
	{
	if (!seat.getReservationStatus())
	{
	freeSeats++;
	}
	}
	return freeSeats;
	}

	public String getShowname() {
		return showname;
	}

	public void setShowname(String showname) {
		this.showname = showname;
	}

	public String getShowdate() {
		return showdate;
	}

	public void setShowdate(String showdate) {
		this.showdate = showdate;
	}

	public Theatre getTheatre() {
		return theatre;
	}

	public void setTheatre(Theatre theatre) {
		this.theatre = theatre;
	}
	
	public String getShowtime() {
		return showtime;
	}

	public void setShowtime(String showtime) {
		this.showtime = showtime;
	
}
}