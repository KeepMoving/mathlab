<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>实验列表</title>
</head>
<body>

  <table  width="768" height="222" border="1">
    <tr>
      <td colspan="8"><div align="center">查看实验信息</div></td>
    </tr>
    <tr>
      <td width="96">实验编号</td>
      <td width="96">实验名称</td>
      <td width="96">所属课程</td>
      <td width="96">任课老师</td>
      <td width="96">教室</td>
      <td width="96">节次</td>
      <td width="96">详细信息</td>
      <td width="96">操作时间</td>  
    </tr>
    
 <#if eList?exists>
     <#list eList as e>
      <tr>
      <td>${e.expID}</td>
      <td>${e.expName}</td>
      <td>${e.course}</td>
      <td>${e.teacher}</td>
      <td>${e.classRoom}</td>
      <td>${e.jieci}</td>      
      <td>${e.detail}</td> 
      <td>${e.date}</td>      
    </tr>
   </#list>
</#if>

    <tr>
      <td colspan="4">首页 上一页 下一页 末页 </td>
    </tr>
  </table>

</body>
</html>
