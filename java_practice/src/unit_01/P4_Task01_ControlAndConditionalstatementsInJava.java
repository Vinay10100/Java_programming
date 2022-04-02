package unit_01;
/*
# Control Statements and Conditional Statements: 
- Java provides three types of control flow statements.
- Decision Making statements 
- if statements 
- switch statement 
- Loop statements 
	- do while loop 
	- while loop 
	- for loop 
	- for-each loop 
	- Jump statements 
	- break statement 
	- continue statement 
 */
public class P4_Task01_ControlAndConditionalstatementsInJava {

	public static void main(String[] args) {
		
		Statements obj = new Statements();
		obj.DecisionMakingStatements(); 
		obj.LoopStatements(); 
		obj.JumpStatements(); 

	}

}

class Statements
{
  void DecisionMakingStatements()
  {
	  int x = 10;
	  int y = 12;
	  if(x + y < 10)
	  {		  
		  System.out.println("x + y is less than 10");
	  }
	  else
	  {
		  System.out.println("x + y is greater than 20"); 
	  }
	  int num=2;
	  //Can we use char instead of int as num??
	  switch(num) //switch (expression) 
	  {
	  case 0: //Case value 1
		  System.out.println("Number is 0");
		  break;
	  case 1:
		  System.out.println("Number is 1");
		  break;
	  default:
		  System.out.println(num);
	  
	  } 
 }
void LoopStatements()
{
	/*
	 * for(initialization, condition, increment/decrement) {//block of statements}
	 * for(data_type var : array_name/collection_name){ //statements } 
	 */ 

	//For loop
	int sum=0;
	for(int j=0;j<=10;j++)
	{
		sum = sum + j;	
	}
	System.out.println("The sum of first 10 natural number is :" + sum); 
	 
	String[] names= {"Java","C","C++","Python","Javascript"};
	System.out.println("Printing the contents of array names:\n");
	for(String name : names){
		System.out.println(name);		
	}
	/*
	 * while(condition){ //looping statements }
	 */
	int i=0;
	System.out.println("Printing the list of first 10 even numbers \n");
	while(i<=10){
		System.out.println(i);
		i = i + 2;
		
	}
	/*
	 * do-while do { //statements } while(condition);
	 */
    i=0;
    System.out.println("Printing the list of first 10 even numbers\n");
    do {
    	System.out.println(i);
    	i=i+2;
    }while(i<=10);
}
void JumpStatements()
{
	//Break
for(int i=0;i<=10;i++)
	{
	if(i==6)
		break;
System.out.println(i);
}
   //Continue 
for(int i=0;i<=10;i++)
      {
      if(i==6){
    	  continue;
      }
      System.out.println(i);
      }
	}
}
