package com.edu.liqiushui;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.webtest.dataprovider.ExcelDataProvider;
import com.webtest.demo.Admin_Login;

public class Code extends Admin_Login{
	
	@DataProvider(name="code")
	public  Object[] code() throws IOException{
		Object[] user= new  ExcelDataProvider().getTestDataByExcel("E:\\data\\chanzhieps.xlsx","code");
		 return user;
	}
	//���html��css��javascript����
	@Test(dataProvider ="code",description="��Ӵ���")
	public void test9(String html,String css,String Javascript) throws InterruptedException {
		webtest.click("link=���");
		webtest.click("link=����");
		webtest.click("xpath=/html/body/div/div[2]/div[1]/div/div[1]/div/a");//���
		webtest.click("xpath=//*[@id=\"contentTab\"]/table/tbody[1]/tr[1]/td/div/button");//����������
		webtest.click("link=htmlԴ����");//ѡ��htmlѡ��
		
		webtest.type("id=title", "���д���");
		webtest.tapClick();
		webtest.tapClick();
		webtest.tapType(html);
		Thread.sleep(5000);
		//дcss����
		webtest.click("link=CSS");
		webtest.tapClick();
		webtest.tapClick();
		webtest.tapClick();
		webtest.tapType(css);
		Thread.sleep(5000);
		//дjavascript
		webtest.click("link=Javascript");
		webtest.tapClick();
		webtest.tapClick();
		webtest.tapType(Javascript);
		Thread.sleep(5000);
		webtest.click("link=����");



		
		

	}
}