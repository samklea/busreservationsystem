package busresevation;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class booking {
         String passengername;
         int busno;
         Date date;
         
         booking()
         {
        	 Scanner scanner=new  Scanner(System.in);
        	 System.out.println("enter the passenger name:");
        	 passengername=scanner.next();
        	 System.out.println("enter the bus no:");
        	 busno=scanner.nextInt();
        	 System.out.println("enter ur traveling date dd-mm-yyyy");
        	String dateinput=scanner.next();
        	SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        	try {
				date=dateFormat.parse(dateinput);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	
         }
         public boolean isAvailable(ArrayList<booking>bookings,ArrayList<bus>buses) 
         {
        	 int capacity=0;
        	 for(bus bus:buses)
        	 {
        		 if(bus.getbusno()==busno)
        		 {
        			 
        			 capacity=bus.getcapacity();
        		 }
        		 }
        		 
       		 int booked=0;
        		 for(booking b:bookings) {
        			 if(b.busno==busno &&  b.date.equals(date)) {
        				 booked++;
        			 }
        		 }
        		 return booked<capacity?true:false;
        	 }
         }


