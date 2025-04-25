package week1.day3;

public class LearnMethodSignature {
	int a=10;
	//No argument method
	void addNumber()
	{
		int a=10;
		int b=5;
		int c;
		c=a+b;
		System.out.println("The addition of two values:"+c);
	}
	//Argument method
	public int calculateVolume(int length,int breadth,int height)
	{
		return length*breadth*height;
	}

	public static void main(String[] args) {
		//ClassName objectname =new ClassName();
		//Declaring object     Initializing object
		
		LearnMethodSignature obj=new LearnMethodSignature();
		obj.addNumber();
		System.out.println("The global variale value is:"+obj.a);

	   
   
	}

}
