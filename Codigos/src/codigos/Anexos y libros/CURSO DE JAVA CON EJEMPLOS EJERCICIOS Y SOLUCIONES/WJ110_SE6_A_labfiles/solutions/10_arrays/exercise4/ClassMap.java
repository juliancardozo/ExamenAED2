public class ClassMap { 
  // member variables
  private int roomNo;
  private String [][] deskArray;
   
 
  //argument constructor
  public ClassMap(int id){
  deskArray=new String[3][4]; 
   roomNo=id;   
  } 
 
  //method to set desk position for student
  public void setDesk(String name) {

    boolean flag=false;
    for ( int row=0;row<3;row++){
      for (int col=0;col<4;col++){
      if (deskArray[row][col]==null){
      deskArray[row][col]=name;
      System.out.println(name +"  Desk set at position: Row:"+row +" Column:"+col);
      flag=true;
      break;
     }
    } 
   if (flag==true){
     break;
    } 
   }
   if (flag==false){
  System.out.println("All desks occupied, try another class");
   }
 
  } //end method

  
  //method to diplay the desk map of the class
  public void displayDeskMap(){

    for ( int row=0;row<3;row++){
      for (int col=0;col<4;col++){
        System.out.print("  "+deskArray[row][col]+"  ");   
       }
      System.out.println();
    }
 
  }//end method


  //method to search the desk of a student
  public void searchDesk(String name){

    boolean flag=false;
    for ( int row=0;row<3;row++){
      for (int col=0;col<4;col++){
       if (deskArray[row][col] !=null && deskArray[row][col].equals(name)==true){
         System.out.println(name+"  Desk Position:  Row:  " +row+"  Column:  "+col);
         flag=true;
         break;
        }
      }
   if (flag==true){
     break;
   }
   }
   if (flag==false){ 

   System.out.println("Desk not allocated for:   "+name);
   }
  
  } //end method
}//end class

        
             

 

    






  

   


    
        
    
