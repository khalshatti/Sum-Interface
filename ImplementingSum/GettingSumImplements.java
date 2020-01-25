//******************************************************************
// GettingSumImplements.java     Author: Khaled Alshatti
//
// A program that calls five sum methods with different 
// parameter types and five multiply methods with different
// parameter types.
//******************************************************************
public class GettingSumImplements {

   public static void main(String[] args) {
      ImplementingSum s = new ImplementingSum();
      short a = 1;
      int b = 3;
      float c = 4.5f;
      double d = 6.75;
      
      System.out.println("a="+a+" b="+b+" c="+c+" d="+d);
      System.out.println("\nSUM OPERATIONS");   
      System.out.println("a+b="+s.sum(a,b));
      System.out.println("a+c="+s.sum(a,c));
      System.out.println("c+d="+s.sum(c,d));  
      System.out.println("a+b+c="+s.sum(a,b,c));
      System.out.println("c+d+b="+s.sum(c,d,b)); 
      System.out.println("\nMULTIPLICATION OPERATIONS");   
      System.out.println("a*b="+s.multiply(a,b));
      System.out.println("a*c="+s.multiply(a,c));
      System.out.println("c*d="+s.multiply(c,d));  
      System.out.println("a*b*c="+s.multiply(a,b,c));
      System.out.println("c*d*b="+s.multiply(c,d,b));   
   }        
}