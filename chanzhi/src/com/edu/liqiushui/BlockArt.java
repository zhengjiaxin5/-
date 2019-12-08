package com.edu.liqiushui;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.webtest.dataprovider.ExcelDataProvider;
import com.webtest.demo.Admin_Login;



public class BlockArt extends Admin_Login1{
	
	
	@DataProvider(name="article")
	public  Object[][] article() throws IOException{
		Object[][] user= new  ExcelDataProvider().getTestDataByExcel("E:\\data\\chanzhieps.xlsx","article");
		 return user;
	}
	
	@Test(dataProvider ="article",description="�������������һ������")
	public void test(String title,String limit,String moretext,String moreurl) throws InterruptedException {
		webtest.click("link=���");
		webtest.click("link=����");
		webtest.click("xpath=/html/body/div/div[2]/div[1]/div/div[1]/div/a");//���
		webtest.click("xpath=//*[@id=\"contentTab\"]/table/tbody[1]/tr[1]/td/div/button");//����������
		webtest.click("link=��������");
		
		//��������
		webtest.type("id=title",title);
		webtest.typeAndClear("id=title",title);
		webtest.type("id=params[limit]",limit );
		webtest.typeAndClear("id=params[limit]",limit );
		webtest.type("xpath=//*[@id=\"params[moreText]\"]",moretext);//��Ӹ�������
		webtest.typeAndClear("xpath=//*[@id=\"params[moreText]\"]",moretext);//��Ӹ�������
		webtest.type("id=params[moreUrl]",moreurl);
		webtest.typeAndClear("id=params[moreUrl]",moreurl);
		webtest.click("id=submit");
		Thread.sleep(5000);
		assertTrue(webtest.isTextPresent("����ɹ�"));
	}
}