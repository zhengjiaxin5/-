package com.webtest.demo;

import org.testng.annotations.Test;

public class demo6 extends Admin_Login{
@Test//���ƺ������ύ
public void test7() {
	webtest.click("link=�ƹ�");
	webtest.click("link=���ƺ�");
	webtest.click("link=�����ύ");
	webtest.click("link=�����ύ��Դ");
}
@Test//���ƺ���־
public void test8() {
	webtest.click("link=�ƹ�");
	webtest.click("link=���ƺ�");
	webtest.click("link=��־");
	webtest.click("link=���һ��");
	
}
@Test//���ƺ���־
public void test9() {
	webtest.click("link=�ƹ�");
	webtest.click("link=���ƺ�");
	webtest.click("link=��־");
	webtest.click("name=end");
	webtest.click("xpath=/html/body/div[3]/div[3]/table/tbody/tr[2]/td[4]");
	webtest.click("link=����");
}
@Test//���ƺ���־
public void test10() {
	webtest.click("link=�ƹ�");
	webtest.click("link=���ƺ�");
	webtest.click("link=��־");
	webtest.click("link=���30��");
	webtest.click("xpath=/html/body/div[1]/div[2]/div/table/tbody/tr[21]/td/div/a[1]");
}



}
