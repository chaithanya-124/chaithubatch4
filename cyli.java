 //Design a function to return the surfacearea of cylinder and print it in main function.
 class A{
 public static void main(String args[]){
double area;//declaring 
area=cyli();//calling function
System.out.println(area);//printing area
return;
 }public static double cyli(){
 int r=2;//declaring and initializing
 int h=4;
 double pai=3.14;//declaring and initializing
 double area=2*h*r*pai;//declaring 
 return area;//returning the area
 }
 }
 /* TRACING 
 area=cyli()
 r=2
 h=4
 area= value
 return value to main 
 print value
 return to jvm*/
