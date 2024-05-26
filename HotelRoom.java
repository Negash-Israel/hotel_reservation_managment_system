import java.io.*;

public abstract class HotelRoom {
	 String customerName;
	 String customerAddress;
	 String phoneNo;
	 String email;
	 int roomNo;
	 public abstract void addCustomer();
	  public abstract void deleteCustomer();
	  public abstract void displayCustomer();
	  public abstract void updateCustomer()throws IOException;
	  public abstract double calculatePrice();
	  public abstract int cheekRoomNumber();
	
	
	public HotelRoom() {}

	public HotelRoom(String customerName,String customerAddress,String phoneNo,String email, int roomNo)
	{
		this.customerName=customerName;
		this.customerAddress=customerAddress;
		this.phoneNo=phoneNo;
		this.email=email;
		this.roomNo=roomNo;
	}
	
	public String getCustomerName()
	{
		return customerName;
	}
	public void setCustomerName(String customerName)
	{
		this.customerName=customerName;
	}
	public String getCustomerAddress()
	{
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress)
	{
		this.customerAddress=customerAddress;
	}
	
	public String getPhoneNo()
	{
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo)
	{
		this.phoneNo=phoneNo;
	}
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String email)
	{
		this.email=email;
	}
	public int getRoomNo()
	{
		return roomNo;
	}
	public void setRoomNo( int roomNo)
	{
		this.roomNo=roomNo;
	}
	
	 public void display()
	{
		System.out.println("customer name:"+customerName+"\ncustomer address :"+customerAddress+"\ncustomer phone number :"+phoneNo+"\ncustomer email :"+email+"\nroom number :"+roomNo);
	}
	
}
