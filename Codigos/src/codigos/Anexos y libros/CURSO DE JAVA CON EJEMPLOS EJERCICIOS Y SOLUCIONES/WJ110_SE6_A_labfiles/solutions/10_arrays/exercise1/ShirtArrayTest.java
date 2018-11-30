public class ShirtArrayTest {

    public static void main (String args[]) {

        Shirt [] shirts;
	shirts = new Shirt[3];

        shirts[0] = new Shirt(44229, "Work", 'G', 29.99, 100);
        shirts[1] = new Shirt(33429, "Denim", 'R',44.99, 10);
        shirts[2] = new Shirt(43300, "Mesh", 'B', 79.99, 50);
    
	Shirt firstShirt = shirts[0];
	firstShirt.displayInformation();

	Shirt secondShirt = shirts[1];
	secondShirt.displayInformation();

	shirts[2].displayInformation();
    
    } // end main
     
} // end class
