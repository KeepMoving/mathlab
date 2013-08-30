package com.mathlab.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.mathlab.util.UploadConfigurationRead;
import com.opensymphony.xwork2.ActionSupport;

public class DisplayFilesAction extends ActionSupport {
	private List<String> fileList;
	private String targetDirectory;
	public List<String> getFileList() {
		return fileList;
	}
	public void setFileList(List<String> fileList) {
		this.fileList = fileList;
	}
	public String getTargetDirectory() {
		return targetDirectory;
	}
	public void setTargetDirectory(String targetDirectory) {
		this.targetDirectory = targetDirectory;
	}
	@Override
	public String execute() throws Exception {
		targetDirectory = ServletActionContext.getServletContext().getRealPath("/"+ UploadConfigurationRead.getInstance().getConfigItem("uploadFilePath").trim());
		System.out.println(targetDirectory);
		fileList = UploadConfigurationRead.getInstance().getAllFiles(targetDirectory);
		for(String s: fileList){ 
			System.out.println("寰楀埌鏂囦欢锛�   "+s);    
		}
		return "success";
	}
	
}
