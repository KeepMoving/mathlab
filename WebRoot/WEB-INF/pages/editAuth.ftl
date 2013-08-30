<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/> 
    <title>编辑用户组</title>
  </head>
  <body>
 
  <form action="editAuth.action" method="post">
  <p>当前权限编号是：
  <input name="id" type="text" value="${auth.id}" readOnly="true"></input>
  </p>
  <p>新权限名：
  <input type="text" name="authName" value="" />
  </p>
  <p>新权限详述：    
    <input type="text" name="detail" value=""/>
  </p>
  <p>
    <input type="submit" value="提交"/>
    <label>
      <input type="reset" value="取消">
    </label>
  </p>
  <p>&nbsp;</p>
  </form>
  </body>
</html>