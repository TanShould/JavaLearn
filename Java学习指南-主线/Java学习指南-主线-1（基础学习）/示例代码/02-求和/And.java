package my;

public class And
{

	public static void main(String[] args)
	{
		////////////////////作者：踪天朔
		////////////////////此程序用于计算0-100中所有整数的和
		int a = 1;
		int result = 0;
        int without = 7;
		while (a <= 100)
		{
			if( a % without != 0 )
			{
				result = result + a;
				System.out.println("正在计算0-100的所有整数除" + without + "的倍数以外的数的总和"); //若不做修改，则默认计算0-100中所有整数除7的倍数以外的数的总和
			}
			
			a = a+1;
			
		}
		System.out.println("0-100的所有整数除" + without + "的倍数以外的数的总和为" + result);
		System.out.println("程序结束！");
		////////////////////
		
	}

}
