<%@ page language="java" contentType="text/html; charset=gb2312"%>
<html>
<head>
<title>Magic Square in an HTML Table</title>
</head>

<body bgcolor="#FFFFFF">
<p><font color="#000000" size="4" face="Arial"><i><img
src="icons/mathby.gif" width="99" height="123"></i></font></p>

<div align="center">
<strong>Magic Square in an HTML</strong>
<%
	int arraySize = Integer.parseInt(session.getAttribute("arraySizeTemp").toString());
	String data = session.getAttribute("arrayDataTemp").toString();
	String subArg[] = data.split(" "); 
	int arrayLength = subArg.length;
%>
<p>得到一个<%=arraySize %> X <%=arraySize %>矩阵：<br></p>
<p>得到字符串为<%=data %><br></p>
<p>转化为矩阵为:<br></p>
<script type="text/javascript">
 var dataTemp = "悲剧了吧";
 for(int x=0;x<arrayLength;x++)
 {
    document.write(dataTemp)；
 }   
</script>
</body>
</html>
