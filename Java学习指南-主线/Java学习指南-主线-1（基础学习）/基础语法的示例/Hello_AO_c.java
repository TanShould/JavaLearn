package my;

public class Hello_AO_c
{

	public static void main(String[] args)
	{
		/* 关系操作符
		 <  表示小于
		 <= 表示小于等于
		 >  表示大于
		 >= 表示大于等于
		 == 表示等于
		 != 表示不等于
		 */
		
		int a = 5;
		int b = 2;
		int c = 5;
		int d = 2;
		
		boolean result_A = a >  b; // a = 5 , b = 2 ,所以a>b的值为 true
		boolean result_B = a <  b; // a = 5 , b = 2 ,所以a<b的值为 false
		System.out.println("result_A" + result_A);
		System.out.println("result_B" + result_B);
		
		boolean result_C = a >= c; // a = 5 , c = 5 ,所以a>=c的值为true
		boolean result_D = a <= c; // a = 5 , c = 5 ,所以a<=c的值为true
		System.out.println("result_C" + result_C);
		System.out.println("result_D" + result_D);
		
	}

}