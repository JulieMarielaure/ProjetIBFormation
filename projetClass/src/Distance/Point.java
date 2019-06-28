package Distance;

public class Point {

	private double X1, Y1;
	private double X2, Y2;
	private double distance;
	
	public Point(double x1, double y1, double x2, double y2, double dist) {
		this.X1 = x1;
		this.Y1 = y1;
		this.X2 = x2;
		this.Y2 = y2;
		this.distance=dist;
	}
		
	@Override
	public String toString() {
		return "Point [X1=" + X1 + ", Y1=" + Y1 + ", X2=" + X2 + ", Y2=" + Y2 + ", dist=" + distance + "]";
	}

	public String distance() {
		
	double dist = Math.sqrt((X2 - X1) * (X2 - X1) + (Y2 - Y1) * (Y2 - Y1));
	System.out.println("La distance est " + distance);
	return null;
		
	}
	
}
