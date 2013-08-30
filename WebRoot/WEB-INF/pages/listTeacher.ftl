<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>教师信息列表</title>
</head>
<body>

  <table  width="768" height="222" border="1">
    <tr>
      <td colspan="6"><div align="center">教师信息</div></td>
    </tr>
    <tr>
      <td width="128">教师编号</td>
      <td width="128">教师名称</td>
      <td width="128">教师密码</td>
      <td width="128">教师登录权限</td>      
      <td width="128">删除</td>
      <td width="128">编辑</td>
    </tr>
    
 <#if tList?exists>
     <#list tList as t>
      <tr>
      <td>${t.teaID}</td>
      <td>${t.teaName}</td>
      <td>${t.teaPwd}</td>
      <td>${t.authority}</td>
      <td><a href="deleteTea.action?id=${t.teaID}">删除</a></td>
      <td><a href="preEditTea.action?id=${t.teaID}">编辑</a></td>      
    </tr>
   </#list>
</#if>

    <tr>
      <td colspan="4">首页 上一页 下一页 末页 </td>
    </tr>
  </table>

</body>
</html>
