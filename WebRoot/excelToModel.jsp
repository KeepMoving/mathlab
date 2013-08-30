<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<title>excelToModel</title>

	</head>
	<body>

		<!--<h3><font color="red">上传文件类型后缀为doc,ppt,xls,pdf,txt,java，每个文件大小不能大于50M</font></h3>-->

		<table align="center" width="50%">
			<tr>
				<td>

					<!--		<s:actionerror cssStyle="color:red"/>-->
					<s:fielderror cssStyle="color:red" />

				</td>
			</tr>
		</table>
		
		<s:form action="excelToModel.action" theme="simple" method="post"
			enctype="multipart/form-data">

			<table align="center" width="50%" border="1">
				<tr>
					<td>
						选择将要导入的XLS文件
					</td>
					<td>
						<s:file name="excelToModel"></s:file>
					</td>
				</tr>
				<tr>
					<td>
						<s:submit value=" 确认 "></s:submit>
					</td>
					<td>
						<s:reset value=" 重置 "></s:reset>
					</td>
				</tr>

			</table>

		</s:form>

	</body>


</html>
