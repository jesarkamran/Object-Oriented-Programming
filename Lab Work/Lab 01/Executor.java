class Executor
{
	public static void main(String[] args) {

		Circle objCircle = new Circle();

		objCircle.setValue(9); objCircle.display();
		System.out.println("Diameter of Circle: " +objCircle.diameter()+"\n");	
		System.out.println("Circumference of Circle: "+ objCircle.circumference()+"\n");


		Rectangle objRectangle = new Rectangle();

		objRectangle.setValue(5,10); objRectangle.display();
		System.out.println("Area of Rectangle: "+ objRectangle.area()+"\n");	
		System.out.println("Perimeter of Rectangle: " +objRectangle.perimeter()+"\n");

		
		Point objPoint = new Point();

		objPoint.setValue(10,20); objPoint.display();
		System.out.println("Sum of two Points: " +objPoint.sum()+"\n");	
		System.out.println("Difference of two Points: " +objPoint.difference()+"\n");


		Time objTime = new Time();

		objTime.setValue(480, 3600); objTime.display();
		System.out.println("Seconds to Minutes: " +objTime.secToMin()+"\n");	
		System.out.println("Minutes to Hours: " +objTime.minToHours()+"\n");
	}
}