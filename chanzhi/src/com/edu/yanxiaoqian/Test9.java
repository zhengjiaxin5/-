package com.edu.yanxiaoqian;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.demo.Admin_Login;

public class Test9 extends Admin_Login{
	@Test(description="���ŵ�¼΢�Źر��Զ���¼")
	public void testGsxx1() {
		webtest.click("xpath=//*[@id=\"primaryNavbar\"]/ul[1]/li[8]/a");
		webtest.click("xpath=//*[@id=\"mainNavbarCollapse\"]/ul[1]/li[3]/a");
		webtest.type("xpath=/html/body/div/div[2]/div/div[5]/div/div[2]/form/table/tbody/tr[1]/td/input", "!");
		webtest.type("xpath=/html/body/div/div[2]/div/div[5]/div/div[2]/form/table/tbody/tr[2]/td/input", "!");
		webtest.click("xpath=/html/body/div/div[2]/div/div[5]/div/div[2]/form/table/tbody/tr[3]/td/label[2]/input");
		webtest.click("xpath=/html/body/div/div[2]/div/div[5]/div/div[2]/form/table/tbody/tr[4]/td/input[1]");
		assertTrue(webtest.isTextPresent("���óɹ�"));
	}
	
	@Test(description="���ŵ�¼΢�ſ����Զ���¼")
	public void testGsxx2() {
		webtest.click("xpath=//*[@id=\"primaryNavbar\"]/ul[1]/li[8]/a");
		webtest.click("xpath=//*[@id=\"mainNavbarCollapse\"]/ul[1]/li[3]/a");
		webtest.type("xpath=/html/body/div/div[2]/div/div[5]/div/div[2]/form/table/tbody/tr[1]/td/input", "!");
		webtest.type("xpath=/html/body/div/div[2]/div/div[5]/div/div[2]/form/table/tbody/tr[2]/td/input", "!");
		webtest.click("xpath=/html/body/div/div[2]/div/div[5]/div/div[2]/form/table/tbody/tr[3]/td/label[1]/input");
		webtest.click("xpath=/html/body/div/div[2]/div/div[5]/div/div[2]/form/table/tbody/tr[4]/td/input[1]");
		assertTrue(webtest.isTextPresent("���óɹ�"));
	}

}
