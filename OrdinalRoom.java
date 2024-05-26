import java.io.*;
import java.util.Scanner;

public class OrdinalRoom extends HotelRoom {
	
	 final float price=500f;
	 private int numberOfRoom;
	 public OrdinalRoom() {}
	 public void setNumberOfRoom(int numberOfRoom)
	 {
		 this.numberOfRoom=numberOfRoom;
	 }
	 public int getNumberOfRoom()
	 {
		 return numberOfRoom;
	 }
	 public OrdinalRoom(String customerName,String customerAddress,String phoneNo,String email, int roomNo,int numberOfRoom)
	 {
		 super(customerName,customerAddress,phoneNo,email,roomNo);
		 this.numberOfRoom=numberOfRoom;
	 }
	 
	 public double calculatePrice()
	 {
		return (numberOfRoom*price); 
	 }
	 public void display()
	 {
		 super.display();
		 System.out.println("price of ordinal room is:"+price+"\nnumber of room rooms alloted :"+numberOfRoom+"\ntotal price of the room :"+this.calculatePrice());
	 }
public void menu() throws IOException {
	
	char ch;
	
	do {
		Scanner input=new Scanner(System.in);
		System.out.println("welcome to ordinal hotel room");
		System.out.println("1: To Added  customer record");
		System.out.println("2: To Delete  customer record");
		System.out.println("3 To Update customer record");
		System.out.println("4:To Display customer record");
		System.out.println("please select from the above choice ");
		int choice=input.nextInt();
		
		switch(choice)
		{
		case 1:
			addCustomer();
			break;
		case 2:
			deleteCustomer();
			break;
		case 3:
		updateCustomer();
		break;
		case 4:
			displayCustomer();
			break;
			default:
				System.out.println("wrong choice please  enter  the  choice carefully");
				
		}
	  	System.out.println("THANKS TO VISIT our ordinal  hotel room" );

	  System.out.println(" YOU WANT TO ADITIONAL INFORMATION ON ordinal hotel room ?? if you want please enter ' ' y 'else enter  ' n' ");
	  ch=input.next().charAt(0);
	  	

	}	
	  	while(ch!='n');
	  		
	
				
	}
public void addCustomer() {
	
	Scanner input=new Scanner(System.in);
	System.out.println("enter the room number you want to stay :");
	 int flag=cheekRoomNumber();
			
	if(flag==1) {
		System.out.println("sorry  the room is already booked");
	}
	else { 
	
	System.out.println("enter the name ");
	customerName=input.next();
	System.out.println("enter the address ");
	customerAddress=input.next();
	System.out.println("enter the phone number ");
	phoneNo=input.next();
	System.out.println("enter the email ");
	email=input.next();
	System.out.println("how many ordinal hotel roomes you want: ");
	numberOfRoom=input.nextInt();

	
}
	 try {
		 File file=new File("ordinalroom.txt");
		 if (file!=null) {
			 System.out.print("the member is ");
		 }
		 else
			 file.createNewFile();
         FileWriter Fl=new FileWriter("ordinalroom.txt",true);
       BufferedWriter f_writer= new BufferedWriter(Fl);
      f_writer.write(" thenameofthecustomeris: "+customerName);
      f_writer.write(" theaddressofthecustomeris: "+customerAddress);
      f_writer.write(" thephonenumberofthecustomeris: "+phoneNo);
      f_writer.write(" the email of customeris: "+email);
      f_writer.write(" theroomnuberofcustomeris: "+roomNo);
      f_writer.write(" thepriceofordnaryroomis: "+price);
      f_writer.write(" thenumberofyouwantis: "+numberOfRoom);
      f_writer.write(" thepriceofyourordinaryroomis: "+calculatePrice());
    System.out.print(" saved successfully ......!");
      f_writer.close();
     }
      catch (IOException e) {
    	  System.out.print("error is occured");
     System.out.println(e.getMessage());
   }
	
}
public int cheekRoomNumber() {
	int flag=0;
	File file = new File("ordinalroom.txt");
    try {
       System.out.println("=====================================================");
      FileReader Fl=new FileReader(file);
    BufferedReader br = new BufferedReader(Fl);  
    Scanner input=new Scanner(System.in);
        String Line;
      String roomNum=input.nextLine();
        while ((Line = br.readLine()) != null)
        {
             if(Line.contains(roomNum)) {
             flag++;
             break;
             }
     }
     br.close();
    
    }
    catch (IOException e) {
       System.out.println(e.getMessage());
    }
    return flag;
}
public void displayCustomer()  {
	   int count = 0;
	   File file = new File("ordinalroom.txt");
	    try {
	       System.out.println("*********************************************************");
	      FileReader Fl=new FileReader(file);
	    BufferedReader br = new BufferedReader(Fl);
	    Scanner input = new Scanner(file); 
	    while (input.hasNext()) {
	      String word  = input.next();
	      System.out.println(word);
	      count = count + 1;
	    }
	   
	     br.close();
	     System.out.println("###########################################################");
	  }
	    catch (IOException e) {
	       System.out.println(e.getMessage());
	    }
	}
public void deleteCustomer() {
	Scanner input=new Scanner(System.in);
	 try {
	        File inputFile = new File("ordinalroom.txt");
	        if (!inputFile.isFile()) {
	            System.out.println("File does not exist");
	            return;
	        }
	  //create new file later rename the original file
	        File tempFile = new File(inputFile.getAbsolutePath() + ".tmp");
	        FileReader f1=new FileReader(inputFile);
	        BufferedReader  br = new BufferedReader(f1);
	        PrintWriter pw = new PrintWriter(new FileWriter(tempFile));
	    System.out.println("enter the room numberyou want to delete:");
	        
		roomNo=input.nextInt();
	          
	 // Read from the original file and write to the new
	//unless content matches data to be removed.
	          String line ;     
	        while ((line = br.readLine())!= null) {
	            if (!line.trim().contains(line)) {
	                pw.println(line);
	                pw.flush();
	            }
	        }
	       
	        pw.close();
	        br.close();
	         
	        if (!inputFile.delete()) {
	            System.out.println("the file already deleted");
	          return;
	        }

	         
	        if (!tempFile.renameTo(inputFile))
	            System.out.println("Could not rename file");
	        
	        }
	   catch (FileNotFoundException ex) {
	        System.out.println(ex.getMessage());
	    }catch (Exception ex) {
	        System.out.println(ex.getMessage());
	    }
	  
	}
public void updateCustomer() throws IOException {
int count=0;
Scanner input=new Scanner(System.in);
File file = new File("ordinalroom.txt");
FileReader Fl=null;
  try {
    
    Fl=new FileReader(file);
  BufferedReader br = new BufferedReader(Fl); 
  String Line,searchroomNo;
  System.out.print("enter the room number you want to edit:");
  searchroomNo=input.nextLine();
      while ((Line = br.readLine()) != null)
   {
        if(Line.contains(searchroomNo)) {
           System.out.println(Line );
           
        count++;
        }
        System.out.println("  edit the information  you want  ");
   }
 }
 catch (FileNotFoundException e) {
   System.out.println(e.getMessage());
 }
  finally{
    Fl.close();
 }
  if(count==0)
    System.out.println("the member is not found in this room .please try again...!");
  
 
}
}





