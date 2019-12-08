package com.edu.liqiushui;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.webtest.dataprovider.ExcelDataProvider;
import com.webtest.demo.Admin_Login;

public class DelNav extends Admin_Login{

	@Test(priority=1,description="��ӵ���")
	public void test1() throws InterruptedException {
		webtest.click("link=���");
		webtest.click("link=����");
		webtest.mouseoverElement("xpath=//*[@id=\"navList\"]/li[1]/span[1]");
		webtest.click("xpath=//*[@id=\"navList\"]/li[1]/span[1]/span/a[2]/i");
		webtest.click("link=����");
		assertTrue(webtest.isTextPresent("���óɹ�"));
		
	}
	
	@Test(priority=2,description="ɾ������")
	public void test2() throws InterruptedException {
		webtest.click("link=���");
		webtest.click("link=����");
		webtest.mouseoverElement("xpath=//*[@id=\"navList\"]/li[1]/span[1]");
		webtest.click("xpath=//*[@id=\"navList\"]/li[1]/span[1]/span/a[3]/i");
		webtest.click("link=����");
		assertTrue(webtest.isTextPresent("���óɹ�"));
		
	}
	
	
	
	
}