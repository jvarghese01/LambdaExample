package org.jsonlibrary.demo;

public class LambdaExample2 {


    interface IntegerMath {
        int operation(int a, int b);   
    }
	
    /*public int operateBinary(int a, int b, IntegerMath op) {
        return op.operation(a, b);
    }*/
    
    
	public static void main(String[] args) {
		LambdaExample2 myApp = new LambdaExample2();
        IntegerMath op1 = (a, b) -> {return a + b;};
        IntegerMath op2 = (a, b) -> a - b;
        
        System.out.println("40 + 2 = " +
            op1.operation(40, 2));
        System.out.println("20 - 10 = " +
            op2.operation(20, 10));    
    
	}

}
