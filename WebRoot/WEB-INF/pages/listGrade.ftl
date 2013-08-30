<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>教学班列表</title>
</head>
<body>

  <table  width="*" height="222" border="1">
    <tr>
      <td colspan="9"><div align="center">权限信息</div></td>
    </tr>
    <tr>
      <td width="64">记录编号</td>
      <td width="64">班级名称</td>
      <td width="112">所属学院</td>
      <td width="112">备注</td>
    </tr>
    
 <#if gList?exists>
     <#list gList as g>
      <tr>
      <td>${g.graID}</td>
      <td>${g.graName}</td>
      <td>${g.school}</td>
      <td>${g.detail}</td>    
    </tr>
   </#list>
</#if>

    <tr>
      <td colspan="4">首页 上一页 下一页 末页 </td>
    </tr>
  </table>

</body>
</html>
