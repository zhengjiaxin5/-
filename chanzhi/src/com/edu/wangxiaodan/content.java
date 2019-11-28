package com.edu.wangxiaodan;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.webtest.dataprovider.ExcelDataProvider;
import com.webtest.demo.Admin_Login;

public class content extends Admin_Login{
	@DataProvider
	public Object[][] name() throws IOException {
		ExcelDataProvider excelDataProvider=new ExcelDataProvider();
		Object[][] s=excelDataProvider.getTestDataByExcel("E://nnn.xls", "sheet2");
		return s;
	}
	
	@Test(description="������������Ӷ��Ŀ¼",priority=1,dataProvider="name")
	/**
	 * ���Ŀ¼һ����֤�Ƿ���Ŀ¼һ
	 * ���@��3��hadsjkhfsd����֤�Ƿ���@��3��hadsjkhfsd
	 * ��������ո���֤�Ƿ���ʾ��������ȷ����Ŀ����
	 */
	public void test1(String name,String name1){
		testLogin();
		webtest.click("link=����");
		webtest.click("link=����");
		webtest.click("link=ά����Ŀ");
		webtest.type("id=children[]", name);
		webtest.click("id=submit");
		assertTrue(webtest.isTextPresent(name1));
		
		
	}
	@Test(description="��Ŀ¼һ�����һƪ����,���ⲻ���ظ�")
	public void test2() {
		testLogin();
		webtest.click("link=����");
		webtest.click("link=����");
		boolean s=webtest.isTextPresent("����һ��title");
		webtest.click("link=Ŀ¼һ");
		webtest.click("link=��������");
		webtest.type("id=title", "����һ��title");
		webtest.enterFrame(0);
		webtest.click("tag=body");
		webtest.type("tag=body", "���ǵ�һƪ���µ�����");
		webtest.leaveFrame();
		String js_bottom = "var q=document.documentElement.scrollTop=10000";
		webtest.runJs(js_bottom);
		webtest.click("id=submit");
		if(s==true) {
			assert(webtest.isTextPresent("����һ��title"));
		}
	}
	/**
	 * ��ȷ�����һƪ����
	 * ���һƪtitleΪ�ո������
	 * ���һƪ����Ϊ�ո������
	 * 
	 */
	@DataProvider
	public Object[][] name1() throws IOException {
		ExcelDataProvider excelDataProvider=new ExcelDataProvider();
		Object[][] s=excelDataProvider.getTestDataByExcel("E://nnn.xls", "sheet3");
		return s;
	}
	
	@Test(description="��Ŀ¼һ�����һƪ����",dataProvider="name1")
	public void test3(String title,String content,String asserts) {
		testLogin();
		webtest.click("link=����");
		webtest.click("link=����");
		webtest.click("link=Ŀ¼һ");
		webtest.click("link=��������");
		webtest.type("id=title", title);
		webtest.enterFrame(0);
		webtest.click("tag=body");
		webtest.type("tag=body", content);
		webtest.leaveFrame();
		String js_bottom = "var q=document.documentElement.scrollTop=10000";
		webtest.runJs(js_bottom);
		webtest.click("id=submit");
		assertTrue(webtest.isTextPresent(asserts));
	}
	@Test(description="��Ŀ¼һ�����һƪtitleΪ�յ�����")
	public void test4() {
		testLogin();
		webtest.click("link=����");
		webtest.click("link=����");
		webtest.click("link=Ŀ¼һ");
		webtest.click("link=��������");
//		webtest.type("id=title", );
		webtest.enterFrame(0);
		webtest.click("tag=body");
		webtest.type("tag=body", "titleΪ��");
		webtest.leaveFrame();
		String js_bottom = "var q=document.documentElement.scrollTop=10000";
		webtest.runJs(js_bottom);
		webtest.click("id=submit");
		assertTrue(webtest.isTextPresent("����Ϊ��"));
		
	}
	@Test(description="��Ŀ¼һ�����һƪ����Ϊ�յ�����")
	public void test5() {
		testLogin();
		webtest.click("link=����");
		webtest.click("link=����");
		webtest.click("link=Ŀ¼һ");
		webtest.click("link=��������");
		webtest.type("id=title","����Ϊ��" );
//		webtest.enterFrame(0);
//		webtest.click("tag=body");
//		webtest.type("tag=body", "titleΪ��");
//		webtest.leaveFrame();
		String js_bottom = "var q=document.documentElement.scrollTop=10000";
		webtest.runJs(js_bottom);
		webtest.click("id=submit");
		assertTrue(webtest.isTextPresent("����Ϊ��"));
		
	}
	@Test(description="������������������")
	public void test6() {
		testLogin();
		webtest.click("link=����");
		webtest.click("link=����");
		webtest.type("id=searchWord", "title");
		webtest.click("id=submit");
		assertTrue(webtest.isTextPresent("title"));
	}
	@Test(description="ֱ�ӵ������")
	public void test7() {
		testLogin();
		webtest.click("link=����");
		webtest.click("link=����");
		webtest.click("id=submit");
		assertTrue(webtest.isTextPresent("��������������"));
	}
	@Test(description="��ӵ�ҳ")
	public void test8() {
		testLogin();
		webtest.click("link=����");
		webtest.click("link=��ҳ");
		webtest.click("link=��ӵ�ҳ");
		webtest.type("id=title", "��һ����ҳtitle");
		webtest.enterFrame(0);
		webtest.click("tag=body");
		webtest.type("tag=body", "��һ����ҳ����");
		webtest.leaveFrame();
		String js_bottom = "var q=document.documentElement.scrollTop=10000";
		webtest.runJs(js_bottom);
		webtest.click("id=submit");
		assertTrue(webtest.isTextPresent("��һ����ҳtitle"));
	}
	@Test(description="���titleΪ�յĵ�ҳ")
	public void test9() {
		testLogin();
		webtest.click("link=����");
		webtest.click("link=��ҳ");
		webtest.click("link=��ӵ�ҳ");
//		webtest.type("id=title", "��һ����ҳtitle");
		webtest.enterFrame(0);
		webtest.click("tag=body");
		webtest.type("tag=body", "��һ����ҳ����");
		webtest.leaveFrame();
		String js_bottom = "var q=document.documentElement.scrollTop=10000";
		webtest.runJs(js_bottom);
		webtest.click("id=submit");
		assertTrue(webtest.isTextPresent("����Ϊ��"));
	}
	@Test(description="�������Ϊ�յĵ�ҳ")
	public void test10() {
		testLogin();
		webtest.click("link=����");
		webtest.click("link=��ҳ");
		webtest.click("link=��ӵ�ҳ");
		webtest.type("id=title", "�ڶ�����ҳtitle");
//		webtest.enterFrame(0);
//		webtest.click("tag=body");
//		webtest.type("tag=body", "��һ����ҳ����");
//		webtest.leaveFrame();
		String js_bottom = "var q=document.documentElement.scrollTop=10000";
		webtest.runJs(js_bottom);
		webtest.click("id=submit");
		assertTrue(webtest.isTextPresent("��һ����ҳtitle"));
	}
	@Test(description="�Ե�ҳ������������")
	public void test11() {
		testLogin();
		webtest.click("link=����");
		webtest.click("link=��ҳ");
		webtest.type("id=searchWord", "title");
		webtest.click("id=submit");
		assertTrue(webtest.isTextPresent("title"));
	}
	@Test(description="��ҳֱ�ӵ������")
	public void test12() {
		testLogin();
		webtest.click("link=����");
		webtest.click("link=��ҳ");
		webtest.click("id=submit");
		assertTrue(webtest.isTextPresent("��������������"));
	}
}
