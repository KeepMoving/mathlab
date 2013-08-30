<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/> 
    <title>添加留言</title>
  </head>
 
  <body>
  回复${id}楼：${noteModel.note}<br>
  <form action="replyNote.action" method="post">
  <p>用户名：
  <input type="text" name="userName" value="" /><br>
  </p>
  <p>内容：    
  <textarea name="note" cols="30" rows="6"></textarea>
  </p>
  <p>
      <input type="submit" value="提交"/>
    <label>
      <input type="reset" value="取消">
    </label>
  </p>
  <input type="hidden" name="id"  value="${noteModel.id}"/>
  <p>&nbsp;</p>
  </form>
  </body>
</html>