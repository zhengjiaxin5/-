package com.edu.liqiushui;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;
import com.webtest.demo.Admin_Login;

public class Code extends Admin_Login1{
	//���html��css��javascript����
	@Test(priority = 1,description="�����Զ��������һ������")
	public void test9() throws InterruptedException {
		webtest.click("link=���");
		webtest.click("link=����");
		webtest.click("xpath=/html/body/div/div[2]/div[1]/div/div[1]/div/a");//���
		webtest.click("xpath=//*[@id=\"contentTab\"]/table/tbody[1]/tr[1]/td/div/button");//����������
		webtest.click("link=htmlԴ����");//ѡ��htmlѡ��
		webtest.type("id=title", "��һ��");
		webtest.tapClick();
		webtest.tapClick();
		webtest.tapType("����д��ȥ����");
		Thread.sleep(5000);

		
		//дcss����
		
		webtest.click("link=CSS");
		webtest.tapClick();
		webtest.tapClick();
		webtest.tapClick();
		webtest.tapType("����д��ȥ����");
		Thread.sleep(5000);
		
		//дjavascript
		webtest.click("link=Javascript");
		webtest.tapClick();
		webtest.tapClick();
		webtest.tapType("����д��ȥ����");




		webtest.click("link=����");



		
		

	}
}