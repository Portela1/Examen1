import java.awt.Point;
import java.awt.Rectangle;

/*
 * Represents a rectangle by an upper-left and a lower-right points
 */
public class PointRectangle {
	
	private Point upperLeft;
	private Point lowerRight;
	
	//Constructors
	
	public PointRectangle(Point upperLeft, Point lowerRight) {
		super();
		this.upperLeft = upperLeft;
		this.lowerRight = lowerRight;
	}
	
	/*
	 * Builds a PointRectangle with the same location and dimensions as the
	 * parameter rectangle.
	 */
	public PointRectangle(Rectangle r) {
		this.upperLeft = r.getLocation();
		
	
		
		
	}
	
	//Getters

	public Point getUpperLeft() {
		return upperLeft;
	}

	public Point getLowerRight() {
		return lowerRight;
	}
	
	//Setters

	public void setUpperLeft(Point upperLeft) {
		this.upperLeft = upperLeft;
	}

	public void setLowerRight(Point lowerRight) {
		this.lowerRight = lowerRight;
	}
	
	//Instance Methods
	
	/*
	 * Modifies the target PointRectangle to relocate deltax units horizontally
	 * and deltay units vertically. 
	 */
	public void translate(int deltax, int deltay) {
		this.upperLeft.translate(deltax, deltay);
		this.lowerRight.translate(deltax, deltay);
		
		
	}
	
	/*
	 * Return the perimeter of the target PointRectangle.  Remember that the
	 * perimeter is defined as the sum of the lengths of all its four sides. 
	 * HINT: Consider using the distance method from the Point class.
	 */
	public double perimeter() {
		double lon = 0;
		double up = 0;
		lon = (this.lowerRight.getX() - this.upperLeft.getX());
		up = (this.lowerRight.getY() - this.upperLeft.getY());
		return (2*lon) + (2*up);
	}
	
	/*
	 * Return the area of the target PointRectangle.  Remember that the
	 * area is defined as the product of the height by the width of the
	 * rectangle.
	 * HINT: Consider using the distance method from the Point class.
	 */
	public double area() {
		double lon = 0;
		double up = 0;
		lon = (this.lowerRight.getX() - this.upperLeft.getX());
		up = (this.lowerRight.getY() - this.upperLeft.getY());
		return lon*up;
	}
	
	/*
	 * Returns a new Rectangle consisting of the original rectangle with the lower
	 * right point moved to the left by half the width of the rectangle.  The resulting
	 * rectangle will have half the area of the original.
	 * HINT: Carefully read the test cases to make sure you understand how the method
	 * should work.
	 */
	public PointRectangle halfByWidth() {
		Point NP = this.lowerRight;
		int tr = 0;
		tr = (NP.x/2)*-1;
		NP.translate(tr, 0);
		
		return new PointRectangle(this.upperLeft,NP);
		
	}
}








