package com.edu.liqiushui;

import org.testng.annotations.Test;

import com.webtest.demo.Admin_Login;

public class Block extends Admin_Login{
	@Test(description="�Զ����������һ������")
	public void test9() {
		webtest.click("link='���'");
		webtest.click("link='����'");
		webtest.click("/html/body/div/div[2]/div[1]/div/div[1]/div/a/i");//���
		webtest.type("id=title","����һ������");//������д
		webtest.click("id=submit");
		
	}
	@Test(description="ɾ��һ������")
	public void test10() {
		webtest.click("link='���'");
		webtest.click("link='����'");
		webtest.click("/html/body/div[1]/div[2]/div[1]/div/div[2]/span[1]/a[2]/i");//ɾ������

		
	}

}
