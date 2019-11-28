package com.webtest.demo;

import static org.testng.Assert.assertTrue;

import javax.xml.xpath.XPath;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class test20_menu extends BaseTest{
	@Test
	public void test() {
		webtest.open("http://127.0.0.1/chanzhieps/www/admin.php");
		//�ı�������
		webtest.type("name=account", "admin");
		webtest.type("name=password", "admin");
		webtest.click("xpath=//*[@id=\"submit\"]");
		webtest.click("xpath=//*[@id=\"primaryNavbar\"]/ul[1]/li[8]/a");
		webtest.click("xpath=/html/body/div/div[1]/div/ul/li[7]/a");
		webtest.click("xpath=//*[@id=\"homeMenus8\"]");
		webtest.click("xpath=//*[@id=\"homeMenus9\"]");
		webtest.click("xpath=//*[@id=\"homeMenus10\"]");
		webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
		webtest.click("id=submit");
		webtest.click("xpath=//*[@id=\"primaryNavbar\"]/ul[1]/li[1]/a");
		assertTrue(webtest.isTextPresent("��Ʒ"));
//		
	}
	@Test
	public void test2() {
		webtest.open("http://127.0.0.1/chanzhieps/www/admin.php");
		//�ı�������
		webtest.type("name=account", "admin");
		webtest.type("name=password", "admin");
		webtest.click("xpath=//*[@id=\"submit\"]");
		webtest.click("xpath=//*[@id=\"primaryNavbar\"]/ul[1]/li[8]/a");
		webtest.click("xpath=/html/body/div/div[1]/div/ul/li[7]/a");
		webtest.click("xpath=//*[@id=\"homeMenus1\"]");
		webtest.click("xpath=//*[@id=\"homeMenus2\"]");
		webtest.click("xpath=//*[@id=\"homeMenus3\"]");
		webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
		webtest.click("id=submit");
		assertTrue(webtest.notisTextPresent("����"));
	}
}