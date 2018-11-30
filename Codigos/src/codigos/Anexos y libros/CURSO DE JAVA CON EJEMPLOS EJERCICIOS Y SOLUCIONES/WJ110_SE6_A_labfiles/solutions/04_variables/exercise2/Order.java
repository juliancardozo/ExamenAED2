public class Order {

  public long orderValue = 0;
  public int itemQuantity = 1000000;
  public int itemPrice = 555500;

  public void calculateTotal() {

 orderValue = (long) itemQuantity * itemPrice;

    System.out.println("The result is " + orderValue);
 
    } // end calculateTotal

} // end class
