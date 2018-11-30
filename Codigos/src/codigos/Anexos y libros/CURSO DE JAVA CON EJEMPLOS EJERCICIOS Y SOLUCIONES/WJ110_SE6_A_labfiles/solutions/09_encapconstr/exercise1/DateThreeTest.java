public class DateThreeTest {

  public static void main(String args[]) {

    DateThree dateObj = new DateThree();
    
    
    dateObj.setMonth(3);
    dateObj.setDay(26);
    dateObj.setYear(1967);
    
    System.out.println(" The date is:  " + dateObj.getMonth()+ " / " +dateObj.getDay() +" /" + dateObj.getYear());
 
    //Test with valid values for  month, day and year 
    dateObj.setDate(12, 30, 2006);
    dateObj.displayDate();

   //Test with invalid value for month 14
    dateObj.setDate(14, 30, 2006);
    dateObj.displayDate();

  //Test with invalid value for day 35
    dateObj.setDate(5, 35, 2006);
    dateObj.displayDate();

  //Test with invalid value for year 200
    dateObj.setDate(10, 30, 200);
    dateObj.displayDate();

  } // end main
} // end class
