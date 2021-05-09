package my;

public class Radical_b
{

	public static void main(String[] args)
	{
		////////////////////
		////////////////////
		int a = 9;
		int i = 1;
		int b = 0;
		while (i <= a)
		{
			b = i* i;
			if(b == a)
			{
				System.out.println("a是" + i +"的平方");
				System.out.println("a是-" + i +"的平方");
				break;
			}
			
			i = i +1;
		}
		
		System.out.println("程序结束！");
		////////////////////
		
	}

}
