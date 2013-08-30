<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<title>upload</title>

	</head>
	<%----%>
	<%--	<body>--%>
	<%----%>
	<%--		<s:actionerror />--%>
	<%--		<s:fielderror />--%>
	<%--		<s:form action="upload.action" method="POST" enctype="multipart/form-data">--%>
	<%--			<tr>--%>
	<%--				<td colspan="2">--%>
	<%--					<h1>--%>
	<%--						文件上传示例--%>
	<%--					</h1>--%>
	<%--				</td>--%>
	<%--			</tr>--%>
	<%--			<s:file name="upload" label="上传文件"/>--%>
	<%--			<s:file name="upload" label="上传文件"/>--%>
	<%--			<s:submit value="上   传" />--%>
	<%--		</s:form>--%>
	<%--	</body>--%>

	<body>

		<script type="text/javascript">

<!--addMore函数可以提供上传多个文件上传-->

function addMore()
{

	var td = document.getElementById("more");
	
	var br = document.createElement("br");
	var input = document.createElement("input");
	var button = document.createElement("input");
	
	input.type = "file";
	input.name = "upload";
	
	button.type = "button";
	button.value = "   删除    ";
	
	button.onclick = function()
	{
		td.removeChild(br);
		td.removeChild(input);
		td.removeChild(button);
	}
	
	td.appendChild(br);
	td.appendChild(input);
	td.appendChild(button);
}

</script>

		<!--<h3><font color="red">上传文件类型后缀为doc,ppt,xls,pdf,txt,java，每个文件大小不能大于50M</font></h3>-->

		<table align="center" width="50%">
			<tr>
				<td>

					<!--		<s:actionerror cssStyle="color:red"/>-->
					<s:fielderror cssStyle="color:red" />

				</td>
			</tr>
		</table>
		
		<s:form action="upload.action" theme="simple" method="post"
			enctype="multipart/form-data">

			<table align="center" width="50%" border="1">
				<tr>
					<td>
						上传文件
					</td>
					<td id="more" >
						<s:file name="upload"></s:file>
						<input type="button" value="上传更多..." onclick="addMore()">
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
