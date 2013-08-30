package com.mathlab.action;

import java.io.File;
import java.io.FileInputStream;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

import com.mathlab.model.Student;
import com.mathlab.service.StuService;
import com.opensymphony.xwork2.ActionSupport;

public class ExcelToModelAction extends ActionSupport {
	private StuService stuService;	

	public StuService getStuService() {
		return stuService;
	}


	public void setStuService(StuService stuService) {
		this.stuService = stuService;
	}

	@Override
	public String execute() throws Exception {
		
 	    JFileChooser  jfc = new JFileChooser(); 
        jfc.setAcceptAllFileFilterUsed(false);//设置文件过滤条件，在文件选择中没有“所有文件”的选项   
        jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);//设置文件选择类型，在这里只是选择具体文件   
        jfc.setFileFilter(   
                new FileFilter(){   
                    public boolean accept(File f) {   
                        return f.getName().toLowerCase().endsWith(".xls");//添加过滤文件类型。以后缀做判断   
                    }   
                    public String getDescription() {   
                        return "Excel File";//在文件类型中的显示   
                    }   
                }   
        );   
        jfc.showOpenDialog(null);   
        String  filePath = jfc.getSelectedFile().getPath();//获取文件路径   
        System.out.println(filePath); 
 

        
        FileInputStream  fis = null;
        try {	
               //创建读取文件的流对象   
               fis = new FileInputStream(filePath);   
      
	            Workbook book = Workbook.getWorkbook(fis);
	            Sheet sheet = book.getSheet(0);        // 获得第一个工作表对象 
	            int rowCount = sheet.getRows();
	            
                Student stu = new Student();           
	            for(int i = 1; i < rowCount; i++){
	            	Cell[] cell = sheet.getRow(i);
	                if(cell.length == 0)
	                   break;
	                                
	                stu.setStuName(sheet.getCell(1, i).getContents());
	                stu.setStuPwd(sheet.getCell(2, i).getContents());
	                stu.setRealName(sheet.getCell(3, i).getContents());
	                stu.setStuNum(sheet.getCell(4, i).getContents());
	                stu.setGrade(sheet.getCell(5, i).getContents());
	                stu.setAuthority(sheet.getCell(6, i).getContents());
	                stuService.addStu(stu);
	                System.out.println("成功插入   "+sheet.getCell(1, i).getContents());	
	            }
        } catch (Exception e) {   
            e.printStackTrace();   
        }finally{   
               fis.close();   
        }   
		
		return "success";
	}
	

}
