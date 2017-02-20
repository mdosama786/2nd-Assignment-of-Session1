
public class a20b10 {

	// Main Method
	public static void main(String[] args) {

		// Declares integer variables named a,b,c,d,e
		
		int a=20;		   // Assigning some values for each integer variable
		int b = a-- - --a; // using Arithmetic (Decrement and Subtraction) operator
		int c = a--; 	   // using Arithmetic (Decrement) operator
		int d = a >> 2;	   // using Bitwise (Right shift) Operator
		int e = a & b; 	   // using Bitwise (and) Operator

		// print the output of given integer values
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}
}