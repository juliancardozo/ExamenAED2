public class CounterTwo {
  
  public final int MAX_COUNT = 100;
     
  public void displayCount() {   
        
    for (int count = 1; count <= MAX_COUNT; ++count) {

      if (count % 12 ==0){
        System.out.println("" + count);
      }      
    }// end for      
  }// end displayCount method    
}// end class


