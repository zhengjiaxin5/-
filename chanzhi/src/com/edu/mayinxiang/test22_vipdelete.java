package com.webtest.demo;

import static org.testng.Assert.assertTrue;

import javax.xml.xpath.XPath;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class test22_vipdelete extends BaseTest{
	@Test
	public void test() {
		webtest.click("xpath=//*[@id=\"primaryNavbar\"]/ul[1]/li[4]/a");
		webtest.click("xpath=//*[@id=\"userList\"]/tbody/tr[1]/td[11]/a[2]");
		webtest.type("id=password","admin");
//		webtest.click("xpath=//*[@id=\"ajaxForm\"]/div/div/a");
		webtest.enter();
		assertTrue(webtest.isTextPresent("ɾ���ɹ�"));
	}
}