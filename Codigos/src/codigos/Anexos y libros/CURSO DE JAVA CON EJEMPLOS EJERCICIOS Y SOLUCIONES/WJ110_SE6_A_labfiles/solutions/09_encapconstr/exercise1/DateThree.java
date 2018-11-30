public class DateThree {

  private int day;
  private int month;
  private int year;

  public void setDay(int d) {
    day = d;
  }

  public int getDay() {
    return day;
  }

  public void setMonth(int m) {
    month = m;
  }

  public int getMonth() {
    return month;
  }

  public void setYear(int y) {
    year = y;
  }

  public int getYear() {
    return year;
  }

  public void setDate (int m, int d, int y) {
    if ((y > 1000) && (y < 10000)) {
      year = y;
    }      
    else {
      System.out.println("Invalid year. Must be greater than 1000 and less than 10000)");
      y=0;
    }
      
    switch(m) {
    case 1:
    case 3:
    case 5:
    case 7:
    case 8:
    case 10:
    case 12:
      month = m;
      
      if ((d > 0) && (d < 32)) {
	day = d;
      }
      else {
	System.out.println("Invalid day. Must be 1 to 31.");
        day=0;
      }
      break;
    case 2:
      month = m;
      
      if ((d > 0) && (d < 29)) {
	day = d;
      }
      
      // To check if the year is a leap year when d=29 and m=2
      else if (d==29){

	
       if ( ((y % 4 == 0) && !(y % 100 == 0))
                     || (y % 400 == 0) )
                    day = d;
       
       else {
	System.out.println("Invalid day. Day cannot be 29.Must be between 1 to 28 as year is not a leap year.");
        day=0;
       }
      }
      break;
    case 4:
    case 6:
    case 9:
    case 11:
      month = m;
      
      if ((d > 0) && (d < 31)) {
	day = d;
      }
      else {
	System.out.println("Invalid day. Must be 1 to 30.");
        d=0;
      }
      break;
    default:
      System.out.println("Invalid month.");
      month=0;
      break;
     }
   }

  public void displayDate() {
   if(day==0 || month==0 || year==0) 
    System.out.println("Invalid date. please try agagin");
   else
    System.out.println("Today's date is: " + month + "/" + day + "/" + year);
  }
 
} // end class
