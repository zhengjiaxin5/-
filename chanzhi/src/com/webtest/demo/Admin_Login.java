package com.webtest.demo;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.utils.ReadProperties;

public class Admin_Login  extends BaseTest{
	
	

	@Test(description="后台登录")
	public void testLogin() throws IOException {
		ReadProperties u=new ReadProperties();
		String url=u.getPropertyValue("base_url");
		webtest.open(url);
		webtest.type("name=account", "yanxiaoqian");
		webtest.type("name=password", "123456");
		webtest.click("xpath=//*[@id=\"submit\"]");
		

	
		}
//	@Test
//	public void testLogin() {
//		//��ҳ��
//		webtest.open("http://localhost:8032/mymovie/admin.php/");
//		//�ı�������
//		webtest.type("name=username", "admin");
//		webtest.type("name=password", "admin");
//		webtest.click("xpath=//input[@type='submit']");
//		
//		
//	}

}
