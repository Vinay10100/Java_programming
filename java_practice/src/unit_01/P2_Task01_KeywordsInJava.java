package unit_01;

/*
 * 
 * - 50 such keywords[reserved words],meanings are defined by the compiler
 * - 48 + 2
 * - 48 use
 * - 2 for future use [goto*, const*]
 * 
 * future use: goto*,const*
 * 1.2V : assert**
 * 1.4V : strictfp***
 * 5.0V : enum****
 
 * - Keywords: can not be used as identifiers in java [int a=10;]
 * - object 
 * - variable name
 * - function
 * - class
 * - etc.
 * 
 * */

public class P2_Task01_KeywordsInJava {

	public static void main(String[] args) {
		
		
		
		
		//Variable name
		//Syntax error on token "double", invalid VariableDeclaratorId
		int double =10;
		
		
		//Function Name 
		int new() {
			
			//sysout{ctrl+space}
			System.out.println();
			
			return 0;
		}
		
		int a =10;
		a=11;

		//class name[given below]
		
		//object	
		//object name can never be any keywords in java
		ABC int = new ABC();
		//obj.display();
		
	}
	
}

//class name can never be any keywords in java
class int {
	
	void display(){
		System.out.println("Another Class!!");
	}
}

class ABC {
	void display(){
		System.out.println("Another Class!!");
	}
}
