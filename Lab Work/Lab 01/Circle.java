class Circle
{
	int radius;
	void setValue(int a)
	{
		radius = a;
	}
	int diameter()
	{
		return 2*radius;
	}
	double circumference()
	{
		return 2*(3.141*radius);
	}
	void display()
	{
		System.out.println("Radius of Circle is: "+ radius+"\n");
	}
}