//import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		
		
		HealthConditions hc= new HealthConditions();
		
		hc.ill=false;
		hc.contactedWithInfectedPerson=false;
		hc.contactedWithSuspectedSymptoms=false;
		hc.hasCovidPassport=true;
		hc.checkboard();
		
		
		reductionOfSeats ( 300 ); //Enter the amount of covid cases as parameters here !!
		reservedPlacesForPWEP(300); //Enter the amount of covid cases as parameters here !!
		calculateTicketPrice(3);//Enter the level which is it. Please write 1,2,3 or 4!!
	}
	
	
	int amountOfCases; //amount of covid cases
	
	public static int  reductionOfSeats ( int amountOfCases  ) {
		if( amountOfCases < 100) {
			System.out.println("Level 0 = there will be no space restrictions");
		}else if( amountOfCases >= 100 && amountOfCases < 200) {
			System.out.println("Level 1 = capacity of the transport is reduced to 80% ");
		}else if( amountOfCases >= 200 && amountOfCases < 300) {
			System.out.println("Level 2 = capacity of the transport is reduced to 60% ");			
		}else if( amountOfCases >= 300 && amountOfCases < 500) {
			System.out.println("Level 3 = capacity of the transport is reduced to 40% ");			
		}else {
			System.out.println("Level 4 = capacity of the transport is reduced to 30% ");
		}
		
		return amountOfCases;
	}
	
	
	
	// reserved places for 'professionals with essential professions'.       int reservedPlacesForPWEP (PWEP = professionals with essential professions )
		 public static  int reservedPlacesForPWEP( int amountOfCases ){
		   if( amountOfCases < 100) {
				System.out.println("Level 0 = There is no reserved places for 'professionals with essential professions' . ");
			}else if( amountOfCases >= 100 && amountOfCases < 200) {
				System.out.println("Level 1 = There is no reserved places for 'professionals with essential professions' ");
			}else if( amountOfCases >= 200 && amountOfCases < 300) {
				System.out.println("Level 2 = of the possible reduced capacity, 60% of the places are reserved for professionals with essential professions. ");			
			}else if( amountOfCases >= 300 && amountOfCases < 500) {
				System.out.println("Level 3 = of the possible reduced capacity, 80% of the places are reserved for professionals with essential professions. ");			
			}else {
				System.out.println("Level 4 = of the possible reduced capacity, 90% of the places are reserved for professionals with essential professions. ");
			}
			
			return amountOfCases;
		 
		 
		 }
		 
		 
		 
		 int level_n;
		 
		 public static int calculateTicketPrice(int level_n ) {
			 
			 if(level_n == 0) {
				 System.out.println("Level 0");
				 System.out.println("* if age<23              -> ticket price discounted 60%   ");
				 System.out.println("* if age>=23 and age<=65 -> ticket price didn't change  ");
				 System.out.println("* if age>65              -> ticket price discounted 80%   ");
				  
			 }else if(level_n == 1) {
				 System.out.println("Level 1");
				 System.out.println("* if age<23              -> ticket price discounted 30%   ");
				 System.out.println("* if age>=23 and age<=65 -> ticket price didn't change  ");
				 System.out.println("* if age>65              -> ticket price discounted 50%   ");
				  
			 }else if(level_n == 2) {
				 System.out.println("Level 2");
				 System.out.println("* if age<23              -> ticket price didn't change    ");
				 System.out.println("* if age>=23 and age<=65 -> ticket price didn't change  ");
				 System.out.println("* if age>65              -> ticket price increased 20%   ");
				  
			 }else  if(level_n == 3) {
				 System.out.println("Level 3");
				 System.out.println("* if age<23              -> ticket price increased 20%    ");
				 System.out.println("* if age>=23 and age<=65 -> ticket price didn't change  ");
				 System.out.println("* if age>65              -> ticket price increased 50%   ");
				  
			 }else if(level_n == 4) {
				 System.out.println("Level 3");
				 System.out.println("* if age<23              -> ticket price increased 30%    ");
				 System.out.println("* if age>=23 and age<=65 -> ticket price didn't change  ");
				 System.out.println("* if age>65              -> !! will not be allowed to travel !!   ");			  
			 }else {
				 System.out.println("Please enter which level? You should type 1,2,3 or 4.");
			 }
			return level_n;
			
			
		 }
		 
		 
	
	

}
