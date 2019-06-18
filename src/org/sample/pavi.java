//package org.sample;

//	import java.util.List;
//
//	import org.openqa.selenium.By;
//	import org.openqa.selenium.WebDriver;
//	import org.openqa.selenium.WebElement;
//	import org.openqa.selenium.chrome.ChromeDriver;
//
//	public class pavi {
//		public static void main(String[] args) {
//			System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downcloads\\eclipse-committers-2019-03-R-win32-x86_64\\eclipse\\May30\\Day11\\driver\\chromedriver.exe");
//		    WebDriver driver=new ChromeDriver();
//		  driver.get("http://toolsqa.com/automation-practice-table/");
//		  driver.manage().window().maximize();
//		  List <WebElement> tRows=driver.findElements(By.tagName("tr"));
//		  for(int i=0;i<tRows.size();i++) {
//		  WebElement row=tRows.get(i);
//			  List <WebElement> tData=row.findElements(By.tagName("td"));
//			  for(int j=0;j<tData.size();j++) {
//				  WebElement data=tData.get(j);
//				 String name =data.getText();
//				 if(name.equals("Natinal")) {
//					 tData.get(4).click();
//				 }
//			  }
//		  }
//		}
////	}
		  

