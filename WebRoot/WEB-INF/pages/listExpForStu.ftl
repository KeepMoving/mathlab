<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>����ѡ��ʵ���б�</title>
</head>
<body>

  <table  width="768" height="222" border="1">
    <tr>
      <td colspan="8"><div align="center">����ѡ��ʵ��</div></td>
    </tr>
    <tr>
      <td width="96">ʵ����</td>
      <td width="96">ʵ������</td>
      <td width="96">�����γ�</td>
      <td width="96">�ο���ʦ</td>
      <td width="96">����</td>
      <td width="96">�ڴ�</td>
      <td width="96">��ϸ��Ϣ</td>
      <td width="96">����ʱ��</td>  
    </tr>
    
 <#if eList?exists>
     <#list eList as e>
      <tr>
      <td>${e.expID}</td>
      <td>${e.expName}</td>
      <td>${e.course}</td>
      <td>${e.teacher}</td>
      <td>${e.classRoom}</td>
      <td>${e.jieci}</td>      
      <td>${e.detail}</td> 
      <td>${e.date}</td>      
    </tr>
   </#list>
</#if>

    <tr>
      <td colspan="4">��ҳ ��һҳ ��һҳ ĩҳ </td>
    </tr>
  </table>

</body>
</html>