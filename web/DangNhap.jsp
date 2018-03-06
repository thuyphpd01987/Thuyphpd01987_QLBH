<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Đăng nhập</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
  <h2>Nhập thông tin đăng nhập</h2>
  <form class="form-horizontal" action="DangNhap" method="post">
    <div class="form-group">
      <label class="control-label col-sm-2" for="email">Tài khoản:</label>
      <div class="col-sm-10">
        <input type="text" class="form-control" id="email" name="username" placeholder="ví dụ: admin">
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-2" for="pwd">Mật khẩu:</label>
      <div class="col-sm-10">          
        <input type="password" class="form-control" id="pwd" name="pass" placeholder="Nhập mật khẩu : abcd">
      </div>
    </div>
    <div class="form-group">
<!--      <label class="control-label col-sm-2" for="pwd">Tên</label>
      <div class="col-sm-10">          
        <input type="text" class="form-control" id="pwd" name="name" placeholder="Nhập tên của bạn...">
      </div>-->
    </div>
    <p><%
    	ServletContext context = getServletContext();
    		  String er =(String) context.getAttribute("error");
    		  if(er !=null){
    			  out.print(er);
    		  }
    %></p>
    <div class="form-group">        
      <div class="col-sm-offset-2 col-sm-10">
        <button type="submit" class="btn btn-default">Đăng nhập</button>
      </div>
    </div>
  </form>
</div>

</body>
</html>
