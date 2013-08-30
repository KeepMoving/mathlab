<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/> 
    <title>编辑学生信息</title>
  </head>
  <body>
 
  <form action="editTea.action" method="post">
  <p>教师姓名（可修改）：
  <input type="text" name="realName" value="${tea.teaName}" readOnly="true"/>
  </p>
  <p>教师学号（可修改）：
  <input type="text" name="stuNum" value="${tea.teaPwd}" readOnly="true"/>
  </p>
  <p>
      <input type="submit" value="提交"/>
    <label>
      <input type="reset" value="取消"/>
    </label>
  </p>
  <input type="hidden" name="authority"  value="${tea.authority}"/>
  <input type="hidden" name="teaID" value="${tea.teaID}"/> 
  <p>&nbsp;</p>
  </form>
  </body>
</html>