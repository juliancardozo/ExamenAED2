public class Sequence1 {
 
  public int firstNumber = 0;
  public int secondNumber = 1;
  public int nextNumber;
  public final int SEQUENCE_LIMIT = 100;

  public void displaySequence() {

    // Print first two number of sequence
    System.out.print(firstNumber + " ");
    System.out.print(secondNumber + " ");

	// Calculate next potential number in sequence
	nextNumber = firstNumber + secondNumber;

    while (nextNumber <= SEQUENCE_LIMIT) {

		// Display next number in sequence
		System.out.print(nextNumber + " ");

		firstNumber = secondNumber; // New first number
		secondNumber = nextNumber; // New second number

		// Calculate next potential number in sequence
		nextNumber = firstNumber + secondNumber;

    } // end of loop body

    //Finish sequence with a newline character
    System.out.println();

  }//end of displaySequence method
}// end class




