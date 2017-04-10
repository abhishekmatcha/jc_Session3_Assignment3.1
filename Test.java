public class Test{
		 static{
		 print(10);
		 }
		 static void print(int x){
		 System.out.println(x);
		 System.exit(0);
		 }
		 }


// correct option C
//This has two Answers
// explanation  only with in jdk 1.6:
//It will compile and run printing out 10
//---------------------------------------------------------------------------
//after versions 1.7 and 1.8  
//In 1.7 or above it will throw "main method not found please write public static void main(String args[])
//to get the answer." The option is not present here