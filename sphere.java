//Design a function to return the volume of sphere and print it in main function.

class A{
	public static void main(String args[]){
	double area;//declaring 
	area=sphere();//calling function
	System.out.println(area);//printing area
	return;//declaring and initializing
}public static double sphere(){
	int basearea=2;//declaring and initializing
	int h=8;//declaring and initializing//declaring and initializing
	int k=h*basearea;//declaring 
	double area=k/3;//declaring 
	return area;//returning the value to calling fucntion
	}
}
/* TRACING 
 area=sphere()
 basearea=2
 h=8
 area= value
 return value to main 
 print value
 return to jvm*/
