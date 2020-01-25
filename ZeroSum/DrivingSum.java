//************************************************************
// DrivingSum.java   Author: Khaled Alshatti 
//
// To override the parent to produce the real results  
//************************************************************
public class DrivingSum { 
   public static void main(String[] args) {
      int x = 10; 
      
      int y = 20; 
      
      // x + y = 30....yay? 
      
      ZeroSum zero= new ZeroSum();
      
      RealSum real= new RealSum(); 
      
      System.out.println("Calling ZeroSum " + zero.sum(x, y) ); 
      
      System.out.println("Calling ZeroSum " + real.sum(x, y) );
   }
}