package com.edu.gengyifan;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class FilterIPVerificationCode extends BaseTest{
	@Test
	public void testFilterIPVerificationCode() {
		webtest.addWhiteListAccount();
		//��ҳ��
		webtest.open("http://localhost/chanzhieps/www/index.php/user-login.html");
		//ѭ�������˺�����ʹ������֤��
		webtest.type("account", "demo");
		webtest.type("password", "demo");
		webtest.type("xpath=/html/body/div[1]/div[2]/div/div[2]/div/div/div/div[2]/form/div[4]", "1");
		for (int i = 0; i < 4; i++) {
			webtest.click("id=submit");
		}
		//ѭ�������˺�����ʹ������֤��
		webtest.open("http://localhost/chanzhieps/www/index.php/user-login.html");
		webtest.type("account", "demo0");
		webtest.type("password", "demo");
		webtest.type("xpath=/html/body/div[1]/div[2]/div/div[2]/div/div/div/div[2]/form/div[4]", "1");
		for (int i = 0; i < 2; i++) {
			webtest.click("id=submit");
		}
		//����
		assertTrue(webtest.isTextPresent("ϵͳ��⵽������Ϊ�����쳣"));
	}
}
