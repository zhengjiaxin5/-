package com.edu.liqiushui;

import static org.testng.Assert.assertTrue;

import javax.xml.xpath.XPath;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.demo.Admin_Login;

public class Theme1 extends Admin_Login{
	@Test(description="�л�����1")
	public void test2() {
		webtest.click("link=���");
		webtest.click("xpath=//*[@id=\"internalSection\"]/div[1]/div/a/img");
		assertTrue(webtest.isTextPresent("���óɹ�"));
	}
	@Test(description="�л�����2")
	public void test3() {
		webtest.click("link=���");
		webtest.click("xpath=//*[@id=\"internalSection\"]/div[2]/div/a/img");
		assertTrue(webtest.isTextPresent("���óɹ�"));
		
	}
	@Test(description="�л�����3")
	public void test4() {
		webtest.click("link=���");
		webtest.click("xpath=//*[@id=\"internalSection\"]/div[3]/div/a/img");
		assertTrue(webtest.isTextPresent("���óɹ�"));
		
	}
	@Test(description="�л�����4")
	public void test5() {
		webtest.click("link=���");
		webtest.click("xpath=//*[@id=\"internalSection\"]/div[4]/div/a/img");
		assertTrue(webtest.isTextPresent("���óɹ�"));
		
	}
	@Test(description="�л��հ�����")
	public void test6() {
		webtest.click("link=���");
		webtest.click("xpath=//*[@id=\"internalSection\"]/div[5]/div/a/img");
		assertTrue(webtest.isTextPresent("���óɹ�"));
		
	}
	@Test(description="�Զ�������ҳ��")
	public void test7() {
		webtest.click("link=���");
		webtest.click("xpath=//*[@id=\"internalSection\"]/div[5]/div/a/img");
		webtest.click("xpath=//*[@id=\"internalSection\"]/div[5]/div/div[2]/a");
		assertTrue(webtest.isTextPresent("���óɹ�"));
		
	}
}
