<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>学生列表</title>
</head>
<body>

  <table  width="768" height="222" border="1">
    <tr>
      <td colspan="9"><div align="center">权限信息</div></td>
    </tr>
    <tr>
      <td width="64">编号</td>
      <td width="64">用户名</td>
      <td width="112">登录密码</td>
      <td width="112">学生姓名</td>
      <td width="112">学号</td>
      <td width="112">所属班级</td>
      <td width="64">权限</td>
      <td width="64">删除</td>
      <td width="64">编辑</td>
    </tr>
    
 <#if sList?exists>
     <#list sList as s>
      <tr>
      <td>${s.stuID}</td>
      <td>${s.stuName}</td>
      <td>${s.stuPwd}</td>
      <td>${s.realName}</td>
      <td>${s.stuNum}</td>
      <td>${s.grade}</td>
      <td>${s.authority}</td>
      <td><a href="deleteStu.action?id=${s.stuID}">删除</a></td>
      <td><a href="preEditStu.action?id=${s.stuID}">编辑</a></td>      
    </tr>
   </#list>
</#if>

    <tr>
      <td colspan="4">首页 上一页 下一页 末页 </td>
    </tr>
  </table>

</body>
</html>
