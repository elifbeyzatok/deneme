
public class HealthConditions {
	 //a person who is ill                                                              -> will not be allowed to travel
	  //a person who has recent contact within the last 10 days with infected people    -> will not be allowed to travel
	  //a person who has recent contact with people who has suspected symptoms of COVID -> will not be allowed to travel
	  
	  //A person with a COVID passport -> may travel if space is available  (regardless of their occupation type)
	  //not ill                        -> may travel if space is available  (regardless of their occupation type)
	 
	  boolean ill ;
	  boolean contactedWithInfectedPerson;
	  boolean contactedWithSuspectedSymptoms ;	  
	  boolean hasCovidPassport ;
	  
	
	  
	  public void checkboard() {
		  if( ill == false && contactedWithInfectedPerson == false && contactedWithSuspectedSymptoms == false && hasCovidPassport == true ){
		      System.out.println("may travel if space is available  (regardless of their occupation type)");
		  }else{
		      System.out.println("will not be allowed to travel");
//		      System.exit(1);
		      // 1 ?
		  }

	  }
}
