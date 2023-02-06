package Assign;
public class Point {
	private int x;
	private int y;
	
	public Point(int x, int y) {
	    this.x = x;
	    this.y = y;
	}

	public double distance() {
	    return(Math.sqrt(x*x + y*y));
	}

	public double distance(Point p) {
	    int xDiff = x - p.x;
	    int yDiff = y - p.y;
	    return(Math.sqrt(xDiff*xDiff + yDiff*yDiff));
	}

	public int getX() {
	    return x;
	}

	public int getY() {
	    return y;
	}

}