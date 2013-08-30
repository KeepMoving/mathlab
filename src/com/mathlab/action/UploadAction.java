package com.mathlab.action;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.mathlab.util.UploadConfigurationRead;
import com.opensymphony.xwork2.ActionSupport;

/**
 * ���ļ��ϴ���
 * 
 * @author MZ
 * 
 * @Time 2009-11-24����09:26:44
 */
public class UploadAction extends ActionSupport
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private File[] upload;// ʵ���ϴ��ļ�
	private String[] uploadContentType; // �ļ�����������
	private String[] uploadFileName; // �ϴ��ļ���
	private List<UploadFiles> uploadFiles = new ArrayList<UploadFiles>();

	public String execute() throws Exception
	{
		try
		{
			String targetDirectory = ServletActionContext.getServletContext()
					.getRealPath("/"+ UploadConfigurationRead.getInstance().getConfigItem("uploadFilePath").trim());// ���·��
			for (int i = 0; i < upload.length; i++)
			{
				String fileName = uploadFileName[i];// �ϴ����ļ���
				String type = uploadContentType[i];// �ļ�����
				String realName = UUID.randomUUID().toString()+ getExt(fileName);// ������ļ���ƣ�ʹ��UUID+��׺���б���

				File target = new File(targetDirectory, realName);
				FileUtils.copyFile(upload[i], target);// �ϴ��w������Ŀ¼��һ�㶼�������
														// �ڰ�·��д����ݿ⼴��

				UploadFiles uf = new UploadFiles();// �����ļ�
				uf.setUploadContentType(type);
				uf.setUploadFileName(fileName);
				uf.setUploadRealName(realName);

				uploadFiles.add(uf);// ��ӵ���Ҫ�����ļ���List������

				// uploadRealName[i]=UUID.randomUUID().toString();
				// System.out.println("uploadRealName:"+uploadRealName[i]);
				// for(File file:upload)
				// {
				// System.out.println("filename:"+file.getName());
				// }
				// System.out.println("filename:"+fileName);
				// System.out.println("Ext:"+getExt(fileName));
				// System.out.println("Type:"+type);
				// System.out.println(target.getPath());
			}
			ServletActionContext.getRequest().setAttribute("uploadFiles",
					uploadFiles);

		} catch (Exception e)
		{
			e.printStackTrace();
			addActionError(e.getMessage());

			return INPUT;
		}

		return SUCCESS;

	}

	public File[] getUpload()
	{
		return upload;
	}

	public void setUpload(File[] upload)
	{
		this.upload = upload;
	}

	public String[] getUploadContentType()
	{
		return uploadContentType;
	}

	public void setUploadContentType(String[] uploadContentType)
	{
		this.uploadContentType = uploadContentType;
	}

	public String[] getUploadFileName()
	{
		return uploadFileName;
	}

	public void setUploadFileName(String[] uploadFileName)
	{
		this.uploadFileName = uploadFileName;
	}

	public static String getExt(String fileName)
	{
		return fileName.substring(fileName.lastIndexOf("."));
	}

}
