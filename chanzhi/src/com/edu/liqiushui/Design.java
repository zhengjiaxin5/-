package com.edu.liqiushui;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;




public class Design extends BaseTest{
	

	//1����½
	@Test(priority = 1)
	public void test1(){
		System.setProperty("webdriver.gecko.driver", "E:\\geckodriver.exe");
		WebDriver webtest = new FirefoxDriver();
		webtest.get("http://127.0.0.1:2222/chanzhieps/www/admin.php/");
		webtest.findElement(By.name("account")).sendKeys("admin");		
		webtest.findElement(By.name("password")).sendKeys("123456");
		//webtest.click("name=submit");
		webtest.findElement(By.xpath("//input[@9id=\"submit\"]")).click();
		
	}
	//2�������-�������л���һ������1
	@Test(priority = 2)
	public void test2(){
		System.setProperty("webdriver.gecko.driver", "E:\\geckodriver.exe");
		WebDriver webtest = new FirefoxDriver();
		webtest.get("http://127.0.0.1:2222/chanzhieps/www/admin.php?m=admin&f=index");
		webtest.findElement(By.name("account")).sendKeys("admin");		
		webtest.findElement(By.name("password")).sendKeys("123456");
		webtest.findElement(By.xpath("//input[@id=\"submit\"]")).click();
		webtest.findElement(By.xpath("//a[text()='���']")).click();
		webtest.findElement(By.xpath("/html/body/div/div[2]/div[2]/section[1]/div[1]/div/a/img")).click();
		
	}
	//3�������-�������л���һ������2
		@Test(priority = 2)
		public void test3(){
			System.setProperty("webdriver.gecko.driver", "E:\\geckodriver.exe");
			WebDriver webtest = new FirefoxDriver();
			webtest.get("http://127.0.0.1:2222/chanzhieps/www/admin.php?m=admin&f=index");
			webtest.findElement(By.name("account")).sendKeys("admin");		
			webtest.findElement(By.name("password")).sendKeys("123456");
			webtest.findElement(By.xpath("//input[@id=\"submit\"]")).click();
			webtest.findElement(By.xpath("//a[text()='���']")).click();
			webtest.findElement(By.xpath("/html/body/div/div[2]/div[2]/section[1]/div[2]/div/a/img")).click();
			
		}
		//4�������-�������л���һ������3
		@Test(priority = 2)
		public void test4(){
			System.setProperty("webdriver.gecko.driver", "E:\\geckodriver.exe");
			WebDriver webtest = new FirefoxDriver();
			webtest.get("http://127.0.0.1:2222/chanzhieps/www/admin.php?m=admin&f=index");
			webtest.findElement(By.name("account")).sendKeys("admin");		
			webtest.findElement(By.name("password")).sendKeys("123456");
			webtest.findElement(By.xpath("//input[@id=\"submit\"]")).click();
			webtest.findElement(By.xpath("//a[text()='���']")).click();
			webtest.findElement(By.xpath("/html/body/div/div[2]/div[2]/section[1]/div[3]/div/a/img")).click();
			
		}
		//5�������-�������л��ɿհ�����
		@Test(priority = 2)
		public void test5(){
			System.setProperty("webdriver.gecko.driver", "E:\\geckodriver.exe");
			WebDriver webtest = new FirefoxDriver();
			webtest.get("http://127.0.0.1:2222/chanzhieps/www/admin.php?m=admin&f=index");
			webtest.findElement(By.name("account")).sendKeys("admin");		
			webtest.findElement(By.name("password")).sendKeys("123456");
			webtest.findElement(By.xpath("//input[@id=\"submit\"]")).click();
			webtest.findElement(By.xpath("//a[text()='���']")).click();
			webtest.findElement(By.xpath("/html/body/div/div[2]/div[2]/section[1]/div[5]/div/a/img")).click();
	
		}
		/*
		//6�������-����-�Զ������������һ������
		@Test(priority = 2)
		public void test6(){
			System.setProperty("webdriver.gecko.driver", "E:\\geckodriver.exe");
			WebDriver webtest = new FirefoxDriver();
			webtest.get("http://127.0.0.1:2222/chanzhieps/www/admin.php?m=admin&f=index");
			webtest.findElement(By.name("account")).sendKeys("admin");		
			webtest.findElement(By.name("password")).sendKeys("123456");
			webtest.findElement(By.xpath("//input[@id=\"submit\"]")).click();
			webtest.findElement(By.xpath("//a[text()='���']")).click();
			webtest.findElement(By.xpath("/html/body/div/div[2]/div[2]/section[1]/div[5]/div/a/img")).click();
			webtest.findElement(By.xpath("/html/body/div/div[2]/div[2]/section[1]/div[5]/div/div[2]/a")).click();
			
	
		}
		*/
		//7�����ӻ��༭�иı��ֲ�ͼ˳��
		@Test(priority = 0)
		public void test7(){
			System.setProperty("webdriver.gecko.driver", "E:\\geckodriver.exe");
			WebDriver webtest = new FirefoxDriver();
			webtest.get("http://127.0.0.1:2222/chanzhieps/www/admin.php?m=admin&f=index");
			webtest.findElement(By.name("account")).sendKeys("admin");		
			webtest.findElement(By.name("password")).sendKeys("123456");
			webtest.findElement(By.xpath("//input[@id=\"submit\"]")).click();
			webtest.findElement(By.xpath("//a[text()='���']")).click();
			webtest.findElement(By.xpath("/html/body/div/div[2]/div[2]/section[1]/div[5]/div/a/img")).click();
			webtest.findElement(By.xpath("/html/body/div/div[2]/div[2]/section[1]/div[5]/div/div[2]/a")).click();//�����Զ���
			webtest.findElement(By.xpath("/html/body/div/div/div[2]/div/a[1]")).click();//������ӻ��༭
			webtest.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div[1]/div[1]/div/div[1]/div[1]/div[2]/div[2]/a[4]")).click();//ʹ����˳���Ӻ�
			
		}
	
		
	
	
	
	
//		//2����ת�����ģ��
//		webtest.findElement(By.xpath("//a[text()='���']")).click();
//		//3����ת�����-����
//		webtest.findElement(By.xpath("//a[text()='����']")).click();
//		//4��������-����
//		webtest.findElement(By.xpath("//a[text()='����']")).click();
//		//5��������-����
//		webtest.findElement(By.xpath("//a[text()='����']")).click();
//		
		
		



				
		
	}
		
