class Time
{
	int sec, min, hours;
	void setValue(int a, int b)
	{
		sec = a; min = b; ;
	}
	void display()
	{
		System.out.println("Seconds: " + sec+"\n");
		System.out.println("Minutes: " + min+"\n");
	}
	
	double secToMin()
	{
		return sec/60;
	}

	double minToHours()
	{
		return min/60;
	}
}