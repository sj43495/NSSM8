package package1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) {
		String key="webdriver.chrome.driver";
		String value="./exefiles/chromedriver.exe";
		System.setProperty(key, value);
		ChromeDriver c=new ChromeDriver();
	}

}
