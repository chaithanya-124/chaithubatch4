//1] write a function to find the sum of first 10 odd multiple of 3? (tracing, stack memory diagram ,comments for logic)

class A{
	public static void main(String args[]){
		System.out.println("main starts");
		add();//----------------------------------------function which redirect link to add function in the program (that is called function)
		System.out.println("main ends");
		return;
	}

public static void add(){
	System.out.println("function starts");
	int n;//----------------------------------------------------------------intialization
	for(n=0;n<=10;n++){//---------------------------------------------------for loop for recursive check from 0 to 10 numbers
			if(n%2!=0 && n%3==0){//------------------------------------------condition to check whether the numb is multiple of 3 and it is odd
System.out.println("odd number multiple of 3 which is less then 10 is:"+ n);//------------printing the value if it satisfy the above conditions

				System.out.println("function ends");
		}}
return;
}
}

/*TRACING 

main starts
goes to add() function
function starts
1] n=0<=10 true
0/2!=0 false , 0/3=0 true so true and false ==false
n++ ,n=1

2] n=1<=10 true
1/2!=0 true , 1/3=0 false so true and false ==false
n++ ,n=2

3] n=2<=10 true
2/2!=0 true , 2/3=0 false so true and false ==false
n++ ,n=3

4] n=3<=10 true
3/2!=0 true , 3/3=0 true so true and true ==true
print =3
n++ ,n=4

5] n=4<=10 true
4/2!=0 true , 4/3=0 false so true and false ==false
n++ ,n=5

6] n=5<=10 true
5/2!=0 true , 5/3=0 false so true and false ==false
n++ ,n=6

7] n=6<=10 true
6/2!=0 true , 6/3=0 true so true and true ==true
n++ ,n=7

8] n=7<=10 true
7/2!=0 true , 7/3=0 false so true and false ==false
n++ ,n=8

9] n=1<=10 true
8/2!=0 true , 8/3=0 false so true and false ==false
n++ ,n=9

10] n=9<=10 true
9/2!=0 true , 9/3=0 true so true and true ==true
n++ ,n=10

11] n=10<=10 true
10/2!=0 true , 10/3=0 false so true and false ==false
function ends
return to main
main ends
*/

/* STACK DIAGRAM 
						|					
                        |                    |----------------------------------------------|                                      |
                        |                    |                                              |                                      |
	                    |                    |    public static void add (){                |                                      |
		                |                    |     System.out.println("func starts");       |                                      |  
		                |                    |       for(i=0;i<=10;i++)                     |                                      |
		                |                    |          if(n%2!=0 && n%3==0)                |-------------|                        |
		                |                    |          ptint (n)                           |             |                        |
		                |                    |       System.out.println("func ends");       |             |                        |
		                |    |--------------------------return;                             |             |                        |
	                    |    |               |----------------------------------------------|             |                        |
                        |    |return to main                                                              |                        |
                        |    |                                                                            |calling the function    |
						|	 |				 |----------------------------------------------|             |                        |
                        |    |-------------------class A{                                   |             |                        |
	                    |                    |    public static void main(String args[]){   |             |                        |
		                |                    |     System.out.println("main starts");       |             |                        |
		                |                    |                add(); -------------------------------------|                        |
		                |                    |       System.out.println("main ends");       |                                      |
		             |--|---------------------------------return;                           |                                      |
	                 |  |                    |----------------------------------------------|                                      |
     JVM-------------|  |                                                                                                          |
                        |                                                                                                          |
                        |--------------------------------------------------------------------------------------------------------- |
                                                             STACK


*/
