<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
	<title>下载</title>
	</head>
	<body>

  <table  width="768" height="222" border="1">
    <tr>
      <td colspan="4"><div align="center">下载文件列表</div></td>
    </tr>
	<#if fileList?exists>
     <#list fileList as f>
      <tr>
      	<a href="download.action?name=${f}&realname=${f}">${f}</a>         
      </tr>
     </#list>
   </#if>
		</table>
	</body>
</html>