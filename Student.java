package assignment;

public class Student {
	
	private int RollNumber;
	private String FirstName;
	private String LastName;
	int Date_of_Birth;
	public int getRollNumber() {
		return RollNumber;
	}
	public void setRollNumber(int rollNumber) {
		RollNumber = rollNumber;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public int getDate_of_Birth() {
		return Date_of_Birth;
	}
	public void setDate_of_Birth(int date_of_Birth) {
		Date_of_Birth = date_of_Birth;
	}
	
   public void printstudetails(){
	   
	   
	   Student S= new Student();
	   Student s2=new Student();
	  
	   S.setRollNumber(1234);
	  S.setFirstName("Anushka");
	   S.setLastName("Shrotriya");
	   S.setDate_of_Birth(05/05/1989);
	   
	   s2.setRollNumber(2454);
		  s2.setFirstName("Atharv");
		   s2.setLastName("Misahra");
		   s2.setDate_of_Birth(06/02/2019);
		   
	 System.out.println( "RollNumber=" +S.getRollNumber() );  
	 System.out.println("FirstName=" +S.getFirstName());  
	 System.out.println("LastName=" +S.getLastName());  
	 System.out.println("Date_of_Birth=" +S.getDate_of_Birth()           ); 
	 
	 
	 System.out.println( "RollNumber=" +s2.getRollNumber() );  
	 System.out.println("FirstName=" +s2.getFirstName());  
	 System.out.println("LastName=" +s2.getLastName());  
	 System.out.println("Date_of_Birth=" +s2.getDate_of_Birth()); 
	  
	   
   }
}
