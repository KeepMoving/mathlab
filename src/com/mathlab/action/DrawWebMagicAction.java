package com.mathlab.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import magicsquare.magic;

import com.mathworks.toolbox.javabuilder.MWArray;
import com.mathworks.toolbox.javabuilder.MWClassID;
import com.mathworks.toolbox.javabuilder.MWNumericArray;
import com.opensymphony.xwork2.ActionSupport;

public class DrawWebMagicAction extends ActionSupport {

	private String argValue;
	private String arrayData;

	public String getArgValue() {
		return argValue;
	}

	public void setArgValue(String argValue) {
		this.argValue = argValue;
	}

	public String getArrayData() {
		return arrayData;
	}

	public void setArrayData(String arrayData) {
		this.arrayData = arrayData;
	}

	@Override
	public String execute() throws Exception {
	      MWNumericArray n = null;   
	  	  Object[] result = null;  
	      magic theMagic = null;  
	      List dataList = new ArrayList();
	      
		  HttpServletRequest request = ServletActionContext.getRequest(); 
		  //HttpServletResponse response = ServletActionContext.getResponse(); 
		  HttpSession session = request.getSession();

	      try
	      {
	         System.out.println("argValue=  "+argValue);         
	         n = new MWNumericArray(Double.valueOf(argValue),MWClassID.DOUBLE);
	         System.out.println("Magic square of order " + n.toString());
	         int size = Double.valueOf(argValue).intValue();
	         theMagic = new magic();
	         
	         result = theMagic.makesqr(1, n);	         
	         System.out.println("得到一个"+size+"X"+size+"的矩阵");
	         System.out.println(result[0]);
	         
	         arrayData = result[0].toString();
	         
	         String subArg[] = arrayData.split(" "); 
	         System.out.println(subArg[1]);
	         session.setAttribute("arraySizeTemp",argValue);
	         session.setAttribute("arrayDataTemp",arrayData);
 /*	         int length = result[0].toString().length();
	         String subArg[] = arrayData.split(" "); 
	         length = subArg.length;
	         System.out.println("数组元素有"+length+"个!");
	         for(int i=0;i<length;i++)   
	         {
	        	 dataList.add(Integer.parseInt(subArg[i]));
	         }*/
	         
	      }
	      catch (Exception e)
	      {
	         System.out.println("Exception: " + e.toString());
	      }	   
	      finally
	      { 
	         MWArray.disposeArray(n);
	         MWArray.disposeArray(result);
	         if (theMagic != null)
	            theMagic.dispose();
	      }	  
		  return "success";
	}

}
