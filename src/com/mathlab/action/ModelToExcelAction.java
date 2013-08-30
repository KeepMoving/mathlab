package com.mathlab.action;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;

import jxl.Workbook;
import jxl.format.Alignment;
import jxl.format.Colour;
import jxl.format.UnderlineStyle;
import jxl.format.VerticalAlignment;
import jxl.write.Label;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

import com.mathlab.model.Student;
import com.mathlab.service.StuService;
import com.opensymphony.xwork2.ActionSupport;

public class ModelToExcelAction extends ActionSupport {

	StuService stuService;
	
	public StuService getStuService() {
		return stuService;
	}

	public void setStuService(StuService stuService) {
		this.stuService = stuService;
	}

	@Override
	public String execute() throws Exception {
 	   JFileChooser jfc = new JFileChooser(); 
       jfc.setAcceptAllFileFilterUsed(false);   
       jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);//只是针对文件夹有效   
       jfc.setFileFilter(   
               new FileFilter(){   
                   public boolean accept(File f) {   
                       // TODO Auto-generated method stub   
                       return f.getName().toLowerCase().endsWith(".xls");   
                   }   
                   public String getDescription() {   
                       // TODO Auto-generated method stub   
                       return "Excel File";   
                   }   
               }   
       );   
       jfc.showSaveDialog(null);   
       String filePath = jfc.getSelectedFile().getPath();   
       System.out.println(filePath);   
   
           
       WritableWorkbook wwb;
       FileOutputStream fos;
       try{
           fos = new FileOutputStream(filePath+"\\"+"学生名单"+".xls");
           wwb = Workbook.createWorkbook(fos);
           WritableSheet ws = wwb.createSheet("sheet1", 0);        // 创建一个工作表

           //    设置单元格的文字格式
           WritableFont wf = new WritableFont(WritableFont.ARIAL,12,WritableFont.NO_BOLD,false,
                   UnderlineStyle.NO_UNDERLINE,Colour.BLUE);
           WritableCellFormat wcf = new WritableCellFormat(wf);
           wcf.setVerticalAlignment(VerticalAlignment.CENTRE); 
           wcf.setAlignment(Alignment.CENTRE); 
           ws.setRowView(1, 500);

           ws.addCell(new Label(0, 0, "记录编号",wcf));                  
           ws.addCell(new Label(1, 0, "用户名", wcf));
           ws.addCell(new Label(2, 0, "用户密码", wcf));
           ws.addCell(new Label(3, 0, "学生姓名", wcf));
           ws.addCell(new Label(4, 0, "学号", wcf));
           ws.addCell(new Label(5, 0, "所属班级", wcf));
           ws.addCell(new Label(6, 0, "权限", wcf));
           
           //填充数据的内容
           Student[] stu = new Student[stuService.listStu().size()];
           for (int i = 0; i < stuService.listStu().size(); i++){
        	   stu[i] = (Student)stuService.listStu().get(i);
        	   
               ws.addCell(new Label(0, i + 1, stu[i].getStuID().toString()));    
               System.out.println(stu[i].getStuID().toString());
               
               ws.addCell(new Label(1, i + 1, stu[i].getStuName()));
               ws.addCell(new Label(2, i + 1, stu[i].getStuPwd()));
               ws.addCell(new Label(3, i + 1, stu[i].getRealName()));
               ws.addCell(new Label(4, i + 1, stu[i].getStuNum()));
               ws.addCell(new Label(5, i + 1, stu[i].getGrade()));
               ws.addCell(new Label(6, i + 1, stu[i].getAuthority()));
               if(i == 0)
                   wcf = new WritableCellFormat();
           }

           wwb.write();
           wwb.close();
       } catch (IOException e){
       } catch (RowsExceededException e){
       } catch (WriteException e){} 
           
   
		return "success";
	}
	
}
