package com.edu.liqiushui;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.webtest.dataprovider.ExcelDataProvider;
import com.webtest.demo.Admin_Login;

public class NavChild extends Admin_Login{

	//���һ������a
	@Test(priority=1,description="�����һ������")
	public void test1() throws InterruptedException {
		webtest.click("link=���");
		webtest.click("link=����");
		webtest.mouseoverElement("xpath=//*[@id=\"navList\"]/li[1]/span[1]");
		webtest.click("xpath=//*[@id=\"navList\"]/li[1]/span[1]/span/a[2]/i");
		webtest.click("link=����");
		assertTrue(webtest.isTextPresent("���óɹ�"));	
		Thread.sleep(5000);

	}
	//����ӵ���
	@Test(priority=2,description="����ӵ���")
	public void test2() throws InterruptedException {
		webtest.mouseoverElement("xpath=//*[@id=\"navList\"]/li[2]/span[1]");
		webtest.click("xpath=//*[@id=\"navList\"]/li[2]/span[1]/span/a[4]/i");
		Thread.sleep(5000);
		webtest.typeAndClear("id=nav[2][title][]","��һ���ӵ���");
		webtest.click("link=����");
		assertTrue(webtest.isTextPresent("���óɹ�"));	
	}
	
	
		
}
	


	
	
	
