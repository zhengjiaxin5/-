package com.webtest.demo;

import static org.testng.Assert.assertTrue;

import javax.xml.xpath.XPath;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class test13_language extends BaseTest{
	@Test
	public void test() {
		webtest.open("http://127.0.0.1/chanzhieps/www/admin.php");
		//�ı�������
		webtest.type("name=account", "admin");
		webtest.type("name=password", "admin");
		webtest.click("xpath=//*[@id=\"submit\"]");
		webtest.click("xpath=//*[@id=\"primaryNavbar\"]/ul[1]/li[8]/a");
		webtest.click("xpath=/html/body/div/div[1]/div/ul/li[2]/a");
		webtest.click("xpath=//*[@id=\"defaultLang2\"]");
		webtest.click("name=submit");
//		assertTrue(webtest.isTextPresent("����"));
//		
	}
}