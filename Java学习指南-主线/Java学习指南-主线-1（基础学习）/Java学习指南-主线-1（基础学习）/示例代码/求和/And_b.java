package my;

public class And_b
{

	public static void main(String[] args)
	{
		////////////////////
		////////////////////
		int a = 1;
		int result = 0;
		int without = 7;
		while (a <= 100)
		{
			if(a % without == 0 )
			{
				a = a+1;
				continue;
			}
			
			result = result + a;
			a = a +1;
			
		}
		
		System.out.println("0-100的所有整数除" + without +"的倍数以外的数的综合为" + result);
		////////////////////
		
	}

}
