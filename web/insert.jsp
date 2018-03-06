<%-- 
    Document   : insert
    Created on : Oct 26, 2017, 1:52:12 AM
    Author     : Mai Ly
--%>


<%@page import="dao.addSanPham"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
      <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </head>
    <body>
        
        <nav class="navbar navbar-inverse">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a class="navbar-brand" href="#">Xin chào</a>
                </div>
                <ul class="nav navbar-nav">
                    <li class="active"><a href="index.jsp">Trang chủ</a></li>
                 
                   
                </ul>
                <ul class="nav navbar-nav navbar-right">
                    
                    <li><a href="DangXuat"><span class="glyphicon glyphicon-user"></span> Đăng xuất</a></li>
                   
                    <li><a href="DangXuat"><span class="glyphicon glyphicon-user"></span> Thêm người dùng</a></li>
                </ul>
            </div>
        </nav>

        <div class="container">
            
            <form action="themSanPham">
<div class="form-group">
<label >Mã sản phẩm</label>
<input type="text" class="form-control" placeholder="Enter ID" name="maSanPham">
</div>
<div class="form-group">
<label for="pwd">Tên sản phẩm</label>
<input type="text" class="form-control" placeholder="Enter name" name="tenSanPham">
</div>
<div class="form-group">
<label for="pwd">Giá</label>
<input type="number" class="form-control" placeholder="Enter price" name="giaSanPham">
</div>
<div class="form-group">
<label for="pwd">Hình ảnh</label>
<input type="text" class="form-control" name="hinhAnh">
</div>
                <div class="form-group">
<label for="pwd">Số lượng</label>
<input type="text" class="form-control" name="soLuong">
</div>

<button type="submit" class="btn btn-default" name="action" value="add">Add</button>
<button type="submit" class="btn btn-default">Update</button>
</form>
    </div>
        <% addSanPham ad=new addSanPham();
        int count=0;
        %>
        <div class="container">
         <table class="table table-bordered">
                <thead>
                    <tr>
                        <th><%=count %></th>
                        <th>Mã sản phẩm</th>
                        <th>Tên sản phẩm</th>
                        <th>Hình ảnh</th>
                        <th>Giá</th> 
                        <th>Số lượng</th>
                        <th>Action</th>
                    </tr>
                </thead>
                <tbody>
                    <% for (int i = 0; i < ad.get_ALL().size(); i++) {
                                count++; 
                        
                    %>    
                    <tr>
                        <td><%=count %></td>                        
                        <td><%=ad.get_ALL().get(i).getMaSanPham()%></td>
                        <td><%=ad.get_ALL().get(i).getTenSanPham()%></td>
                        <td><%=ad.get_ALL().get(i).getHinhAnh()%></td>
                        <td><%=ad.get_ALL().get(i).getGiaSanPham()%></td>
                        <td><%=ad.get_ALL().get(i).getSoLuongMua()%></td>
     
                        <td>
                            <a href="themSanPham?action=delete&&maSanPham=<%=ad.get_ALL().get(i).getMaSanPham()%>">del</a>|
                            <a href="">edit</a>
                        </td>
                    </tr>
               <% }%>
                </tbody>.
            </table>
    </div>
    </body>
</html>
