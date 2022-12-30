class Point
{
	int point1, point2;
	void setValue(int a, int b)
	{
		point1 = a; point2 = b;
	}
	void display()
	{
		System.out.println("Value of Point1: " + point1+"\n");
		System.out.println("Value of Point2: " + point2+"\n");
	}
	int sum()
	{
		return point1 + point2;
	}

	int difference()
	{
		return point1 - point2;
	}
}