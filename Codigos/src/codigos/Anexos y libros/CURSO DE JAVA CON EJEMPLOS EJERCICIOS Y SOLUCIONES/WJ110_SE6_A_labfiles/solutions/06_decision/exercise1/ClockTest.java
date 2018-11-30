public class ClockTest {
   
  public static void main (String args[]) {
 
     Clock myClock = new Clock();

    // Test default day number
    System.out.println("Testing time using its default value:");
    myClock.displayPartOfDay();

    // Test Early Morning
    System.out.println("Testing Early Morning (0001):");
    myClock.currentTime = 1;
    myClock.displayPartOfDay();

    // Test Early Morning
    System.out.println("Testing Early Morning (0400):");
    myClock.currentTime = 400;
    myClock.displayPartOfDay();

    // Test Early Morning
    System.out.println("Testing Early Morning (0800):");
    myClock.currentTime = 800;
    myClock.displayPartOfDay();

    // Test Morning
    System.out.println("Testing Morning (0801):");
    myClock.currentTime = 801;
    myClock.displayPartOfDay();

    // Test Morning
    System.out.println("Testing Morning (1030):");
    myClock.currentTime = 1030;
    myClock.displayPartOfDay();

    // Test Morning
    System.out.println("Testing Morning (1200):");
    myClock.currentTime = 1200;
    myClock.displayPartOfDay();

    // Test Afternoon
    System.out.println("Testing Afternoon (1201):");
    myClock.currentTime = 1201;
    myClock.displayPartOfDay();

    // Test Afternoon
    System.out.println("Testing Afternoon (1545):");
    myClock.currentTime = 1545;
    myClock.displayPartOfDay();

    // Test Afternoon
    System.out.println("Testing Afternoon (1700):");
    myClock.currentTime = 1700;
    myClock.displayPartOfDay();

    // Test Evening
    System.out.println("Testing Evening (1701):");
    myClock.currentTime = 1701;
    myClock.displayPartOfDay();

    // Test Evening
    System.out.println("Testing Evening (2105):");
    myClock.currentTime = 2105;
    myClock.displayPartOfDay();

    // Test Evening
    System.out.println("Testing Evening (2400):");
    myClock.currentTime = 2400;
    myClock.displayPartOfDay();

  }
}

  



    

