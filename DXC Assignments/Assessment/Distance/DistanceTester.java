package Assign;

public class DistanceTester {
		public static void main(String[] args) {
			Point p1 = new Point(2, 3);
			System.out.println("The distance of p1 from origin is: " + p1.distance());
			Point p2 = new Point(5, 6);
			System.out.println("The distance between p1 and p2 is: " + p1.distance(p2));
			}
	}


