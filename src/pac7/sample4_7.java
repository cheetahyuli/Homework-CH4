package pac7;

public class sample4_7
{
	public static void main(String[] args)
	{
		Car car1;
		car1 = new Car();
		
		car1.setCar(1234, 20.5);
		System.out.println(car1);
	}
}

class Car
{
	protected int num;
	protected double gas;
	
	public Car()
	{
		num = 0;
		gas = 0.0;
		System.out.println("�Ͳ��F���l");
	}
	
	public void setCar(int n, double g)
	{
		num = n;
		gas = g;
		System.out.println("�N�����]��"+ num + "�A�T�o�q�]��"+ gas);
	}
	
	public void show()
	{
		System.out.println("�����O"+ num);
		System.out.println("�T�o�q�O"+ gas);
	}
	
	public String toString()
	{
		String str = "����"+ num +"�A�T�o�q�O"+ gas;
		return str;
	}
}