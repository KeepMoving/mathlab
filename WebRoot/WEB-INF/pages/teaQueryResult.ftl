<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>查得教师列表</title>
</head>
<body>

  <table  width="768" height="222" border="1">
    <tr>
      <td colspan="6"><div align="center">查得教师列表</div></td>
    </tr>
    <tr>
      <td width="128">教师编号</td>
      <td width="128">教师名称</td>
      <td width="128">教师登录权限</td>      
      <td width="128">编辑权限</td>
    </tr>
    
 <#if teaList?exists>
     <#list teaList as t>
      <tr>
      <td>${t.teaID}</td>
      <td>${t.teaName}</td>
      <td>${t.authority}</td>
      <td><a href="preEditTea.action?id=${t.teaID}">编辑权限</a></td>      
    </tr>
   </#list>
</#if>

    <tr>
      <td colspan="4">首页 上一页 下一页 末页 </td>
    </tr>
  </table>

</body>
</html>