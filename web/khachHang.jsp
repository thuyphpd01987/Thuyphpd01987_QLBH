<%-- 
    Document   : khachHang
    Created on : Mar 1, 2018, 7:02:27 AM
    Author     : Mai Ly
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css" integrity="sha384-rwoIResjU2yc3z8GV/NPeZWAv56rSmLldC3R/AZzGRnGxQQKnKkoFVhFQhNUwEyJ" crossorigin="anonymous">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/js/bootstrap.min.js" integrity="sha384-vBWWzlZJ8ea9aCX4pEW3rVHjgjt7zpkNpZk+02D9phzyeVkE+jo0ieGizqPLForn" crossorigin="anonymous"></script>
        <title>JSP Page</title>
    </head>
    <body>
           <div class="container">
                    <form action="khachhangSeverlet">
                        <div class="form-group">
                            <label for="exampleInputEmail1">Họ</label>
                            <input type="text" name="fistname" required="" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter fist name">                    
                        </div>
                        <div class="form-group">
                            <label for="exampleInputEmail1">Tên</label>
                            <input type="text" min="0" name="lastname"required="" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter last name">                  
                        </div>          
                        <div class="form-group">
                            <label for="exampleInputEmail1">Họ và tên</label>
                            <input type="text" min="0" name="fullname"required="" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter full name">                  
                        </div> 
                        <div class="form-group">
                            <label for="exampleInputEmail1">Giới tính</label><br>
                            <input type="radio" name="sex" value="true"> Nam<br>
                            <input type="radio" name="sex" value="false" checked> Nữ<br>
                        </div> 
                        <div class="form-group">
                            <label for="exampleInputEmail1">Số điện thoại</label>
                            <input type="number" min="0" name="phone"required="" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter phone">                  
                        </div> 
                        <div class="form-group">
                            <label for="exampleInputEmail1">Gmail</label>
                            <input type="text" min="0" name="gmail"required="" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter gmail">                  
                        </div> 
                        <div class="form-group">
                            <label for="exampleInputEmail1">Địa chỉ</label>
                            <input type="text" min="0" name="address"required="" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter address">                  
                        </div> 
                        <button type="submit" name="action" value="add" class="btn btn-primary">Submit</button>
                    </form>
                </div>
    </body>
</html>
