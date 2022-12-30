class Rectangle
{
	int length, width;
	void setValue(int a, int b)
	{
		length = a; width = b;
	}
	int area()
	{
		return length*width;
	}
	int perimeter()
	{
		return (2*(length+width));
	}
	void display()
	{
		System.out.println("Length of Rectangle is: "+ length+"\n");
		System.out.println("Width of Rectangle is: "+ width+"\n");
	}
}