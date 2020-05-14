package warmUps;

public class Vector {
	private double x;
	private double y;
	private double z;
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	
	public double calcullateMagnitude() {
		return Math.sqrt((Math.pow(x, 2.0)) + Math.pow(y, 2.0) + Math.pow(z, 2.0));
	}
	
	//they should be non static because they will be used by instances of vector class
}
