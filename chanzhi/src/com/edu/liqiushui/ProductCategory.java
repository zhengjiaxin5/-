package com.edu.liqiushui;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.demo.Admin_Login;

public class ProductCategory  extends Admin_Login{
	
	@Test(description="��Ӳ�Ʒ�����������һ��ѡ��")
	public void Product111() {
		webtest.click("link=���");
		webtest.click("link=����");
		webtest.click("xpath=/html/body/div/div[2]/div[1]/div/div[1]/div/a");//���
		webtest.click("xpath=//*[@id=\"contentTab\"]/table/tbody[1]/tr[1]/td/div/button");//����������
		webtest.click("link=��Ʒ����");
		webtest.typeAndClear("id=title","��1��");
		webtest.click("id=params[showChildren]1");
		webtest.click("id=params[initialExpand]1");
		webtest.click("id=params[fromCurrent]1");
		webtest.click("id=submit");
	}
	@Test(description="��Ӳ�Ʒ����������ڶ���ѡ��")
	public void Product112() {
		webtest.click("xpath=/html/body/div/div[2]/div[1]/div/div[1]/div/a");//���
		webtest.click("xpath=//*[@id=\"contentTab\"]/table/tbody[1]/tr[1]/td/div/button");//����������
		webtest.click("link=��Ʒ����");
		webtest.typeAndClear("id=title","��2��");
		webtest.click("id=params[showChildren]1");
		webtest.click("id=params[initialExpand]1");
		webtest.click("id=params[fromCurrent]2");
		webtest.click("id=submit");
	}
	@Test(description="��Ӳ�Ʒ���������������ѡ��")
	public void Product121() {

		webtest.click("xpath=/html/body/div/div[2]/div[1]/div/div[1]/div/a");//���
		webtest.click("xpath=//*[@id=\"contentTab\"]/table/tbody[1]/tr[1]/td/div/button");//����������
		webtest.click("link=��Ʒ����");
		webtest.typeAndClear("id=title","��3��");
		webtest.click("id=params[showChildren]1");
		webtest.click("id=params[initialExpand]2");
		webtest.click("id=params[fromCurrent]1");
		webtest.click("id=submit");
	}
	@Test(description="��Ӳ�Ʒ���������������ѡ��")
	public void Product122() {

		webtest.click("xpath=/html/body/div/div[2]/div[1]/div/div[1]/div/a");//���
		webtest.click("xpath=//*[@id=\"contentTab\"]/table/tbody[1]/tr[1]/td/div/button");//����������
		webtest.click("link=��Ʒ����");
		webtest.typeAndClear("id=title","��4��");
		webtest.click("id=params[showChildren]1");
		webtest.click("id=params[initialExpand]2");
		webtest.click("id=params[fromCurrent]2");
		webtest.click("id=submit");
	}
	@Test(description="��Ӳ�Ʒ���������������ѡ��")
	public void Product211() {

		webtest.click("xpath=/html/body/div/div[2]/div[1]/div/div[1]/div/a");//���
		webtest.click("xpath=//*[@id=\"contentTab\"]/table/tbody[1]/tr[1]/td/div/button");//����������
		webtest.click("link=��Ʒ����");
		webtest.typeAndClear("id=title","��5��");
		webtest.click("id=params[showChildren]2");
		webtest.click("id=params[initialExpand]1");
		webtest.click("id=params[fromCurrent]1");
		webtest.click("id=submit");
	}
	@Test(description="��Ӳ�Ʒ���������������ѡ��")
	public void Product212() {

		webtest.click("xpath=/html/body/div/div[2]/div[1]/div/div[1]/div/a");//���
		webtest.click("xpath=//*[@id=\"contentTab\"]/table/tbody[1]/tr[1]/td/div/button");//����������
		webtest.click("link=��Ʒ����");
		webtest.typeAndClear("id=title","��6��");
		webtest.click("id=params[showChildren]2");
		webtest.click("id=params[initialExpand]1");
		webtest.click("id=params[fromCurrent]2");
		webtest.click("id=submit");
	}
	@Test(description="��Ӳ�Ʒ���������������ѡ��")
	public void Product221() {

		webtest.click("xpath=/html/body/div/div[2]/div[1]/div/div[1]/div/a");//���
		webtest.click("xpath=//*[@id=\"contentTab\"]/table/tbody[1]/tr[1]/td/div/button");//����������
		webtest.click("link=��Ʒ����");
		webtest.typeAndClear("id=title","��7��");
		webtest.click("id=params[showChildren]2");
		webtest.click("id=params[initialExpand]2");
		webtest.click("id=params[fromCurrent]1");
		webtest.click("id=submit");
	}
	@Test(description="��Ӳ�Ʒ����������ڰ���ѡ��")
	public void Product222s() {

		webtest.click("xpath=/html/body/div/div[2]/div[1]/div/div[1]/div/a");//���
		webtest.click("xpath=//*[@id=\"contentTab\"]/table/tbody[1]/tr[1]/td/div/button");//����������
		webtest.click("link=��Ʒ����");
		webtest.typeAndClear("id=title","��8��");
		webtest.click("id=params[showChildren]2");
		webtest.click("id=params[initialExpand]2");
		webtest.click("id=params[fromCurrent]2");
		webtest.click("id=submit");
	}

		

}



