//4]write a function to find the odd qube numbers between 1 and 50?(tracing, stack memory diagram ,comments for logic)
class A{
	public static void main (String args[]){
	System.out.println("main start");
	cub();
	System.out.println("main end");
	return;
	}
	public static void cub(){
	System.out.println("func start");
	int n;
	for(n=0;n<=10;n++){
		if(n%2==0 && n==(n*n*n/2)){
	System.out.println(n);
	System.out.println("func end");
	return;
	}
	}
	}
}
