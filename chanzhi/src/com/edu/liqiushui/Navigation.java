package com.edu.liqiushui;

import org.testng.annotations.Test;

import com.webtest.demo.Admin_Login;

public class Navigation extends Admin_Login1{
	
	//���һ������a
	@Test(priority=1)
	public void test1() {
		webtest.click("//a[text()='���']");
		webtest.click("//a[text()='����']");
		webtest.click("/html/body/div/div[2]/div[2]/form/ul/li[3]");
		webtest.type("id=\"nav[1][title][]\" ", "a");//���һ������a
		webtest.click("//a[text()='����']");
		
	}
	
	//ɾ������a
	@Test(priority=2)
	public void test2() {
		webtest.click("//a[text()='���']");
		webtest.click("//a[text()='����']");
		webtest.click("/html/body/div/div[2]/div[2]/form/ul/li[3]");
		webtest.type("id=\"nav[1][title][]\" ", "a");//���һ������a
		webtest.click("//a[text()='����']");
		
	}
}