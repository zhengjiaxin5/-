package com.edu.wangxiaodan;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.dataprovider.*;
public class Admin_Login extends BaseTest {
	
	public void testLogin() {
		//��ҳ��
		webtest.open("http://127.0.0.1:8066/chanzhieps/www/admin.php?m=admin&f=index");
		//�ı�������
		webtest.type("name=account","admin");
		webtest.type("name=password","admin");
		webtest.click("xpath=//input[@type='submit']");
	}

}
