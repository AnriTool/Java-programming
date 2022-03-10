package spat;

/**
*
* @author AnriTool
*/

public class Shape {
	double v;
	double used = 0;
	public double getVolume() {
		return v;
	}
	
	public boolean add(Shape a) {
		used += a.getVolume();
		if(used <= this.v) {
			return true;
		}
		return false;
	}
	
	public double getFree() {
		return this.v - this.used;
	}
	
	
}

class SolidOfRevolution extends Shape{
	double radius;
	public double getRadius() {
		return radius;
	}
}

class Box extends Shape{
	public Box(double x) {
		this.v = x*x*x;
	}
}

class Pyramid extends Shape{
	double s,h;
	public Pyramid(double s, double h) {
		this.v = (s*h)/3;
	}
}

class Cylinder extends SolidOfRevolution{
	double height;
	public Cylinder(double r, double h) {
		this.radius = r;
		this.height = h;
		this.v = Math.PI*r*r*h;
	}
}

class Ball extends SolidOfRevolution{
	public Ball(double r) {
		this.radius = r;
		this.v = (4 * Math.PI * r*r*r)/3;
	}
}