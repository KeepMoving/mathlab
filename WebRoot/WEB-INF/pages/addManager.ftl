<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/> 
    <title>添加管理员信息</title>
  </head>
<body>

  <form action="addManager.action" method="post">
   <p>管理员姓名：
  <input type="text" name="manName" value="" />
  </p>
  <p>登录密码：    
    <input type="text" name="manPwd" value=""/>
  </p>
  <p>权限分配：
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
