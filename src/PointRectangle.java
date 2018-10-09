import java.awt.Point;
import java.awt.Rectangle;
import java.awt.geom.Point2D;

/*
 * Represents a rectangle by an upper-left and a lower-right points
 */
public class PointRectangle {
	
	private Point upperLeft;
	private Point2D lowerRight;
	
	//Constructors
	
	public PointRectangle(Point upperLeft, Point2D lowerRight) {
		super();
		this.upperLeft = upperLeft;
		this.lowerRight = lowerRight;
	}
	
	/*
	 * Builds a PointRectangle with the same location and dimensions as the
	 * parameter rectangle.
	 */
	public PointRectangle(Rectangle r) {
		
		this.upperLeft = new Point((int)r.getX(),(int)r.getY());
		this.lowerRight = new Point((int)(r.getX()+r.getWidth()),(int) (r.getY()+r.getHeight()));
		
		
		
		
	
		
		
	}
	
	//Getters

	public Point getUpperLeft() {
		return (Point) upperLeft;
	}

	public Point getLowerRight() {
		return (Point) lowerRight;
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
		((Point) this.upperLeft).translate(deltax, deltay);
		((Point) this.lowerRight).translate(deltax, deltay);
		
		
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
		
		Point ul = new Point((int)(this.upperLeft.getX()),(int)(this.upperLeft.getY()));
		
		Point2D lr  = new Point((int)(this.lowerRight.getX()),(int)(this.lowerRight.getY()));
		
		lr.setLocation(lr.getX()/2.0,lr.getY());
		
		
		
		
		
		
		return new PointRectangle( ul, lr);
		
	}
}








