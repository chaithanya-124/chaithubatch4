//Design a function to return the area of trapizium and print it in main function. 
class A{
	public static void main(String args[]){
	int area;// declaring
	area=trap();// calling the function
	System.out.println(area);// printing the area
	return;// returnig control to jvm
	}
	public static int trap(){
	int a=2;//declaring and initializing
	int b=3;//declaring and initializing
	int h=4;//declaring and initializing
	int l=(a+b);//declaring
	int k=l*h;//declaring
	int area=h/2;//declaring
	return area;// returnig the area value to the main function
	}
}

/*TRACING
redirecting from main to called function that is tap
l=5
k=20
area 10
return 10 to main 
printed 10*/