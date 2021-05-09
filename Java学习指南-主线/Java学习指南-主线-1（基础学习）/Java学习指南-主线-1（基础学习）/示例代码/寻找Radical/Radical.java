package my;

public class Radical
{

	public static void main(String[] args)
	{
		////////////////////
		////////////////////
		int a = 9;
        int b = 0;
		int i = 1;
		
		while (i <= a)
		{
			b = i* i;
			if(b == a)
			{
				System.out.println("a是" + i +"的平方");
				System.out.println("a是-" + i +"的平方");
			}
			else
			{
				System.out.println("a不是" + i +"的平方");
			}
			i = i +1; //自增
		}
		
		////////////////////
		
	}

}
