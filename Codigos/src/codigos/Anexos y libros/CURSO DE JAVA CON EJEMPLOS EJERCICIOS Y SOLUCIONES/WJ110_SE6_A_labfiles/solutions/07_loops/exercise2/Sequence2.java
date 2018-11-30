public class Sequence2 {

  public int firstNumber = 0;
  public int secondNumber = 1;
  public int nextNumber;
  public final int SEQUENCE_COUNT = 10;

  public void displaySequence() {

    // Print first two number of sequence
    System.out.print(firstNumber + " ");
    System.out.print(secondNumber + " ");

    // loop for the correct count of numbers in the sequence
    for (int count = 2; count < SEQUENCE_COUNT; count++) {

		// Calculate and display the next number in sequence
		nextNumber = firstNumber + secondNumber;
		System.out.print(nextNumber + " ");

		firstNumber = secondNumber; // New first number
		secondNumber = nextNumber; // New second number

    } // end of loop body

    //Finish sequence with a newline character
    System.out.println();

  }//end of displaySequence method
}// end class


