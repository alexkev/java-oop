/* 
 *               «interface»
 * java.lang.Comparable<ComparableCircle>
 *-----------------------------------------
 * +comparableCircle(radius: double)
 * +compareTo(o: ComparableCircle): int
 * +stringTo()
 */

/*
 * (The ComparableCircle class) Define a class named ComparableCircle
that extends Circle and implements Comparable. Draw the UML diagram and
implement the compareTo method to compare the circles on the basis of area.
Write a test class to find the larger of two instances of ComparableCircle objects.
 */
public class ComparableCircle extends Circle
	implements Comparable<ComparableCircle> {
		/** Construct a ComparableCircle with specified properties */
		public ComparableCircle(double radius) {
			super(radius);
		}
		
		@Override // Implement the compareTo method defined in Comparable
		public int compareTo(ComparableCircle o) {
			if (getArea() > o.getArea())
				return 1;
			else if (getArea() < o.getArea())
				return -1;
			else
				return 0;
		}
		@Override // Implement the toString method in GeometricObject
		public String toString() {
			return super.toString() + " Area: " + getArea();
		}
	}

