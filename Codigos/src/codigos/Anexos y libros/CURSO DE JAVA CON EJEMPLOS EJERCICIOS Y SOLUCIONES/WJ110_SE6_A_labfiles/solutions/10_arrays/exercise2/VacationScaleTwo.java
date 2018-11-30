public class VacationScaleTwo { 

  public int [] vacationDays;  
 
  public void setVacationScale() {
  
    vacationDays = new int[7];
    
    vacationDays[0] = 10;
    vacationDays[1] = 15; 
    vacationDays[2] = 15;
    vacationDays[3] = 15;
    vacationDays[4] = 20;
    vacationDays[5] = 20;
    vacationDays[6] = 25;

  }
   
  public void displayVacationDays() {
    for (int yearCount = 0; yearCount < 7; yearCount++){
      
    System.out.println("The vacation for " + yearCount + " Years of service is  :"+vacationDays[yearCount]);
    }   
    
  } //end method
}// end class

    
    
        
    
