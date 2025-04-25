package week1.day3;

public class SampleClass {

	public static void main(String[] args) {
		LearnMethodSignature str=new LearnMethodSignature();
		str.addNumber();
		int localVariable=str.calculateVolume(100, 200, 300);
		//ctrl+2 press keys ,then after a break press L(To generate local variable and return type)
		System.out.println("The volume of Rectangle is:"+localVariable);
		
	}

}
