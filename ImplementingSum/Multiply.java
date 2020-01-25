//******************************************************************
// Multiply.java     Author: Khaled Alshatti
//
// A program that calls five sum methods with different 
// parameter types and five multiply methods with different
// parameter types.
//******************************************************************

public interface Multiply {
	// short, short x2 x3
	public int multiply(short x, short y);

	public int multiply(short x, short y, short z);

	// int
	public int multiply(int x, int y);

	// int with short
	public int multiply(short x, int y);

	public int multiply(int x, short y);

	// int
	public int multiply(int x, int y, int z);

	// int with short
	public int multiply(short x, int y, int z);

	public int multiply(int x, short y, int z);

	public int multiply(int x, int y, short z);

	public int multiply(short x, short y, int z);

	public int multiply(short x, int y, short z);

	public int multiply(int x, short y, short z);

	// float with float, int, short by 2
	public float multiply(short x, float y);

	public float multiply(float x, short y);

	public float multiply(float x, int y);

	public float multiply(int x, float y);

	public float multiply(float x, float y);

	// float by 3
	public float multiply(float x, float y, float z);

	// float with int
	public float multiply(int x, float y, float z);

	public float multiply(float x, int y, float z);

	public float multiply(float x, float y, int z);

	public float multiply(int x, int y, float z);

	public float multiply(int x, float y, int z);

	public float multiply(float x, int y, int z);

	// float with short
	public float multiply(short x, float y, float z);

	public float multiply(float x, short y, float z);

	public float multiply(float x, float y, short z);

	public float multiply(short x, short y, float z);

	public float multiply(short x, float y, short z);

	public float multiply(float x, short y, short z);

	// float with short and int
	public float multiply(short x, int y, float z);

	public float multiply(int x, short y, float z);

	public float multiply(short x, float y, int z);

	public float multiply(int x, float y, short z);

	public float multiply(float x, int y, short z);

	public float multiply(float x, short y, int z);

	// doubles with double, float, int, shorts by 2
	public double multiply(short x, double y);

	public double multiply(double x, short y);

	public double multiply(int x, double y);

	public double multiply(double x, int y);

	public double multiply(float x, double y);

	public double multiply(double y, float x);

	public double multiply(double x, double y);

	public double multiply(double x, double y, double z);

	// double with float
	public double multiply(float x, double y, double z);

	public double multiply(double x, float y, double z);

	public double multiply(double x, double y, float z);

	public double multiply(double x, float y, float z);

	public double multiply(float x, double y, float z);

	public double multiply(float x, float y, double z);

	// double with ints
	public double multiply(int x, double y, double z);

	public double multiply(double x, int y, double z);

	public double multiply(double x, double y, int z);

	public double multiply(int x, int y, double z);

	public double multiply(int x, double y, int z);

	public double multiply(double x, int y, int z);

	// double with shorts
	public double multiply(short x, double y, double z);

	public double multiply(double x, short y, double z);

	public double multiply(double x, double y, short z);

	public double multiply(double x, short y, short z);

	public double multiply(short x, double y, short z);

	public double multiply(short x, short y, double z);

	// double, float, with int or short
	public double multiply(double x, float y, int z);

	public double multiply(double x, float y, short z);

	public double multiply(float x, double y, int z);

	public double multiply(float x, double y, short z);

	public double multiply(int x, float y, double z);

	public double multiply(short x, float y, double z);
}
