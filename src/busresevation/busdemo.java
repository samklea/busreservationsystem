package busresevation;
import java.util.Scanner;
import java.util.ArrayList;

public class busdemo {
	public static void main(String args[])
	{
		ArrayList<bus>buses = new  ArrayList<bus>();
		ArrayList<booking>bookings=new ArrayList<booking>();
		
		
		buses.add(new bus(1,true,2));
		buses.add(new bus(2,false,50));
		buses.add(new bus(3,true,48));
		
		
		int useropt=1;
		Scanner ab=new Scanner(System.in);
		for(bus b:buses) {
			b.displaybusinfo();
		}
		
		while(useropt==1) 
		{
		System.out.println("Enter 1 to book and 2 to exit");
		 useropt=ab.nextInt();
		 if(useropt==1)
		 {
			  booking Booking=new booking();
			  if(Booking.isAvailable(bookings,buses))
			  {
				  bookings.add(Booking);
				  System.out.println("your booking is confirmed");
			  }
			  else {
				  System.out.println("sorry. bus is full,try another bus or date");
			  }
		 }else {
			 System.out.println("return false");
			 
		 }
		
		}
	}

}
