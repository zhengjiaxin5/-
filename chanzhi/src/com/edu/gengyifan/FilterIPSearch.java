package com.edu.gengyifan;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class FilterIPSearch extends BaseTest{
	@Test
	public void testFilterIPSearch() {
		webtest.addWhiteListAccount();
		webtest.frontLogin("demo","demo");
		for(int i=0;i<9;i++) {
			webtest.type("id=words", "1");
		}
		webtest.click("xpath=/html/body/div[1]/div[1]/div/header/div[1]/div/nav/a[2]");
		webtest.frontLogin("demo0","demo");
		for(int i=0;i<2;i++) {
			webtest.type("id=words", "1");
		}
		//����
		assertTrue(webtest.isTextPresent("ϵͳ��⵽������Ϊ�����쳣"));
	}
}
