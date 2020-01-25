//******************************************************************
// InterSum.java     Author: Khaled Alshatti
//
// A program that adds a body to each of the methods
//******************************************************************
public interface InterSum
{
   public int sum(short x, short y);
     
   public int sum(int x, int y) ;    
   public float sum(float x, float y) ;   
   public double sum(double x, double y);
   
   ///////////////////////////////////////
   public int sum(int x, short y);
   public int sum(short x, int y);
   public float sum(float x, short y);
   public float sum(short x, float y);   
   public double sum(double x, short y);
   public double sum(short x, double y);         
   public float sum(int x, float y);   
   public float sum(float x, int y) ;   
   public double sum(int x, double y);
   public double sum(double x, int y);
   public double sum(float x, double y);
   public double sum(double x, float y);  
   ////////////////////////////////////////   
   public int sum(short x, short y, short z) ;
      
   public int sum(int x, int y, int z) ;
    
   public float sum(float x, float y, float z) ;
   
   public double sum(double x, double y,double z) ; 
   ////////////////////////////// ints and short
   public int sum(int x, int y, short z) ;
    
   public int sum(short x, int y, int z) ;
   
   public int sum(int x, short y, int z) ;  
   
   public int sum(short x, short y, int z) ;
    
   public int sum(short x, int y, short z) ;
   
   public int sum(int x, short y, short z) ;  
   ////////////////////////////// ints and floats
   public float sum(int x, int y, float z) ;
    
   public float sum(float x, int y, int z) ;
   
   public float sum(int x, float y, int z) ;  
   
   public float sum(float x, float y, int z) ;
    
   public float sum(float x, int y, float z) ;
   
   public float sum(int x, float y, float z) ;  
   ////////////////////////////// ints and doubles
   public double sum(int x, int y, double z) ;
    
   public double sum(double x, int y, int z) ;
   
   public double sum(int x, double y, int z) ;  
   
   public double sum(double x, double y, int z) ;
    
   public double sum(double x, int y, double z) ;
   
   public double sum(int x, double y, double z) ;   
  ////////////////////////////// shorts and floats
   public float sum(short x, short y, float z) ;
    
   public float sum(float x, short y, short z) ;
   
   public float sum(short x, float y, short z) ;  
   
   public float sum(float x, float y, short z) ;
    
   public float sum(float x, short y, float z) ;
   
   public float sum(short x, float y, float z) ;  
   ////////////////////////////// shorts and doubles
   public double sum(short x, short y, double z) ;
    
   public double sum(double x, short y, short z) ;
   
   public double sum(short x, double y, short z) ;  
   
   public double sum(double x, double y, short z) ;
    
   public double sum(double x, short y, double z) ;
   
   public double sum(short x, double y, double z) ;     
   ////////////////////////////// floats and doubles
   public double sum(float x, float y, double z) ;
    
   public double sum(double x, float y, float z) ;
   
   public double sum(float x, double y, float z) ;  
   
   public double sum(double x, double y, float z) ;
    
   public double sum(double x, float y, double z) ;
   
   public double sum(float x, double y, double z) ;  
   ////////////////////////////// ints, floats and doubles
   public double sum(int x, float y, double z) ;
   
   public double sum(int x, double y, float z) ;  
    
   public double sum(float x, int y, double z) ;
   
   public double sum(float x, double y, int z) ;  
   
   public double sum(double x, float y, int z) ;
    
   public double sum(double x, int y, float z) ;
  ////////////////////////////// shorts,ints, floats
   public float sum(int x, float y, short z) ;
   
   public float sum(int x, short y, float z) ;  
    
   public float sum(float x, int y, short z) ;
   
   public float sum(float x, short y, int z) ;  
   
   public float sum(short x, float y, int z) ;
    
   public float sum(short x, int y, float z) ;   
  ////////////////////////////// shorts,floats,doubles
   public double sum(double x, float y, short z) ;
   
   public double sum(double x, short y, float z) ;  
    
   public double sum(float x, double y, short z) ;
   
   public double sum(float x, short y, double z) ;  
   
   public double sum(short x, float y, double z) ;
    
   public double sum(short x, double y, float z) ;   
  ////////////////////////////// shorts,ints, double
   public double sum(int x, double y, short z) ;
   
   public double sum(int x, short y, double z) ;  
    
   public double sum(double x, int y, short z) ;
   
   public double sum(double x, short y, int z) ;  
   
   public double sum(short x, double y, int z) ;
    
   public double sum(short x, int y, double z) ;  
}