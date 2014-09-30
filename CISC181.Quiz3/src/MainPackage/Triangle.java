package MainPackage;

public class Triangle extends GeometricObject {

	private double side1, side2, side3;

	public Triangle() {
		side1 = 1;
		side2 = 1;
		side3 = 1;
	}

	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	// accessors
	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}

	public double getArea() {
		double sides = ((side1 + side2 + side3) / 2);
		return Math.sqrt(sides * (sides - side1) * (sides - side2)
				* (sides - side3));
	}

	public double getPerimeter() {
		return (side1 + side2 + side3);
	}

	public String toString() {
		return ("Triangle with side lengths of " + side1 + "," + side2 + ","
				+ side3 + " has a perimeter of " + this.getPerimeter()
				+ "and an area of " + this.getArea());
	}

}
