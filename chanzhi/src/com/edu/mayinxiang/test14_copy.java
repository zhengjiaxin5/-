package com.edu.mayinxiang;



import static org.testng.Assert.assertTrue;

import javax.xml.xpath.XPath;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.demo.Admin_Login;

public class test14_copy extends Admin_Login{
	@Test(description="繁体->简体内容的拷贝")
	public void test() {
		webtest.click("xpath=//*[@id=\"primaryNavbar\"]/ul[1]/li[8]/a");
		webtest.click("xpath=/html/body/div/div[1]/div/ul/li[2]/a");
		webtest.click("xpath=//*[@id=\"defaultLang2\"]");
		webtest.click("xpath=//*[@id=\"cn2tw1\"]");
		webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
		webtest.click("id=submit");
		webtest.open("http://127.0.0.1/chanzhieps/www/");
		assertTrue(webtest.isTextPresent("爲天下企業提供專業的營銷工具"));
	}
}