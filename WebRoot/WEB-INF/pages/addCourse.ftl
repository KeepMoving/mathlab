<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/> 
    <title>添加课程信息</title>
  </head>
<body>

  <form action="addCourse.action" method="post">
   <p>班级名称：
  <input type="text" name="courseName" value="" />
  </p>
  <p>教室：    
    <input type="text" name="classRoom" value=""/>
  </p>
    <p>详述：    
    <input type="text" name="detail" value=""/>
  </p>
  <p>任课教师：
    <label>
      <select name="teacher" id="teacher">    
      <#if tList?exists>
      <#list tList as t>
        <option value="${t.teaName}">${t.teaName}</option>
      </#list>
      </#if>
      </select>
    </label>
  </p>
  <p>
    <input type="submit" value="提交"/>
    <label>
      <input type="reset" value="取消">
    </label>
  </p>
  </form>
 
</body>
</html>
