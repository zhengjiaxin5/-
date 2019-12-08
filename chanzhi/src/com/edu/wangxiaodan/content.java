package com.edu.wangxiaodan;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.injector.UnableToInstaniateInstanceException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.webtest.dataprovider.ExcelDataProvider;
import com.webtest.demo.Admin_Login;
import com.webtest.demo.Front_Login_Test;
import com.webtest.utils.ReadProperties;

public class content extends Admin_Login{
	
	@DataProvider
	public Object[][] name() throws IOException {
		ExcelDataProvider excelDataProvider=new ExcelDataProvider();
		Object[][] s=excelDataProvider.getTestDataByExcel("F://nnn.xlsx", "sheet2");
		return s;
	}
	
	@Test(description="������������Ӷ��Ŀ¼",priority=1,dataProvider="name")
	/**
	 * ���Ŀ¼һ����֤�Ƿ���Ŀ¼һ
	 * ���@��3��hadsjkhfsd����֤�Ƿ���@��3��hadsjkhfsd
	 * ��������ո���֤�Ƿ���ʾ��������ȷ����Ŀ����
	 */
	public void test1(String name,String name1) throws IOException{
		testLogin();
		webtest.click1("link=����");
		webtest.click1("link=����");
		webtest.click1("link=ά����Ŀ");
		webtest.type("id=children[]", name);
		String js_bottom = "var q=document.documentElement.scrollTop=10000";
		webtest.runJs(js_bottom);
		webtest.click1("id=submit");
		assertTrue(webtest.isTextPresent(name1));
		
		
	}
	@Test(description="��Ŀ¼һ�����һƪ����,���ⲻ���ظ�",priority=2)
	public void test2() throws IOException {
		testLogin();
		webtest.click1("link=����");
		webtest.click1("link=����");
		boolean s=webtest.isTextPresent("����һ��title");
		webtest.click1("link=Ŀ¼һ");
		webtest.click1("link=��������");
		webtest.type("id=title", "����һ��title");
		webtest.enterFrame(0);
		webtest.click1("tag=body");
		webtest.type("tag=body", "���ǵ�һƪ���µ�����");
		webtest.leaveFrame();
		String js_bottom = "var q=document.documentElement.scrollTop=10000";
		webtest.runJs(js_bottom);
		webtest.click1("id=submit");
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
		Object[][] s=excelDataProvider.getTestDataByExcel("F://nnn.xlsx", "sheet3");
		return s;
	}
	
	@Test(description="��Ŀ¼һ�����һƪ����",dataProvider="name1",priority=3)
	public void test3(String title,String content,String asserts) throws IOException {
		testLogin();
		webtest.click1("link=����");
		webtest.click1("link=����");
		webtest.click1("link=Ŀ¼һ");
		webtest.click1("link=��������");
		webtest.type("id=title", title);
		webtest.enterFrame(0);
		webtest.click1("tag=body");
		webtest.type("tag=body", content);
		webtest.leaveFrame();
		String js_bottom = "var q=document.documentElement.scrollTop=10000";
		webtest.runJs(js_bottom);
		webtest.click1("id=submit");
		assertTrue(webtest.isTextPresent(asserts));
	}
	@Test(description="ɾ��Ŀ¼��",priority=4)
	public void test28() throws IOException {
		testLogin();
		webtest.click1("link=����");
		webtest.click1("link=����");
		webtest.click1("link=ά����Ŀ");
		webtest.click1("xpath=//li[@data-id='6']/a[@class='deleter']");
		webtest.click1("xpath=/html/body/div[2]/div/div/div[2]/button[1]");
		assertTrue(webtest.isTextPresent("Ŀ¼��"));
	}
	@Test(description="��Ŀ¼һ�����һƪtitleΪ�յ�����",priority=4)
	public void test4() throws IOException {
		testLogin();
		webtest.click1("link=����");
		webtest.click1("link=����");
		webtest.click1("link=Ŀ¼һ");
		webtest.click1("link=��������");
//		webtest.type("id=title", );
		webtest.enterFrame(0);
		webtest.click1("tag=body");
		webtest.type("tag=body", "titleΪ��");
		webtest.leaveFrame();
		String js_bottom = "var q=document.documentElement.scrollTop=10000";
		webtest.runJs(js_bottom);
		webtest.click1("id=submit");
		assertTrue(webtest.isTextPresent("����Ϊ��"));
		
	}
	@Test(description="��Ŀ¼һ�����һƪ����Ϊ�յ�����",priority=5)
	public void test5() throws IOException {
		testLogin();
		webtest.click1("link=����");
		webtest.click1("link=����");
		webtest.click1("link=Ŀ¼һ");
		webtest.click1("link=��������");
		webtest.type("id=title","����Ϊ��" );
//		webtest.enterFrame(0);
//		webtest.click1("tag=body");
//		webtest.type("tag=body", "titleΪ��");
//		webtest.leaveFrame();
		String js_bottom = "var q=document.documentElement.scrollTop=10000";
		webtest.runJs(js_bottom);
		webtest.click1("id=submit");
		assertTrue(webtest.isTextPresent("����Ϊ��"));
		
	}
	@Test(description="������������������",priority=6)
	public void test6() throws IOException {
		testLogin();
		webtest.click1("link=����");
		webtest.click1("link=����");
		webtest.type("id=searchWord", "title");
		webtest.click1("id=submit");
		assertTrue(webtest.isTextPresent("title"));
	}
	@Test(description="ֱ�ӵ������",priority=7)
	public void test7() throws IOException {
		testLogin();
		webtest.click1("link=����");
		webtest.click1("link=����");
		webtest.click1("id=submit");
		assertTrue(webtest.isTextPresent("��������������"));
	}
	@Test(description="��ӵ�ҳ",priority=8)
	public void test8() throws IOException {
		testLogin();
		webtest.click1("link=����");
		webtest.click1("link=��ҳ");
		webtest.click1("link=��ӵ�ҳ");
		webtest.type("id=title", "��һ����ҳtitle");
		webtest.enterFrame(0);
		webtest.click1("tag=body");
		webtest.type("tag=body", "��һ����ҳ����");
		webtest.leaveFrame();
		String js_bottom = "var q=document.documentElement.scrollTop=10000";
		webtest.runJs(js_bottom);
		webtest.click1("id=submit");
		assertTrue(webtest.isTextPresent("��һ����ҳtitle"));
	}
	@Test(description="���titleΪ�յĵ�ҳ",priority=9)
	public void test9() throws IOException {
		testLogin();
		webtest.click1("link=����");
		webtest.click1("link=��ҳ");
		webtest.click1("link=��ӵ�ҳ");
//		webtest.type("id=title", "��һ����ҳtitle");
		webtest.enterFrame(0);
		webtest.click1("tag=body");
		webtest.type("tag=body", "��һ����ҳ����");
		webtest.leaveFrame();
		String js_bottom = "var q=document.documentElement.scrollTop=10000";
		webtest.runJs(js_bottom);
		webtest.click1("id=submit");
		assertTrue(webtest.isTextPresent("����Ϊ��"));
	}
	@Test(description="�������Ϊ�յĵ�ҳ",priority=10)
	public void test10() throws IOException {
		testLogin();
		webtest.click1("link=����");
		webtest.click1("link=��ҳ");
		webtest.click1("link=��ӵ�ҳ");
		webtest.type("id=title", "�ڶ�����ҳtitle");
//		webtest.enterFrame(0);
//		webtest.click1("tag=body");
//		webtest.type("tag=body", "��һ����ҳ����");
//		webtest.leaveFrame();
		String js_bottom = "var q=document.documentElement.scrollTop=10000";
		webtest.runJs(js_bottom);
		webtest.click1("id=submit");
		assertTrue(webtest.isTextPresent("��һ����ҳtitle"));
	}
	@Test(description="�Ե�ҳ������������",priority=11)
	public void test11() throws IOException {
		testLogin();
		webtest.click1("link=����");
		webtest.click1("link=��ҳ");
		webtest.type("id=searchWord", "title");
		webtest.click1("id=submit");
		assertTrue(webtest.isTextPresent("title"));
	}
	@Test(description="��ҳֱ�ӵ������",priority=12)
	public void test12() throws IOException {
		testLogin();
		webtest.click1("link=����");
		webtest.click1("link=��ҳ");
		webtest.click1("xpath=//input[@id='submit']");
		assertTrue(webtest.isTextPresent("��������������"));
	}
	@Test(description="�����������Ŀ",priority=13)
	public void test13() throws IOException {
		testLogin();
		webtest.click1("link=����");
		webtest.click1("link=����");
		webtest.click1("link=ά����Ŀ");
		webtest.type("id=children[]", "��һ��Ŀ");
		webtest.click1("id=submit");
		assertTrue(webtest.isTextPresent("��һ��Ŀ"));
	}
	@Test(description="��һ��Ŀ����Ӳ���",priority=14)
	public void test14() throws IOException {
		testLogin();
		webtest.click1("link=����");
		webtest.click1("link=����");
		webtest.click1("link=��һ��Ŀ");
		webtest.click1("link=��������");
		webtest.type("id=title", "����title");
		webtest.enterFrame(0);
		webtest.click1("tag=body");
		webtest.type("tag=body", "��һ����ҳ����");
		webtest.leaveFrame();
		String js_bottom = "var q=document.documentElement.scrollTop=10000";
		webtest.runJs(js_bottom);
		webtest.click1("id=submit");
		assertTrue(webtest.isTextPresent("����title"));
		
	}
	@Test(description="��һ��Ŀ�����titleΪ�յĲ���",priority=15)
	public void test15() throws IOException {
		testLogin();
		webtest.click1("link=����");
		webtest.click1("link=����");
		webtest.click1("link=��һ��Ŀ");
		webtest.click1("link=��������");
//		webtest.type("id=title", "����title");
		webtest.enterFrame(0);
		webtest.click1("tag=body");
		webtest.type("tag=body", "��һ����ҳ����");
		webtest.leaveFrame();
		String js_bottom = "var q=document.documentElement.scrollTop=10000";
		webtest.runJs(js_bottom);
		webtest.click1("id=submit");
		assertTrue(webtest.isTextPresent("����Ϊ��"));
		
	}
	@Test(description="��һ��Ŀ���������Ϊ�ղ���",priority=16)
	public void test16() throws IOException {
		testLogin();
		webtest.click1("link=����");
		webtest.click1("link=����");
		webtest.click1("link=��һ��Ŀ");
		webtest.click1("link=��������");
		webtest.type("id=title", "����title");
//		webtest.enterFrame(0);
//		webtest.click1("tag=body");
//		webtest.type("tag=body", "��һ����ҳ����");
//		webtest.leaveFrame();
		String js_bottom = "var q=document.documentElement.scrollTop=10000";
		webtest.runJs(js_bottom);
		webtest.click1("id=submit");
		assertTrue(webtest.isTextPresent("����Ϊ��"));
		
	}
	@Test(description="�Բ���������������",priority=17)
	public void test17() throws IOException {
		testLogin();
		webtest.click1("link=����");
		webtest.click1("link=����");
		webtest.type("id=searchWord", "����title");
		webtest.click1("id=submit");
		assertTrue(webtest.isTextPresent("title"));
	}
	@Test(description="����ֱ�ӵ������",priority=18)
	public void test18() throws IOException {
		testLogin();
		webtest.click1("link=����");
		webtest.click1("link=����");
		webtest.click1("xpath=//input[@id='submit']");
		assertTrue(webtest.isTextPresent("��������������"));
	}
	@Test(description="����ֲ��µ���Ŀ",priority=19)
	public void test19() throws IOException {
		testLogin();
		webtest.click1("link=����");
		webtest.click1("link=�ֲ�");
		webtest.click1("link=���");
		webtest.type("id=title", "�û��ֲ�");
		webtest.type("id=alias", "�����û��ֲ�");
		String js_bottom = "var q=document.documentElement.scrollTop=10000";
		webtest.runJs(js_bottom);
		webtest.click1("xpath=//*[@id='submit']");
		assertTrue(webtest.isTextPresent("�û��ֲ�"));
	}
	@DataProvider
	public Object[][] name3() throws IOException {
		ExcelDataProvider excelDataProvider=new ExcelDataProvider();
		Object[][] s=excelDataProvider.getTestDataByExcel("F://nnn.xls", "sheet4");
		return s;
	}
	@Test(description="�û��ֲ���������½�",priority=20,dataProvider="name3")
	public void test20(String title1,String title2) throws IOException {
		testLogin();
		webtest.click1("link=����");
		webtest.click1("link=�ֲ�");
		webtest.click1("link=�û��ֲ�");
		webtest.click1("link=�½�");
		webtest.type("id=title[]", title1);
		String js_bottom = "var q=document.documentElement.scrollTop=10000";
		webtest.runJs(js_bottom);
		webtest.click1("xpath=//*[@id='submit']");
		assertTrue(webtest.isTextPresent(title2));
	}
	@Test(description="���ֲ��½�������",priority=21)
	public void test21() throws IOException {
		testLogin();
		webtest.click1("link=����");
		webtest.click1("link=�ֲ�");
		webtest.type("id=searchWord", "��������");
		webtest.click1("id=submit");
		assertTrue(webtest.isTextPresent("��������"));
		
	}
	@Test(description="���ֲ��½�������",priority=21)
	public void test22() throws IOException {
		testLogin();
		webtest.click1("link=����");
		webtest.click1("link=�ֲ�");
		webtest.click1("id=submit");
		assertTrue(webtest.isTextPresent("��������������"));
	}
	@Test(description="�ֲ��µ�������ʾ��һ��option",priority=22)
	public void test23() throws IOException {
		testLogin();
		webtest.click1("link=����");
		webtest.click1("link=�ֲ�");
		webtest.click1("xpath=/html/body/div/div[1]/div/div/div/div/a[2]");
		webtest.click1("id=index");
		webtest.click1("xpath=//option[@value='1']");
		webtest.click1("id=submit");
		ReadProperties u=new ReadProperties();
		String url=u.getPropertyValue("fronturl");
		webtest.open(url);
		webtest.click1("link=�ֲ�");
		assertTrue(webtest.isTextPresent("��������"));
	}
	@Test(description="�ֲ��µ�������ʾ�ֲ��б�",priority=22)
	public void test24() throws IOException {
		testLogin();
		webtest.click1("link=����");
		webtest.click1("link=�ֲ�");
		webtest.click1("xpath=/html/body/div/div[1]/div/div/div/div/a[2]");
		webtest.click1("id=index");
		webtest.click1("xpath=//option[@value='list']");
		webtest.click1("id=submit");
		ReadProperties u=new ReadProperties();
		String url=u.getPropertyValue("fronturl");
		webtest.open(url);
		webtest.click1("link=�ֲ�");
		assertTrue(webtest.isTextPresent("�û��ֲ�"));
		assertTrue(webtest.isTextPresent("��������"));
	}
}
