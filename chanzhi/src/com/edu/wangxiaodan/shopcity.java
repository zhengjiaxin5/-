package com.edu.wangxiaodan;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.demo.Admin_Login;

import bsh.org.objectweb.asm.Type;


public class shopcity extends Admin_Login{
	
	@Test(description="�̳ǲ�Ʒ�����±����Ŀ",priority=1)
	public void test1(){
		testLogin();
		webtest.click("link=�̳�");
		webtest.click("link=��Ʒ");
		webtest.click("link=ά����Ŀ");
		boolean s=webtest.isTextPresent("±��");
		webtest.type("id=children[]","±��");
		webtest.click("xpath=//input[@type='submit']");
		if(s==true) {
			assertTrue(webtest.isTextPresent("��������ظ�����Ŀ"));
		}else {
			assertTrue(webtest.isTextPresent("±��"));
		}
		
		
	}
	@Test(description="��Ӳ�Ʒ",priority=2)
	public void test3() {
		testLogin();
		webtest.click("link=�̳�");
		webtest.click("link=��Ʒ");
		webtest.click("xpath=//*[@id='category19']");
		webtest.click("xpath=/html/body/div/div[2]/div/div/div/a/i");
		webtest.type("xpath=//input[@name='name']", "��צ");
		System.out.println(webtest.isElementPresent("class=ke-edit-iframe"));
		webtest.enterFrame(1);
		webtest.click("tag=body");
		webtest.type("tag=body", "����һ����צ");
		webtest.leaveFrame();
		String js_bottom = "var q=document.documentElement.scrollTop=10000";
		webtest.runJs(js_bottom);
		webtest.click("xpath=//input[@type='submit']");
		assertTrue(webtest.isTextPresent("������"));
		
	}
	@Test(description="����צ�¼�",priority=3)
	public void test4() {
		testLogin();
		webtest.click("link=�̳�");
		webtest.click("link=��Ʒ");
		webtest.click("xpath=/html/body/div/div[2]/div/table/tbody/tr[1]/td[8]/a[4]");
		webtest.open("http://127.0.0.1:8066/chanzhieps/www/index.php/product/c0.html");
		assertFalse(webtest.isTextPresent("��צ"));
		
		
	}
	@Test(description="����צ�ϼ�",priority=4)
	public void test5() {
		testLogin();
		webtest.click("link=�̳�");
		webtest.click("link=��Ʒ");
		webtest.click("xpath=/html/body/div/div[2]/div/table/tbody/tr[1]/td[8]/a[4]");
		webtest.open("http://127.0.0.1:8066/chanzhieps/www/index.php/product/c0.html");
		assertTrue(webtest.isTextPresent("��צ"));
		
		
	}
	@Test(description="����",priority=5)
	public void test6() {
		testLogin();
		webtest.click("xpath=//a[text()='�̳�']");
		webtest.click("xpath=//a[text()='��Ʒ']");
		webtest.type("xpath=//*[@id='searchWord']", "��צ");
		webtest.click("xpath=//*[@id='submit']");
		assertTrue(webtest.isTextPresent("��צ"));
	}
	@Test(description="����צ�Ŀ���Ϊ600",priority=6)
	public void test7() {
		testLogin();
		webtest.click("link=�̳�");
		webtest.click("link=��Ʒ");
		webtest.click("xpath=/html/body/div/div[2]/div/table/tbody/tr[1]/td[8]/a[1]");
		webtest.typeAndClear("xpath=//*[@id='amount']", "600");
		webtest.pause(3000);String js_bottom = "var q=document.documentElement.scrollTop=10000";
		webtest.runJs(js_bottom);
		webtest.click("xpath=//*[@id='submit']");
		assertTrue(webtest.isTextPresent("600"));
		
		
	}
	@Test(description="����צ�Ŀ���Ϊ0.05",priority=7)
	public void test8() throws InterruptedException {
		testLogin();
		webtest.click("link=�̳�");
		webtest.click("link=��Ʒ");
		webtest.click("xpath=/html/body/div/div[2]/div/table/tbody/tr[1]/td[8]/a[1]");
		webtest.typeAndClear("xpath=//*[@id='amount']", "0.05");
		webtest.pause(3000);String js_bottom = "var q=document.documentElement.scrollTop=10000";
		webtest.runJs(js_bottom);
		webtest.click("xpath=//*[@id='submit']");
		assertTrue(webtest.isTextPresent("���Ӧ��������"));
		
		
	}
	@Test(description="����צ�Ŀ���Ϊ-600",priority=8)
	public void test9() throws InterruptedException {
		testLogin();
		webtest.click("link=�̳�");
		webtest.click("link=��Ʒ");
		webtest.click("xpath=/html/body/div/div[2]/div/table/tbody/tr[1]/td[8]/a[1]");
		webtest.typeAndClear("xpath=//*[@id='amount']", "-600");
		String js_bottom = "var q=document.documentElement.scrollTop=10000";
		webtest.runJs(js_bottom);
		webtest.click("xpath=//*[@id='submit']");
		assertTrue(webtest.isTextPresent("�������Ϊ������"));
		
		
	}
	@Test(description="����צɾ��",priority=9)
	public void test10() {
		testLogin();
		webtest.click("link=�̳�");
		webtest.click("link=��Ʒ");
		webtest.click("xpath=/html/body/div/div[2]/div/table/tbody/tr[1]/td[8]/span[2]/a");
		webtest.click("xpath=/html/body/div/div[2]/div/table/tbody/tr[1]/td[8]/span[2]/ul/li[1]/a");
		webtest.click("xpath=/html/body/div[2]/div/div/div[2]/button[1]");
		assertFalse(webtest.isTextPresent("��צ"));
	}
	@Test(description="��ӿ��",priority=10)
	public void test11() {
		testLogin();
		webtest.click("link=�̳�");
		webtest.click("xpath=/html/body/nav[2]/div[2]/ul[1]/li[3]/a");
		webtest.click("link=���");
		webtest.typeAndClear("xpath=//*[@id='children[]']", "��ͨ");
		String js_bottom = "var q=document.documentElement.scrollTop=10000";
		webtest.runJs(js_bottom);
		webtest.click("xpath=//*[@id='submit']");
		assertTrue(webtest.isTextPresent("��ͨ"));
	}
	@Test(description="ɾ�����",priority=11)
	public void test12() {
		testLogin();
		webtest.click("link=�̳�");
		webtest.click("xpath=/html/body/nav[2]/div[2]/ul[1]/li[3]/a");
		webtest.click("link=���");
		webtest.click("xpath=/html/body/div/div[2]/div/div[1]/div/div[2]/div/ul/li/a");
		String js_bottom = "var q=document.documentElement.scrollTop=10000";
		webtest.runJs(js_bottom);
		webtest.click("xpath=//*[@id='submit']");
		assertFalse(webtest.isTextPresent("��ͨ"));
	}
	
}

