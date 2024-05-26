import java.io.*;
import java.util.Scanner;
import java.io.*;

public class ProjectTestClass {

	public static void main(String[] args) throws Exception {
		Scanner input=new Scanner(System.in);
		char ch ;
		do {
		System.out.println("Welcome to our hotel room");
		System.out.println("1:To Book  Ordinal hotel room");
		System.out.println("2:TO Book Royal hotel room");
		System.out.println("3:To Book Luxury hotel room");
		System.out.println("please select your chice!!!");
		int choice=input.nextInt();
		
		
		switch(choice) {
		case 1:{
			OrdinalRoom ordinal=new OrdinalRoom() ;
			ordinal.menu();
			break;
		}
		case 2:{
			RoyalRoom royal=new RoyalRoom();
			royal.menu();
			break;
		      }
		case 3:
		{
			
			LuxuryRoom luxury=new LuxuryRoom();
			   luxury.menu();
		    break;
		}
			default:
				System.out.println("wrong choice please  enter  the  choice carefully");
				
		}
	  	System.out.println("THANKS TO VISIT our ordinal  hotel room" );

	  System.out.println(" YOU WANT TO ADITIONAL INFORMATION ON ordinal hotel room ?? if you want please enter ' ' y 'else enter  ' n' ");
	   ch = input.next().charAt(0);
	  	

	}	
	  	while(ch!='n');
	  		
	
				
	}
	
					
		}