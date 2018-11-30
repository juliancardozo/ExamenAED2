public class RectangleTest {

  public static void main(String args[]) {

    Rectangle r1;
    r1 = new Rectangle();

    System.out.println("This is the first rectangle:");
    r1.draw();

    Rectangle r2;
    r2 = new Rectangle(20, 7);

    System.out.println("This is the second rectangle:");
    r2.draw();

    System.out.println("The area is " + r2.getArea());
	
  }// end main
} // end class
