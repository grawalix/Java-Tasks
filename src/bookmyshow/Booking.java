package bookmyshow;

public class Booking {
	int cost;
	Customer customer;
	Show show;
	int rowNumber;
	int seatNumber;
	
	public Booking(Customer customer,Show show)
	{
		this.customer=customer;
		this.show=show;	
	}
	
	public int getCost() {
		if(show.getTheatre().getRows().get(rowNumber).getRowClass()==1) {
			return cost += 8;
		}
		else {
			return cost += 5;
			}
	}

	public int getRowNumber() {
		return rowNumber;
	}

	public void setRowNumber(int rowNumber) {
		this.rowNumber = rowNumber;
	}

	public int getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}
	
	public boolean reservedSeat(int selectedRow, int selectedSeat) {
		if (show.getTheatre().getRows().get(selectedRow).getSeats().get(selectedSeat).getReservationStatus())
		{
			return false;
		}
		else {
			show.getTheatre().getRows().get(selectedRow).getSeats().get(selectedSeat).reserve();
			setRowNumber(selectedRow);
			setSeatNumber(selectedSeat);
			return true;
		}

	}



           public boolean unreserveSeat()
           {
         show.getTheatre().getRows().get(rowNumber).getSeats().get(seatNumber).unreserve();
          return true;
          }
           
        public Customer getCostumer()
          {
                  return customer;
            }
}
