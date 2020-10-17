package com.task.cinema;

import java.util.*;

public class Show {

private String showName;

private String showDate;

private Theatre theatre;

private ArrayList<Seat> seats;


public Show(String showName, String showDate, Theatre theatre)

{

this.showName = showName;

this.showDate = showDate;

this.theatre = theatre;

}

public void loadSeats()

{

for (Row row : theatre.getRows())

{

for (Seat seat : row.getSeats())

{

seats.add(seat);

}

}

}



public void setShowName(String showName)

{

this.showName = showName;

}

public void setShowDate(String showDate)

{

this.showDate = showDate;

}

public void setTheatre(Theatre theatre)

{

this.theatre = theatre;

}

public String getShowName()

{

return showName;

}

public String getShowDate()

{

return showDate;

}

public Theatre getTheatre()

{

return theatre;

}

public ArrayList<Seat> getSeats()

{

return seats;

}

}
