<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/> 
    <title>添加学生信息</title>
  </head>
<body>

  <form action="addStu.action" method="post">
   <p>用户名：
  <input type="text" name="stuName" value="" />
  </p>
  <p>登录密码：    
    <input type="password" name="stuPwd" value=""/>
  </p>
  <p>真实姓名：    
    <input type="text" name="realName" value=""/>
  </p>
  <p>学号：    
    <input type="text" name="stuNum" value=""/>
  </p>
  <p>班级：
    <label>
      <select name="grade" id="grade">    
      <#if gList?exists>
      <#list gList as g>
        <option value="${g.graName}">${g.graName}</option>
      </#list>
      </#if>
      </select>
    </label>
  </p>
  <p>权限等级：
    <label>
      <select name="authority" id="authority">    
      <#if aList?exists>
      <#list aList as a>
        <option value="${a.detail}">${a.detail}</option>
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
