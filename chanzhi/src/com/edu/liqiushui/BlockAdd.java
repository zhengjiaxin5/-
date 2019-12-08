package com.edu.liqiushui;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.webtest.dataprovider.ExcelDataProvider;
import com.webtest.demo.Admin_Login;

public class BlockAdd extends Admin_Login1{
	
	
	@DataProvider(name="addblock")
	public  Object[][] block() throws IOException{
		Object[][] user= new  ExcelDataProvider().getTestDataByExcel("E:\\data\\chanzhieps.xlsx","addblock");
		 return user;
	}
	@Test(dataProvider ="addblock",description="�����Զ��������һ������")
	public void addBlock0(String title,String moretext){
		webtest.click("link=���");
		webtest.click("link=����");
		webtest.click("xpath=/html/body/div/div[2]/div[1]/div/div[1]/div/a");//���
		
		webtest.type("name=title", title);
		webtest.typeAndClear("name=title", title);
		webtest.type("xpath=//*[@id=\"params[moreText]\"]", moretext);
		webtest.typeAndClear("xpath=//*[@id=\"params[moreText]\"]", moretext);
		
		webtest.click("id=submit");
		assertTrue(webtest.isTextPresent("����ɹ�"));
	}
	
	
	
	
	
	
	
	
	
	
	
	/*
	@Test(priority = 2,description="ɾ��һ������")
	public void test10() throws InterruptedException {
		webtest.mouseoverElement("xpath=/html/body/div/div[2]/div[1]/div/div[2]/span[1]");//�����ڸ�������
		webtest.click("xpath=/html/body/div/div[2]/div[1]/div/div[2]/span[1]/a[2]/i");
		webtest.click("xpath=/html/body/div[2]/div/div/div[2]/button[1]");//���ȷ��
	}
	*/
	
	
}
