<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/> 
    <title>添加课程信息</title>
  </head>
<body>

  <form action="addStuAndCourse.action" method="post">
  <p>学生：
    <label>
      <select name="stuNum" id="stuNum">    
      <#if sList?exists>
      <#list sList as s>
        <option value="${s.realName}">${s.realName}</option>
      </#list>
      </#if>
      </select>
    </label>
  </p>
  
  <p>课程：
    <label>
      <select name="courseID" id="courseID">    
      <#if cList?exists>
      <#list cList as c>
        <option value="${c.courseID}">${c.courseName}</option>
      </#list>
      </#if>
      </select>
    </label>
  </p>
  <p>
      <input type="submit" value="提交"/>
    <label>
      <input type="reset" value="取消"/>
    </label>
  </p>
  </form>
 
</body>
</html>
