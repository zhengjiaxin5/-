package com.edu.liqiushui;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.demo.Admin_Login;

public class Theme extends Admin_Login1{
	
	@Test(priority = 1,description="�л�����1")
	//���-����ģ��
	public void test1() {
		testLogin();
		webtest.click("xpath=/html/body/nav[1]/ul[1]/li[6]/a");
		webtest.click("link=����");
		webtest.click("xpath=//*[@id=\"internalSection\"]/div[1]/div/a/img");//�л�Ϊ��һ������
		assertTrue(webtest.isTextPresent("zhuti"));

	}
	@Test(description="�л�����2")
	public void test2() {
		testLogin();
		webtest.click("link='���'");
		webtest.click("link='����'");
		webtest.click("//*[@id=\"internalSection\"]/div[2]/div/a/img");//�л�Ϊ�ڶ�������
		assertTrue(webtest.isTextPresent("zhuti2"));

	}
	@Test(description="�л�����3")
	public void test3() {
		testLogin();
		webtest.click("link='���'");
		webtest.click("link='����'");
		webtest.click("//*[@id=\"internalSection\"]/div[3]/div/a/img");//�л�Ϊ����������

	}
	@Test(description="�л��հ�����")
	public void test4() {
		testLogin();
		webtest.click("link='���'");
		webtest.click("link='����'");
		webtest.click("//*[@id=\"internalSection\"]/div[5]/div/a/img");//�л��ɿհ�����

	}
	/*
	//���Զ������������һ������
	public void test5() {
		testLogin();
		webtest.click("link='���'");
		webtest.click("link='����'");
		webtest.click("/html/body/div/div[2]/div[2]/section[1]/div[5]/div/a/img");//�л��ɿհ�����
		webtest.click("/html/body/div/div[2]/div[2]/section[1]/div[5]/div/a/img");//�����Զ���
		//����������
		

	}
	*/
	//���ӻ��༭�иı��ֲ�ͼ˳��
	@Test(description="�ı��ֲ�ͼ˳��")
	public void test6() {
		testLogin();
		webtest.click("link='���'");
		webtest.click("link='����'");
		webtest.click("/html/body/div/div[2]/div[2]/section[1]/div[5]/div/a/img");//�л��ɿհ�����
		webtest.click("/html/body/div/div[2]/div[2]/section[1]/div[5]/div/div[2]/a");//�����Զ���
		webtest.click("/html/body/div/div/div[2]/div/a[1]");//������ӻ��༭
		webtest.click("/html/body/div[1]/div[2]/div/div[2]/div[1]/div[1]/div/div[1]/div[1]/div[2]/div[2]/a[4]");//��˳��
	}
	
	

}
