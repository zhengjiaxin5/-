package com.edu.liqiushui;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.webtest.dataprovider.ExcelDataProvider;
import com.webtest.demo.Admin_Login;

public class Color extends Admin_Login1{
	@DataProvider(name="color")
	public  Object[][] changesize() throws IOException{
		Object[][] user= new  ExcelDataProvider().getTestDataByExcel("E:\\data\\chanzhieps.xlsx","color");
		 return user;
	}

	@Test(dataProvider ="color",description="�������ɫ����")
	public void color0(String icon,String border,String top,String right,String bottom,String left,String title,String background,String text,String link,String back) {
		webtest.click("link=���");
		webtest.click("link=����");
		webtest.click("xpath=/html/body/div/div[2]/div[1]/div/div[1]/div/a");//���
		webtest.type("id=title","������ɫ");//������д
		webtest.click("link=��ʽ");
		//��������
		webtest.type("xpath=//*[@id=\"params[custom][blank][iconColor]\"]",icon);
		webtest.type("xpath=//*[@id=\"params[custom][blank][borderColor]\"]",border);
		webtest.type("xpath=//*[@id=\"params[custom][blank][paddingTop]\"]",top);
		webtest.type("xpath=//*[@id=\"params[custom][blank][paddingRight]\"]",right);
		webtest.type("xpath=//*[@id=\"params[custom][blank][paddingBottom]\"]",bottom);
		webtest.type("xpath=//*[@id=\"params[custom][blank][paddingLeft]\"]",left);
		webtest.type("xpath=//*[@id=\"params[custom][blank][titleColor]\"]",title);
		webtest.type("xpath=//*[@id=\"params[custom][blank][titleBackground]\"]",background);
		webtest.type("xpath=//*[@id=\"params[custom][blank][textColor]\"]",text);
		webtest.type("xpath=//*[@id=\"params[custom][blank][linkColor]\"]",link);
		webtest.type("xpath=//*[@id=\"params[custom][blank][backgroundColor]\"]",back);


		
		webtest.typeAndClear("xpath=//*[@id=\"thumbs[s][width]\"]",icon);
		

		webtest.click("id=submit");
	}
	
	
	
}
