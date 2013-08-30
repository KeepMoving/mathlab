<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/> 
    <title>编辑学生信息</title>
  </head>
  <body>
 
  <form action="editStu.action" method="post">
  <p>学生姓名（只读）：
  <input type="text" name="realName" value="${stu.realName}" readOnly="true"/>
  </p>
  <p>学生学号（只读）：
  <input type="text" name="stuNum" value="${stu.stuNum}" readOnly="true"/>
  </p>
  <p>学生班级：    
  <input type="text" name="grade" value="${stu.grade}" />
  </p>
  <p>登录权限：    
  <input type="text" name="authority" value="${stu.authority}" />
  </p>
  <p>
    <input type="submit" value="提交"/>
    <label>
      <input type="reset" value="取消">
    </label>
  </p>
  <input type="hidden" name="id"  value="${stu.stuID}"/>
  <input type="hidden" name="stuName" value="${stu.stuName}"/> 
  <input type="hidden" name="stuPwd" value="${stu.stuPwd}"/>
  <p>&nbsp;</p>
  </form>
  </body>
</html>