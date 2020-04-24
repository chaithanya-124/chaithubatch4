//2]write a function to find the even multiple of 5 and 7 between 10 and 100? (tracing, stack memory diagram ,comments for logic)
 class A{
 public static void main(String args[]){
 System.out.println("main starts");
 even();
 System.out.println("main ends");
 return;
 }
 public static void even(){
 System.out.println("func strats");
 int n;
 for(n=10;n<100;n++){
 if(n%5==0 && n%7==0){
 System.out.println(n);
 System.out.println("func end");
 return;
 }
 }
}
}
