<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/> 
    <title>添加实验信息</title>
  </head>
<body>

  <form action="addExp.action" method="post">
   <p>实验名：
  <input type="text" name="expName" value="" />
  </p>
  <p>教室：    
    <input type="text" name="classRoom" value=""/>
  </p>
  <p>实验时间：    
      <select name="jieci" id="jieci">    
        <option value="1">第一节</option>
        <option value="2">第二节</option>
        <option value="3">第三节</option>
        <option value="4">第四节</option>
        <option value="5">第五节</option>
        <option value="6">第六节</option>                                                                                
      </select>
  </p>
  <p>课程名称：
    <label>
      <select name="course" id="course">    
      <#if cList?exists>
      <#list cList as c>
        <option value="${c.courseID}">${c.courseName}</option>
      </#list>
      </#if>
      </select>
    </label>
  </p>
  <p>任课老师：
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
  <p>详述：    
    <input type="text" name="detail" value=""/>
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
