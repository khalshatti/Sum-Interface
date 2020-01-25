//************************************************************
// RealSum.java   Author: Khaled Alshatti 
//
// To override the parent to produce the real results  
//************************************************************
import java.util.Random;

//This class overloads the sum method several ways.
public class RealSum extends ZeroSum{ 
   ///////////////////////////////////
   public int sum(short x, short y) {
      return x+y;
   }
     
   public int sum(int x, int y) {
      return x+y;
   }
    
   public float sum(float x, float y) {
      return x+y;
   }
   
   public double sum(double x, double y) {
      return x+y;
   }   
   
   ///////////////////////////////////////
   public int sum(int x, short y) {
      return x+y;
   }  
   public int sum(short x, int y) {
      return x+y;
   }  
   public float sum(float x, short y) {
      return x+y;
   }  
   public float sum(short x, float y) {
      return x+y;
   } 
   public double sum(double x, short y) {
      return x+y;
   }  
   public double sum(short x, double y) {
      return x+y;
   }            
   public float sum(int x, float y) {
      return x+y;
   } 
   public float sum(float x, int y) {
      return x+y;
   }
   public double sum(int x, double y) {
      return x+y;
   }  
   public double sum(double x, int y) {
      return x+y;
   }   
   public double sum(float x, double y) {
      return x+y;
   }  
   public double sum(double x, float y) {
      return x+y;
   } 
  
   ////////////////////////////////////////   
   public int sum(short x, short y, short z) {
      return x+y+z;
   }
      
   public int sum(int x, int y, int z) {
      return x+y+z;
   }
    
   public float sum(float x, float y, float z) {
      return x+y+z;
   }
   
   public double sum(double x, double y,double z) {
      return x+y+z;
   } 
   ////////////////////////////// ints and short
   public int sum(int x, int y, short z) {
      return x+y+z;
   }
    
   public int sum(short x, int y, int z) {
      return x+y+z;
   }
   
   public int sum(int x, short y, int z) {
      return x+y+z;
   }  
   
   public int sum(short x, short y, int z) {
      return x+y+z;
   }
    
   public int sum(short x, int y, short z) {
      return x+y+z;
   }
   
   public int sum(int x, short y, short z) {
      return x+y+z;
   }  
   ////////////////////////////// ints and floats
   public float sum(int x, int y, float z) {
      return x+y+z;
   }
    
   public float sum(float x, int y, int z) {
      return x+y+z;
   }
   
   public float sum(int x, float y, int z) {
      return x+y+z;
   }  
   
   public float sum(float x, float y, int z) {
      return x+y+z;
   }
    
   public float sum(float x, int y, float z) {
      return x+y+z;
   }
   
   public float sum(int x, float y, float z) {
      return x+y+z;
   }  
   ////////////////////////////// ints and doubles
   public double sum(int x, int y, double z) {
      return x+y+z;
   }
    
   public double sum(double x, int y, int z) {
      return x+y+z;
   }
   
   public double sum(int x, double y, int z) {
      return x+y+z;
   }  
   
   public double sum(double x, double y, int z) {
      return x+y+z;
   }
    
   public double sum(double x, int y, double z) {
      return x+y+z;
   }
   
   public double sum(int x, double y, double z) {
      return x+y+z;
   }   
  ////////////////////////////// shorts and floats
   public float sum(short x, short y, float z) {
      return x+y+z;
   }
    
   public float sum(float x, short y, short z) {
      return x+y+z;
   }
   
   public float sum(short x, float y, short z) {
      return x+y+z;
   }  
   
   public float sum(float x, float y, short z) {
      return x+y+z;
   }
    
   public float sum(float x, short y, float z) {
      return x+y+z;
   }
   
   public float sum(short x, float y, float z) {
      return x+y+z;
   }  
   ////////////////////////////// shorts and doubles
   public double sum(short x, short y, double z) {
      return x+y+z;
   }
    
   public double sum(double x, short y, short z) {
      return x+y+z;
   }
   
   public double sum(short x, double y, short z) {
      return x+y+z;
   }  
   
   public double sum(double x, double y, short z) {
      return x+y+z;
   }
    
   public double sum(double x, short y, double z) {
      return x+y+z;
   }
   
   public double sum(short x, double y, double z) {
      return x+y+z;
   }     
   ////////////////////////////// floats and doubles
   public double sum(float x, float y, double z) {
      return x+y+z;
   }
    
   public double sum(double x, float y, float z) {
      return x+y+z;
   }
   
   public double sum(float x, double y, float z) {
      return x+y+z;
   }  
   
   public double sum(double x, double y, float z) {
      return x+y+z;
   }
    
   public double sum(double x, float y, double z) {
      return x+y+z;
   }
   
   public double sum(float x, double y, double z) {
      return x+y+z;
   }  
   ////////////////////////////// ints, floats and doubles
   public double sum(int x, float y, double z) {
      return x+y+z;
   }
   
   public double sum(int x, double y, float z) {
      return x+y+z;
   }  
    
   public double sum(float x, int y, double z) {
      return x+y+z;
   }
   
   public double sum(float x, double y, int z) {
      return x+y+z;
   }  
   
   public double sum(double x, float y, int z) {
      return x+y+z;
   }
    
   public double sum(double x, int y, float z) {
      return x+y+z;
   }
  ////////////////////////////// shorts,ints, floats
   public float sum(int x, float y, short z) {
      return x+y+z;
   }
   
   public float sum(int x, short y, float z) {
      return x+y+z;
   }  
    
   public float sum(float x, int y, short z) {
      return x+y+z;
   }
   
   public float sum(float x, short y, int z) {
      return x+y+z;
   }  
   
   public float sum(short x, float y, int z) {
      return x+y+z;
   }
    
   public float sum(short x, int y, float z) {
      return x+y+z;
   }   
  ////////////////////////////// shorts,floats,doubles
   public double sum(double x, float y, short z) {
      return x+y+z;
   }
   
   public double sum(double x, short y, float z) {
      return x+y+z;
   }  
    
   public double sum(float x, double y, short z) {
      return x+y+z;
   }
   
   public double sum(float x, short y, double z) {
      return x+y+z;
   }  
   
   public double sum(short x, float y, double z) {
      return x+y+z;
   }
    
   public double sum(short x, double y, float z) {
      return x+y+z;
   }   
  ////////////////////////////// shorts,ints, double
   public double sum(int x, double y, short z) {
      return x+y+z;
   }
   
   public double sum(int x, short y, double z) {
      return x+y+z;
   }  
    
   public double sum(double x, int y, short z) {
      return x+y+z;
   }
   
   public double sum(double x, short y, int z) {
      return x+y+z;
   }  
   
   public double sum(short x, double y, int z) {
      return x+y+z;
   }
    
   public double sum(short x, int y, double z) {
      return x+y+z;
   }                              
}