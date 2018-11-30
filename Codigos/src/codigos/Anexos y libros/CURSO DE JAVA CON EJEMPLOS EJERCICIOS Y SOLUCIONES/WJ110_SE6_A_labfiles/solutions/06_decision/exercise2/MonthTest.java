public class MonthTest {
   
 public static void main (String args[]) {

    Month myMonth = new Month();

    // Test default month number
    System.out.println("Testing day number using its default value:");
    myMonth.displayMonth();


    // Test month number for January
    System.out.println("Testing month number as 1:");
    myMonth.monthNumber = 1;
    myMonth.displayMonth();

    // Test month number for February
    System.out.println("Testing month number as 2:");
    myMonth.monthNumber = 2;
    myMonth.displayMonth();

    // Test month number for March
    System.out.println("Testing month number as 3:");
    myMonth.monthNumber = 3;
    myMonth.displayMonth();

    // Test month number for April
    System.out.println("Testing month number as 4:");
    myMonth.monthNumber = 4;
    myMonth.displayMonth();

    // Test month number for May
    System.out.println("Testing month number as 5:");
    myMonth.monthNumber = 5;
    myMonth.displayMonth();

    // Test month number for June
    System.out.println("Testing month number as 6:");
    myMonth.monthNumber = 6;
    myMonth.displayMonth();

    // Test month number for July
    System.out.println("Testing month number as 7:");
    myMonth.monthNumber = 7;
    myMonth.displayMonth();

    // Test month number for August
    System.out.println("Testing month number as 8:");
    myMonth.monthNumber = 8;
    myMonth.displayMonth();

    // Test month number for September
    System.out.println("Testing month number as 9:");
    myMonth.monthNumber = 9;
    myMonth.displayMonth();

    // Test month number for October
    System.out.println("Testing month number as 10:");
    myMonth.monthNumber = 10;
    myMonth.displayMonth();

    // Test month number for November
    System.out.println("Testing month number as 11:");
    myMonth.monthNumber = 11;
    myMonth.displayMonth();

    // Test month number for December
    System.out.println("Testing month number as 12:");
    myMonth.monthNumber = 12;
    myMonth.displayMonth();

    // Test month number outside legal range - high
    System.out.println("Testing illegal month number 13:");
    myMonth.monthNumber = 13;
    myMonth.displayMonth();

    // Test month number outside legal range - zero
    System.out.println("Testing illegal month number 0:");
    myMonth.monthNumber = 0;
    myMonth.displayMonth();

    // Test month number outside legal range - negative
    System.out.println("Testing illegal month number -13:");
    myMonth.monthNumber = -13;
    myMonth.displayMonth();

  }
}

