package week1.day3;

public class BrowserWithTwoMethods {
	public String launchBrowser(String browserName)
	{
		System.out.println("Browser Launched Successfully");

		return browserName;
		
	}
public void loadURL()
{
	System.out.println("Application URL loaded successfully");
}
	public static void main(String[] args) {
		
		BrowserWithTwoMethods brow=new BrowserWithTwoMethods();
		String var=brow.launchBrowser("chrome");
		System.out.println("The browser name is:"+var);
		//brow.launchBrowser(var);
		brow.loadURL();
	}

}
