package my;

public class Hello_for_b
{

	public static void main(String[] args)
	{
		//求1-10这十个数中，除5以外所有数的和
		int result = 0;
		int i=1;
		for ( ;i<= 10 ; )
		{
			if(i == 5 )
			{
				i= i+1;
				continue;
			}
			
			result = result + i;
			i= i+1;
		}
		
		System.out.println("结果："+result);
	}

}
