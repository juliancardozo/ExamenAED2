public class OrderTest {

  public static void main (String args[]) {
    Order myOrder = new Order();
    Shirt shirtOne = new Shirt();
    double totalCost = 0.0;

    shirtOne.price = 14.00;
    totalCost = myOrder.addShirt(shirtOne);
    System.out.println("Total amount for this order is: " + totalCost);

    Shirt shirtTwo = new Shirt();
    Shirt shirtThree = new Shirt();

    shirtTwo.price = 9.00;
    shirtThree.price = 12.00;

    totalCost = myOrder.addShirt(shirtTwo);
    System.out.println("Total amount for this order is: " + totalCost);

    totalCost = myOrder.addShirt(shirtThree);
    System.out.println("Total amount for this order is: " + totalCost);


  }
}
