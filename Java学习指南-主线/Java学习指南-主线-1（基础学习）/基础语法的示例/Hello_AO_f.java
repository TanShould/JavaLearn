package my;

public class Hello_AO_f
{

	public static void main(String[] args)
	{
    //这段程序更详细的演示了计算机在运行a = a++时的逻辑
    //在运行a = a++时，先把等号后，a本身的值读取出来，放在一个地方存储（这里将取值存放于变量x中）。然后对a的值进行自增，再把存放于x的值赋予等号左侧的a，导致最后a的值还是10
    //仅用作补充说明，在自增和自减的实际应用中，不会涉及过于复杂、花哨、不实用的语句。
		int a = 10;
		int x;
    
		x = a;
		a = a+1;
		a = x;
		System.out.println("a = " + a); 
		
		a = a++;
		System.out.println("a = " + a);
		
	}

}
