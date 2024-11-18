
public class CircleImpl implements Circle {

private double radius;
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public void aoc() {
		
		double area=pi*radius*radius;
		System.out.println("Radius :"+radius);
		System.out.println("Area of circle :"+area);
	}
}
