public class DateTwoTest {

  public static void main (String args[]) {

    DateTwo myDateTwo = new DateTwo();

    // Test default day number
    System.out.println("Testing day number using its default value:");
    myDateTwo.displayDay();

    // Test day number for Monday
    System.out.println("Testing day number as 1:");
    myDateTwo.dayNumber = 1;
    myDateTwo.displayDay();

   // Test day number for Tuesday
   System.out.println("Testing day number as 2:");
   myDateTwo.dayNumber = 2;
    myDateTwo.displayDay();

    // Test day number for Wednesday
    System.out.println("Testing day number as 3:");
    myDateTwo.dayNumber = 3;
    myDateTwo.displayDay();

    // Test day number for Thursday
    System.out.println("Testing day number as 4:");
    myDateTwo.dayNumber = 4;
    myDateTwo.displayDay();

    // Test day number for Friday
    System.out.println("Testing day number as 5:");
    myDateTwo.dayNumber = 5;
    myDateTwo.displayDay();

    // Test day number for Saturday
    System.out.println("Testing day number as 6:");
    myDateTwo.dayNumber = 6;
    myDateTwo.displayDay();

    // Test day number for Sunday
    System.out.println("Testing day number as 7:");
    myDateTwo.dayNumber = 7;
    myDateTwo.displayDay();

    // Test day number outside legal range - high
    System.out.println("Testing illegal day number 8:");
    myDateTwo.dayNumber = 8;
    myDateTwo.displayDay();

    // Test day number outside legal range - zero
    System.out.println("Testing illegal day number 0:");
    myDateTwo.dayNumber = 0;
    myDateTwo.displayDay();

    // Test day number outside legal range - negative
    System.out.println("Testing illegal day number -273:");
    myDateTwo.dayNumber = -273;
    myDateTwo.displayDay();

  }
}
