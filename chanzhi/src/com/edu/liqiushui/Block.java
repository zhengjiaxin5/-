package com.edu.liqiushui;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.demo.Admin_Login;

public class Block extends Admin_Login1{
	@Test(priority = 1,description="�����Զ��������һ������")
	public void test9() throws InterruptedException {
		webtest.click("link=���");
		webtest.click("link=����");
		webtest.click("xpath=/html/body/div/div[2]/div[1]/div/div[1]/div/a");//���
		webtest.type("id=title","����һ������");//������д
		webtest.click("id=submit");
		Thread.sleep(5000);
		assertTrue(webtest.isTextPresent("����ɹ�"));
	}
	@Test(priority = 2,description="ɾ��һ������")
	public void test10() throws InterruptedException {
		webtest.mouseoverElement("xpath=/html/body/div/div[2]/div[1]/div/div[2]/span[1]");//�����ڸ�������
		webtest.click("xpath=/html/body/div/div[2]/div[1]/div/div[2]/span[1]/a[2]/i");
		webtest.click("xpath=/html/body/div[2]/div/div/div[2]/button[1]");//���ȷ��
	}
	
	
}
