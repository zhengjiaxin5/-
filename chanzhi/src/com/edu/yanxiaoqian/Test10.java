package com.webtest.demo;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Test10 extends BaseTest{
	@Test
	public void testGsxx1() {
		webtest.open("http://localhost/chanzhieps/www/admin.php");
		webtest.type("xpath=//*[@id=\"account\"]", "yanxiaoqian");
		webtest.type("xpath=//*[@id=\"password\"]", "123456");
		webtest.click("xpath=//*[@id=\"submit\"]");
		webtest.click("xpath=//*[@id=\"primaryNavbar\"]/ul[1]/li[8]/a");
		webtest.click("xpath=//*[@id=\"mainNavbarCollapse\"]/ul[1]/li[3]/a");
		webtest.click("xpath=/html/body/div/div[1]/div/ul/li[2]/a");
		webtest.type("xpath=//*[@id=\"fromAddress\"]", "111");
		webtest.click("xpath=//*[@id=\"submit\"]");
		assertTrue(webtest.isTextPresent("��������Ӧ��Ϊ�Ϸ���EMAIL"));
	}
	
	@Test
	public void testGsxx2() {
		webtest.open("http://localhost/chanzhieps/www/admin.php");
		webtest.type("xpath=//*[@id=\"account\"]", "yanxiaoqian");
		webtest.type("xpath=//*[@id=\"password\"]", "123456");
		webtest.click("xpath=//*[@id=\"submit\"]");
		webtest.click("xpath=//*[@id=\"primaryNavbar\"]/ul[1]/li[8]/a");
		webtest.click("xpath=//*[@id=\"mainNavbarCollapse\"]/ul[1]/li[3]/a");
		webtest.click("xpath=/html/body/div/div[1]/div/ul/li[2]/a");
		webtest.type("xpath=//*[@id=\"fromAddress\"]", "438117595@qq.com");
		webtest.click("xpath=//*[@id=\"submit\"]");
		assertTrue(webtest.isTextPresent("��������"));
		webtest.click("xpath=//*[@id=\"submit\"]");
	}
	

}
