class CustomerTest{
 public static void main(String args[]){
  Customer cObject1,cObject2;
  //initializing the fist Customer Object
  cObject1=new Customer();
  cObject1.customerID=1;
  cObject1.name="Henry Williams";
  cObject1.emailAddress="hwilliams@example.org";
 //initializing the second Customer Object
  cObject2=new Customer();
  cObject2.customerID=2;
  cObject2.name="Georgina";
  cObject2.emailAddress="george@myorg.com";
 //displaying the values of the Customer objects
  cObject1.displayCustomerInfo();
  cObject2.displayCustomerInfo();
 //Assigning the first object reference to the second object reference and displaying 
  cObject2=cObject1;
  cObject1.displayCustomerInfo();
  cObject2.displayCustomerInfo();
  
 }
}
