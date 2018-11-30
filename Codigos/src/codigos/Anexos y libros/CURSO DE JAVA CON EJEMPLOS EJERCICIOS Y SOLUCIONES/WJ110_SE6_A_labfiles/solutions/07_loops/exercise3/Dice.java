public class Dice {

  public int diceNumber1;
  public int diceNumber2;

  public void throwDice() {

    do {
		// Generate random numbers for the dice values
		diceNumber1 = (int)( Math.random()*6 + 1 );
		diceNumber2 = (int)( Math.random()*6 + 1 );

		// Display the dice values
		System.out.println(diceNumber1 + " + " + diceNumber2);

    }
    while (diceNumber1 == diceNumber2);

  }// end throwDice method
}// end class


