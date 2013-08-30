<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>留言列表</title>
</head>
<body>

  <table  width="768" height="222" border="1">
    <tr>
      <td colspan="5"><div align="center">实验室系统留言版</div></td>
    </tr>
    <tr>
      <td width="80">楼号</td>
      <td width="408">留言内容</td>
      <td width="80">留言人</td>
      <td width="110">留言时间</td>
      <td width="45">回复</td>      
      <td width="45">删除</td>
    </tr>
    
 <#if nList?exists>
     <#list nList as p>
      <tr>
      <td>${p.id}</td>
      <td>${p.note}</td>
      <td>${p.userName}</td>      
      <td>${p.date}</td>
      <td><a href="preReplyNote.action?id=${p.id}">回复</a></td>
      <td><a href="deleteNote.action?id=${p.id}">删除</a></td>
    </tr>
   </#list>
</#if>

    <tr>
      <td colspan="4">首页 上一页 下一页 末页 </td>
    </tr>
  </table>

</body>
</html>
