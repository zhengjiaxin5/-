package com.edu.liqiushui;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Admin_Login1  extends BaseTest{
	
	@Test
	public void testLogin() {
		
		webtest.open("http://127.0.0.1:2222/chanzhieps/www/admin.php?m=admin&f=index");
		//�ı�������
		webtest.type("name=account", "admin");
		webtest.type("name=password", "123456");
		webtest.click("xpath=//*[@id=\"submit\"]");
		assertTrue(webtest.isTextPresent("�Զ���"));
	}

}






//package com.edu.liqiushui;
//
//import static org.testng.Assert.assertTrue;
//
//import java.io.IOException;
//
//import org.testng.Assert;
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;
//
//import com.webtest.core.BaseTest;
//import com.webtest.dataprovider.*;
//public class Admin_Login extends BaseTest {
//	
//	public void testLogin() {
//		//��ҳ��
//		webtest.open("http://127.0.0.1:2222/chanzhieps/www/admin.php?m=admin&f=index");
//		//�ı�������
//		webtest.type("name=account","admin");
//		webtest.type("name=password","123456");
//		webtest.click("xpath=//input[@type='submit']");
//	}
//
//}
