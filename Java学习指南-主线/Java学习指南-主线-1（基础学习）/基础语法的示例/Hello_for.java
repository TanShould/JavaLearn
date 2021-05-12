package my;

public class Hello_for
{

	public static void main(String[] args)
	{
		for ( int a =1 ; a <= 10 ; a = a+1)
		{
			System.out.println("a = " + a);
		}
		//在这一段代码中，分别用for语句和while语句进行输出
		//可以看出，在需要初始化的循环中，for语句的结构更紧凑
		System.out.println("");
		int b = 1;
		while (b <= 10)
		{
			System.out.println("b = " + b);
			b = b+1;
		}
		
		
	}

}