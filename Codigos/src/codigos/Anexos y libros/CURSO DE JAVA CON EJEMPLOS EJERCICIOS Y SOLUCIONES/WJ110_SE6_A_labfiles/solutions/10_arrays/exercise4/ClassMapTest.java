class ClassMapTest{

  public static void main(String args[]){
    // creating ClassMap instance
    ClassMap cm =new ClassMap(1);


    // Allocating position to one student
    cm.setDesk("Ann");

    //Allocating position to another student
    cm.setDesk("Bond");

    //Allocating position to third student
    cm.setDesk("Cindy");

    //Allocating position to fourth student
    cm.setDesk("Donald");
    

    //Displaying the map of the class 
    cm.displayDeskMap();
    
    //Searching the desk of a student 
    cm.searchDesk("Donald");

   //Searching the desk of another student 
    cm.searchDesk("Ronn");


  } //end main
 }//end class

