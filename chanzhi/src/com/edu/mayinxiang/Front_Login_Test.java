package com.edu.mayinxiang;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.demo.Admin_Login;

public class Front_Login_Test extends Admin_Login{

	@Test
	public void testLogin() {
		System.out.print("a");
		//��ҳ��
//		webtest.open("http://localhost:8032/mymovie/admin.php/");
//		//�ı�������
//		webtest.type("name=username", "admin");
//		webtest.type("name=password", "admin");
//		webtest.click("xpath=//input[@type='submit']");
	}

}
