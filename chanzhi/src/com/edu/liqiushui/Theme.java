package com.edu.liqiushui;

import org.testng.annotations.Test;

import com.webtest.demo.Admin_Login;

public class Theme extends Admin_Login{
	
	@Test(priority = 1,description="�л�����1")
	//���-����ģ��
	public void test1() {
		testLogin();
		webtest.click("//a[text()='���']");
		webtest.click("//a[text()='����']");
		webtest.click("/html/body/div/div[2]/div[2]/section[1]/div[1]/div/a/img");//�л�Ϊ��һ������

	}
	@Test(description="�л�����2")
	public void test2() {
		testLogin();
		webtest.click("//a[text()='���']");
		webtest.click("//a[text()='����']");
		webtest.click("/html/body/div/div[2]/div[2]/section[1]/div[2]/div/a/img");//�л�Ϊ�ڶ�������

	}
	@Test(description="�л�����3")
	public void test3() {
		testLogin();
		webtest.click("//a[text()='���']");
		webtest.click("//a[text()='����']");
		webtest.click("/html/body/div/div[2]/div[2]/section[1]/div[2]/div/a/img");//�л�Ϊ����������

	}
	@Test(description="�л��հ�����")
	public void test4() {
		testLogin();
		webtest.click("//a[text()='���']");
		webtest.click("//a[text()='����']");
		webtest.click("/html/body/div/div[2]/div[2]/section[1]/div[5]/div/a/img");//�л��ɿհ�����

	}
	/*
	//���Զ������������һ������
	public void test5() {
		testLogin();
		webtest.click("//a[text()='���']");
		webtest.click("//a[text()='����']");
		webtest.click("/html/body/div/div[2]/div[2]/section[1]/div[5]/div/a/img");//�л��ɿհ�����
		webtest.click("/html/body/div/div[2]/div[2]/section[1]/div[5]/div/a/img");//�����Զ���
		//����������
		

	}
	*/
	//���ӻ��༭�иı��ֲ�ͼ˳��
	@Test(description="�ı��ֲ�ͼ˳��")
	public void test6() {
		testLogin();
		webtest.click("//a[text()='���']");
		webtest.click("//a[text()='����']");
		webtest.click("/html/body/div/div[2]/div[2]/section[1]/div[5]/div/a/img");//�л��ɿհ�����
		webtest.click("/html/body/div/div[2]/div[2]/section[1]/div[5]/div/div[2]/a");//�����Զ���
		webtest.click("/html/body/div/div/div[2]/div/a[1]");//������ӻ��༭
		webtest.click("/html/body/div[1]/div[2]/div/div[2]/div[1]/div[1]/div/div[1]/div[1]/div[2]/div[2]/a[4]");//��˳��
	}
	
	

}
