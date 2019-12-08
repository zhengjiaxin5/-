package com.edu.gengyifan;

import static org.testng.Assert.assertTrue;

import java.net.UnknownHostException;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class FilterAccountLogin extends BaseTest{
	@Test
	public void testFilterAccountLogin() throws UnknownHostException {
		webtest.addWhiteListIP();
		//����ǰ̨����
		webtest.open("http://localhost/chanzhieps/www/index.php/user-login.html");
		//ѭ����¼
		webtest.type("id=account", "demo");
		webtest.type("id=password", "demo0");
		for(int i=0;i<11;i++) {
			webtest.click("id=submit");
		}
		//����
		assertTrue(webtest.isTextPresent("�û��Ѿ�����������3���Ӻ������³��Ե�¼"));
	}
}
