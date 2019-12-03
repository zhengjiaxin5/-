package com.webtest.chanzhiepsProject;

import static org.testng.Assert.assertTrue;

import java.net.UnknownHostException;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class FilterAccountVerificationCode extends BaseTest{
	@Test
	public void testFilterAccountVerificationCode() throws UnknownHostException {
		webtest.addWhiteListIP();
		//��ҳ��
		webtest.open("http://localhost/chanzhieps/www/index.php/user-login.html");
		//ѭ�������˺�����ʹ������֤��
		for (int i = 0; i < 6; i++) {
			webtest.type("account", "demo");
			webtest.type("password", "demo");
			webtest.type("xpath=/html/body/div[1]/div[2]/div/div[2]/div/div/div/div[2]/form/div[4]", "1");
		}
		//����
		assertTrue(webtest.isTextPresent("ϵͳ��⵽������Ϊ�����쳣"));
	}
}
