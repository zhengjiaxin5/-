package com.webtest.demo;

import org.testng.annotations.Test;

public class demo4 extends Admin_Login{
@Test//�������ӱ༭
public void test6() {
	webtest.click("link=�ƹ�");
	webtest.click("link=��������");
	
	webtest.enterFrame(1);
	webtest.click("tag=body");
	webtest.type("tag=body","111");
	webtest.leaveFrame();
	webtest.click("xpath=//*[@id=\"submit\"]");
}
@Test//��ҳ���ӱ༭
public void test16() {
webtest.click("link=�ƹ�");
	webtest.click("link=��������");
	webtest.enterFrame(0);
	webtest.click("tag=body");
	webtest.type("tag=body","��ӵ���վ�в�֪");
	webtest.leaveFrame();
	webtest.click("xpath=//*[@id=\"submit\"]");
}
@Test//��ҳ�����з�����һ������
public void test17() {
	webtest.click("link=�ƹ�");
	webtest.click("link=��������");
	webtest.enterFrame(0);
	webtest.click("xpath=//*[@id=\"ajaxForm\"]/table/tbody/tr[1]/td/div/div[1]/span[8]/span");
	//webtest.click("xpath=//*[@id=\"submit\"]");
}
	

}
