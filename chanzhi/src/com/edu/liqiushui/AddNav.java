package com.edu.liqiushui;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.webtest.dataprovider.ExcelDataProvider;
import com.webtest.demo.Admin_Login;

public class AddNav extends Admin_Login1{
	
//	@DataProvider(name="addnav")
//	public  Object[][] changesize() throws IOException{
//		Object[][] user= new  ExcelDataProvider().getTestDataByExcel("E:\\data\\addnav.xlsx","addnav");
//		 return user;
//	}
	
	//���һ������a
	@Test(priority=1,description="��ӵ���")
	public void test1() throws InterruptedException {
		webtest.click("link=���");
		webtest.click("link=����");
		webtest.mouseoverElement("xpath=//*[@id=\"navList\"]/li[1]/span[1]");//ʹ��Ӱ�ť����
		webtest.click("xpath=//*[@id=\"navList\"]/li[1]/span[1]/span/a[2]/i");//������
//		webtest.type("xpath=//*[@id=\"nav[1][title][]\"]","�µ���");

//		webtest.typeAndClear("xpath=//*[@id=\"nav[1][title][]\"]","�µ���");
		webtest.click("link=����");
		assertTrue(webtest.isTextPresent("���óɹ�"));
		
	}
	
	@Test(priority=2,description="ɾ������")
	public void test2() throws InterruptedException {
		webtest.click("link=���");
		webtest.click("link=����");
		webtest.mouseoverElement("xpath=//*[@id=\"navList\"]/li[1]/span[1]");//ʹɾ����ť����
		webtest.click("xpath=//*[@id=\"navList\"]/li[1]/span[1]/span/a[3]/i");//������
//		webtest.type("xpath=//*[@id=\"nav[1][title][]\"]","�µ���");

//		webtest.typeAndClear("xpath=//*[@id=\"nav[1][title][]\"]","�µ���");
		webtest.click("link=����");
		assertTrue(webtest.isTextPresent("���óɹ�"));
		
	}
	
	
	
	
}