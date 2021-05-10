package my;

public class Hello_AO_b
{

	public static void main(String[] args)
	{
		int a = 10;
		int b = 5;
		int c = a + b;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = a + b =" + c);
		
		int d = 2;
		int e = 4;
		int f = d * e;
		System.out.println("d = " + d);
		System.out.println("e = " + e);
		System.out.println("f = d * e = " + f);
		
		int g = 2;
		g = g + 3; //计算机会先计算等式右边的值，然后将右侧的值赋值给左侧
		System.out.println("g = " + g); //所以最后输出的g的值为2 + 3，也就是5
	}

}