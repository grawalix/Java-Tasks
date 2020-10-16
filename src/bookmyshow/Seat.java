package bookmyshow;

public class Seat {
	int seatNumber;
	int rowNumber;
	boolean isReserved;
	
	public Seat(boolean isReserved, int seatNumber)
	{
	this.isReserved = isReserved;
	this.seatNumber = seatNumber;
	
	}

	public int getRowNumber() {
		return rowNumber;
	}

	public void setRowNumber(int rowNumber) {
		this.rowNumber = rowNumber;
	}

	public void setSeatNumber(int seatNumber)
	{
	this.seatNumber = seatNumber;
	}

	public int getSeatNumber()
	{
	return this.seatNumber;
	}

	public boolean getReservationStatus()
	{
	return isReserved;
	}

	public void reserve()
	{
	isReserved = true;
	}

	public void unreserve()
	{
	isReserved = false;
	}

	
}
