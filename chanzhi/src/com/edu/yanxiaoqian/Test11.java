package com.edu.yanxiaoqian;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.demo.Admin_Login;

public class Test11 extends Admin_Login{
	@Test(description="��֪��ҳ����������ת")
	public void testGsxx1() {
		webtest.click("xpath=//*[@id=\"primaryNavbar\"]/ul[1]/li[1]/a");
		webtest.click("xpath=//*[@id=\"mainNavbarCollapse\"]/ul[1]/li[1]/a");
		webtest.click("xpath=//*[@id=\"widget5\"]/div[2]/div/a[1]");
		assertTrue(webtest.isTextPresent("��������"));
	}
	
	@Test(description="��֪��ҳ��Ӳ�Ʒ��ת")
	public void testGsxx2() {
		webtest.click("xpath=//*[@id=\"primaryNavbar\"]/ul[1]/li[1]/a");
		webtest.click("xpath=//*[@id=\"mainNavbarCollapse\"]/ul[1]/li[1]/a");
		webtest.click("xpath=//*[@id=\"widget5\"]/div[2]/div/a[2]");
		assertTrue(webtest.isTextPresent("��Ӳ�Ʒ"));
	}
	
	@Test(description="��֪��ҳ��������ת")
	public void testGsxx3() {
		webtest.click("xpath=//*[@id=\"primaryNavbar\"]/ul[1]/li[1]/a");
		webtest.click("xpath=//*[@id=\"mainNavbarCollapse\"]/ul[1]/li[1]/a");
		webtest.click("xpath=//*[@id=\"widget5\"]/div[2]/div/a[3]");
		assertTrue(webtest.isTextPresent("������"));
	}
	
	@Test(description="��֪��ҳվ��������ת")
	public void testGsxx4() {
		webtest.click("xpath=//*[@id=\"primaryNavbar\"]/ul[1]/li[1]/a");
		webtest.click("xpath=//*[@id=\"mainNavbarCollapse\"]/ul[1]/li[1]/a");
		webtest.click("xpath=//*[@id=\"widget5\"]/div[2]/div/a[4]");
		assertTrue(webtest.isTextPresent("������Ϣ����"));
	}
	
	@Test(description="��֪��ҳ��˾��Ϣ��ת")
	public void testGsxx5() {
		webtest.click("xpath=//*[@id=\"primaryNavbar\"]/ul[1]/li[1]/a");
		webtest.click("xpath=//*[@id=\"mainNavbarCollapse\"]/ul[1]/li[1]/a");
		webtest.click("xpath=//*[@id=\"widget5\"]/div[2]/div/a[5]");
		assertTrue(webtest.isTextPresent("��˾��Ϣ"));
	}
	
	@Test(description="��֪��ҳ��ϵ��ʽ��ת")
	public void testGsxx6() {
		webtest.click("xpath=//*[@id=\"primaryNavbar\"]/ul[1]/li[1]/a");
		webtest.click("xpath=//*[@id=\"mainNavbarCollapse\"]/ul[1]/li[1]/a");
		webtest.click("xpath=//*[@id=\"widget5\"]/div[2]/div/a[6]");
		assertTrue(webtest.isTextPresent("��ϵ��ʽ"));
	}

}
