<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
	<head>
		<title>download</title>
	</head>
	<body>
		<%--	<s:iterator value="uploadFileName" id="downloadFileName">--%>
		<%--				<a href="download.action?name=<s:property value='%{#downloadFileName}'/>"><s:property value="%{#%{#downloadFileName}}" /> </a>--%>
		<%--				<br>--%>
		<%--	</s:iterator>--%>
		<table align="center" width="50%" border="1">
			<tr>
				<td align="center">
					文件下载
				</td>
			</tr>
			<c:forEach var="uploadFiles" items="${uploadFiles}">
				<tr>
					<td>
						<a
							href="download.action?name=${uploadFiles.uploadRealName }&realname=${uploadFiles.uploadFileName }">${uploadFiles.uploadFileName
							}</a>
					</td>
				</tr>

			</c:forEach>


		</table>
	</body>
</html>