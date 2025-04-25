package week1.day2;

public class LearnCondition {

	public static void main(String[] args) {
		boolean isPrimeUser=true;
		int a=10;
		int b=20;
		int browser=1;
		
		if(isPrimeUser)
		{
			System.out.println("The Video will start to play");
		}else
		{
			System.out.println("The Video wil not play");
	}

if(a==b)
{
	System.out.println("a value is equals to b");
}
else if(a!=b)
{
	System.out.println("a value is not equals to b");
	}
else if(a>b)
{
	System.out.println("a value is grater than b");
}
else if(a<b)
{
	System.out.println("a value is less than b");
}
else
{
	System.out.println("The value is ot satisfide any above conditions");
}



switch(browser)
	{
case 0: System.out.println("Safari");break;
case 1: System.out.println("Chrome");break;
case 2: System.out.println("Edge");break;
case 3: System.out.println("Firefox");break;
	}
}
}
	



