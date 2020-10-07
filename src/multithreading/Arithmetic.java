package multithreading;

import java.util.Scanner;
import java.util.Stack;

public class Arithmetic {

	public static int expression(String expression)
	{
		char [] tokens=expression.toCharArray();
		
		
		Stack<Integer> values=new Stack<Integer>();
		
		
		Stack<Character> op=new Stack<Character>();
		
		for (int i = 0; i < tokens.length; i++) {
			
			if(tokens[i] == ' ')
				continue;
			
			if(tokens[i] >= '0' && tokens[i] <= '9') {
				StringBuffer sbf=new StringBuffer();
				
				while(i < tokens.length && tokens[i] >= '0'  && tokens[i] <= '9')
					sbf.append(tokens[i++]);
				values.push(Integer.parseInt(sbf.toString()));
			}
			
				else if (tokens[i] == '(') 
						op.push(tokens[i]);
			
				else if (tokens[i] == ')') {
					while(op.peek() != '(')
						values.push(applyOp(op.pop(),values.pop(),values.pop()));
					op.pop();
				}
			
				else if (tokens[i] == '{') 
					op.push(tokens[i]);
			
				else if (tokens[i] == '}') {
					while(op.peek() != '{') 
						values.push(applyOp(op.pop(),values.pop(),values.pop()));
					op.pop();
				}
			      
				else if (tokens[i] == '[') 
					op.push(tokens[i]);
			
			
				else if (tokens[i] == ']') {
					while(op.peek() != '[') 
						values.push(applyOp(op.pop(),values.pop(),values.pop()));
					op.pop();
				}
			
			
					else if (tokens[i] == '+' || tokens[i] == '-' || 
		                     tokens[i] == '*' || tokens[i] == '/') 
					{
						
						  
						 while (!op.empty() && hasPrecedence(tokens[i], op.peek())) 
			                  values.push(applyOp(op.pop(), values.pop(), values.pop())); 
			  	
						
			                op.push(tokens[i]); 	
				}
			}
		 
		
		while(!op.empty()) 
			values.push(applyOp(op.pop(),values.pop(),values.pop()));
		
		
		return values.pop();
		}
	
	
		public static boolean hasPrecedence(char op1, char op2) 
	    { 
	        if (op2 == '{' || op2 == '}')  
	            return false; 
	        
	        if (op2 == '(' || op2 == ')') 
	            return false; 
	        
	        if (op2 == '[' || op2 == ']') 
	            return false; 
	        
	        
	        if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-')) 
	            return false; 
	        else
	            return true; 
	    }
		
		 
	     
		 public static int applyOp(char op, int b, int a) 
		    { 
		        switch (op) 
		        { 
		        case '+': 
		            return a + b; 
		        case '-': 
		            return a - b; 
		        case '*': 
		            return a * b; 
		        case '/': 
		            if (b == 0) 
		                throw new
		                UnsupportedOperationException("Cannot divide by zero"); 
		            return a / b; 
		        } 
		        return 0; 
		    } 
	
		
		public static void main(String[] args) {
			
	        Scanner sc=new Scanner(System.in);
	      
	        System.out.println("enter the expression");
	        String str=sc.nextLine();
	        System.out.println(Arithmetic.expression( str)); 
	        

		}
			}
