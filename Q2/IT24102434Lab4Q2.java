import java.util.Scanner;
public class IT24102434Lab4Q2
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		double exammark,labsubmark,pexam,plab,fmark;
		
		fmark = 0;
		
		System.out.print("Please enter exam marks:");
		exammark = input.nextDouble();
		
		if(exammark > 100 || exammark < 0)
		{
			System.out.print("Invalid input for exam marks.terminating program.");
			return;
		}
		
		System.out.print("Please enter lab submission marks:");
		labsubmark = input.nextDouble();
		
		if(labsubmark > 100 && labsubmark < 0)
		{
			System.out.print("Invalid input for exam marks.terminating program.");
			return;
		}
		
		System.out.print("Please enter the percentage given for the exam:");
		pexam= input.nextDouble();
		
		if(pexam > 100 && pexam < 0)
		{
			System.out.print("Invalid input for exam marks.terminating program.");
			return;
		}
		
		System.out.print("Please enter the percentage given for the lab submission:");
		plab = input.nextDouble();
		
		if(plab > 100 || plab < 0)
		{
			System.out.print("Invalid input for exam marks.terminating program.");
			return;
		}
		
		fmark = (exammark*pexam/100)+(labsubmark*plab/100);
		
		System.out.print("final mark is:" + fmark);
		
		
		
	}
}