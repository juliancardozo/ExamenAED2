public class Shirt {

  public int shirtID = 1; // 0 Default ID for the shirt
  public String description = "High Quality Cotton Shirts"; // "-description required-"default
  
  // The color codes are R=Red, B=Blue, G=Green, U=Unset
  public char colorCode = 'B';
  
  public double price = 99.99; // 0.0 Default price for all shirts
  
  public int quantityInStock = 45; // 0 Default quantity for all shirts
  
  // This method displays the values for an item
  public void displayInformation() {

    System.out.println("Shirt ID: " + shirtID);
    System.out.println("Shirt description:" + description);
    System.out.println("Color Code: " + colorCode);
    System.out.println("Shirt price: " + price);
    System.out.println("Quantity in stock: " + quantityInStock);

  } // end of display method
} // end of class
