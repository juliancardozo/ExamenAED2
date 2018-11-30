public class Counter {
  
  public int count = 1;
  public final int COUNT_MAX = 50;
  public int step = 1;

  public void displayCount() {

    while (count <= COUNT_MAX) {

      System.out.print(count + " ");

      count = count + step;

    }// end while

    System.out.println();

  }// end displayCount method
}// end class
