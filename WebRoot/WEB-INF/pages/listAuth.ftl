<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>权限列表</title>
</head>
<body>

  <table  width="768" height="222" border="1">
    <tr>
      <td colspan="4"><div align="center">权限信息</div></td>
    </tr>
    <tr>
      <td width="192">权限编号</td>
      <td width="192">权限名称</td>
      <td width="192">权限级划分</td>
      <td width="96">删除</td>
      <td width="96">编辑</td>
    </tr>
    
 <#if pList?exists>
     <#list pList as p>
      <tr>
      <td>${p.id}</td>
      <td>${p.authName}</td>
      <td>${p.detail}</td>
      <td><a href="deleteAuth.action?id=${p.id}">删除</a></td>
      <td><a href="preEditAuth.action?id=${p.id}">编辑</a></td>      
    </tr>
   </#list>
</#if>

    <tr>
      <td colspan="4">首页 上一页 下一页 末页 </td>
    </tr>
  </table>

</body>
</html>
