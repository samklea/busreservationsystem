package busresevation;

public class bus {
  private 	int busno;
	private boolean AC;
	private int capacity;
	
	bus(int no,boolean AC,int cap){
		this. busno= no;
		this. AC=AC;
		this. capacity=cap;
	}
	public int getbusno() {
		return busno;
	}
	public boolean isAC() {
		return AC;
	}
	public int getcapacity()                 //get method also known as accessor method
	{
	return capacity;	
	}
	public void setAC(boolean val) {
		AC=val;
	}
	public void setcapacity(int cap) {              //set method also known as mutator
		capacity=cap;
	}
	public  void displaybusinfo(){
		System.out.println("busno:"+busno+"AC:"+AC+"total capacity:"+capacity);
	}

}
