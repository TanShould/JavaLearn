package my;

public class Hello_AO_d
{

	public static void main(String[] args)
	{
		/* 逻辑操作符
		 && 表示并且
		 || 表示或者
		 !  表示相反，如原来a的值为true，!a的值则为false
		 */
		
		boolean a = true;
		boolean b = !a; //此时得到b的值则为false，相当于boolean b = false;
		System.out.println("a 的值为" + a);    //此时输出a的值为true
		System.out.println("!a 的值为" + !a);  //此时输出!a的值为false
		System.out.println("b 的值为" + b);    //此时输出b的值为false
		
		boolean c = a && b; //此时得到c的值为false
		boolean d = a || b; //此时得到d的值为true
		System.out.println("c 的值为" + c);
		System.out.println("d 的值为" + d);
		
	}

}