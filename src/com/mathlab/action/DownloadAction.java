package com.mathlab.action;

import java.io.InputStream;
import java.io.UnsupportedEncodingException;

import org.apache.struts2.ServletActionContext;

import com.mathlab.util.UploadConfigurationRead;
import com.opensymphony.xwork2.ActionSupport;

public class DownloadAction extends ActionSupport
{
	private static final long serialVersionUID = 6329383258366253255L;
	private String fileName;
	private String fileRealName;
	public void setFileName()
	{
		// �õ��������ص��ļ���
		String fname = ServletActionContext.getRequest().getParameter("name");
		String frealname = ServletActionContext.getRequest().getParameter("realname");
		try
		{
			fname = new String(fname.getBytes("ISO-8859-1"), "UTF-8");
			frealname= new String(frealname.getBytes("ISO-8859-1"), "UTF-8");
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		this.fileName = fname;
		this.fileRealName = frealname;
		System.out.println(fileName);
		System.out.println(fileRealName);
	}

	/*
	 * @getFileName �˷�����Ӧ����struts.xml�ļ��еģ� <param
	 * name="contentDisposition">attachment;filename="${fileName}"</param>
	 * ����������õ������ع��������ļ�ʱ��ʾ���ļ��� Ҫ����ȷ����ʾ�����ļ���������Ҫ��fileName�ٴα���
	 * �����������ļ����������룬���޷����ص����
	 */
	public String getFileName() throws UnsupportedEncodingException
	{

		fileRealName = new String(fileRealName.getBytes(), "ISO-8859-1");

		return fileRealName;
	}

	/*
	 * @getDownloadFile �˷�����Ӧ����struts.xml�ļ��еģ� <param
	 * name="inputName">downloadFile</param> ���������ļ�������Բο�struts2��Դ��
	 */
	public InputStream getDownloadFile()
	{

		this.setFileName();
		return ServletActionContext.getServletContext().getResourceAsStream("/"+UploadConfigurationRead.getInstance().getConfigItem("uploadFilePath").trim()+"/" + fileName);
	}

	@Override
	public String execute() throws Exception
	{
		return SUCCESS;
	}
}