package my;

public class Hello_Array
{

	public static void main(String[] args)
	{
		//定义一个int类型的数组并用已知的方法对其进行初始化
		int[] a = new int [5];
		int b = 0;
		int c = 1;
		while (b<=4)
		{
			a[b] = c;
			b = b + 1;
			c += 1;
		}
		
		b = 0;
		while (b<=4)
		{
			System.out.println("a[b] = " + a[b]);
			b = b + 1;
		}
		
		
	}
}
