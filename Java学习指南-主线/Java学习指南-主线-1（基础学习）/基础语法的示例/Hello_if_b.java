package my;

public class Hello_if_b
{

	public static void main(String[] args)
	{
		/*这里以将考试成绩分级为例
		 90分以上为A等级，输出A
		 80分以上为B等级，输出B
		 60分以上为C等级，输出C
		 60分以下为D等级，输出D
		 */
		int score_a = 92;
		int score_b = 87;
		int score_c = 66;
		int score_d = 24;
		
		int score = score_a; //可以更改为score_b,score_c,score_d
		if (score >= 90)
		{
			System.out.println("成绩为A等级");
		}
		else if (score >= 80)
		{
			System.out.println("成绩为B等级");
		}
		else if(score >= 60)
		{
			System.out.println("成绩为C等级");
		}
		else if(score >= 0)
		{
			System.out.println("成绩为D等级");
		}
		
		
	}

}