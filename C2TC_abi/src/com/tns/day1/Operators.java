package com.tns.day1;

public class Operators {

	

	public static void main(String[] args) {
		         
		       
		        int a = 10;
		        int b = 3;
		     
		        //Arithmetic operators
		        System.out.println("Addition: " + (a + b));
		        System.out.println("Subtraction: " + (a - b));
		        System.out.println("Multiplication: " + (a * b));
		        System.out.println("Division: " + (a / b));
		        System.out.println("Modulo: " + (a % b));
		       
		        // Logical operators
		        boolean result1 = (a > b) && (a > 5);  
		        boolean result2 = (a > b) || (b > 5);
		        boolean result3 = !(a > b);            

		        System.out.println("Logical AND (a > b && a > 5): " + result1);
		        System.out.println("Logical OR (a > b || b > 5): " + result2);
		        System.out.println("Logical NOT (!(a > b)): " + result3);
		        
		     // Bitwise operators
		        int bitwiseAnd = a & b;  
		        int bitwiseOr = a | b;   
		        int bitwiseXor = a ^ b;  
		        int bitwiseNotA = ~a;    
		        int leftShift = a << 1; 
		        int rightShift = a >> 1; 

		        System.out.println("Bitwise AND (a & b): " + bitwiseAnd);
		        System.out.println("Bitwise OR (a | b): " + bitwiseOr);
		        System.out.println("Bitwise XOR (a ^ b): " + bitwiseXor);
		        System.out.println("Bitwise NOT (~a): " + bitwiseNotA);
		        System.out.println("Left Shift (a << 1): " + leftShift);
		        System.out.println("Right Shift (a >> 1): " + rightShift);
		        
		     // Increment and Decrement operators
		        int preIncrement = ++a;  
		        int postIncrement = b++;
		        int preDecrement = --a;  
		        int postDecrement = b--; 
		        
		        System.out.println("Pre-increment (++a): " + preIncrement);
		        System.out.println("Post-increment (b++): " + postIncrement);
		        System.out.println("Pre-decrement (--a): " + preDecrement);
		        System.out.println("Post-decrement (b--): " + postDecrement);
		        
		     // Relational operators
		        boolean isEqual = a == b;          
		        boolean isNotEqual = a != b;       
		        boolean isGreater = a > b;         
		        boolean isLess = a < b;            
		        boolean isGreaterOrEqual = a >= b; 
		        boolean isLessOrEqual = a <= b;    

		        System.out.println("Is a equal to b? (a == b): " + isEqual);
		        System.out.println("Is a not equal to b? (a != b): " + isNotEqual);
		        System.out.println("Is a greater than b? (a > b): " + isGreater);
		        System.out.println("Is a less than b? (a < b): " + isLess);
		        System.out.println("Is a greater than or equal to b? (a >= b): " + isGreaterOrEqual);
		        System.out.println("Is a less than or equal to b? (a <= b): " + isLessOrEqual);
		        
		     // Assignment operators
		        int c = 5;
		        c += 3;  
		        System.out.println("Assignment (c += 3): " + c);
		        
		        c -= 2;  
		        System.out.println("Assignment (c -= 2): " + c);
		        
		        c *= 4;  
		        System.out.println("Assignment (c *= 4): " + c);
		        
		        c /= 2;  
		        System.out.println("Assignment (c /= 2): " + c);
		        
		        c %= 3;  
		        System.out.println("Assignment (c %= 3): " + c);
		        
		     // Ternary operator
		        int max = (a > b) ? a : b; 
		        System.out.println("Maximum of a and b: " + max);

		        int min = (a < b) ? a : b;
		        System.out.println("Minimum of a and b: " + min);
		        
		     // Ternary operator with logical NOT
		        String comparison = !(a > b) ? "b is greater or equal to a" : "a is greater than b";
		        System.out.println("Ternary with NOT: " + comparison);
		          
		    }
		}


