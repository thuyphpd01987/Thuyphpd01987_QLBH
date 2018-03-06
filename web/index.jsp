<%@page import="dao.KhachHangDAO"%>
<%@page import="dao.GioHangDAO"%>
<%@page import="model.SanPham"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.KhachHang"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Demo đăng nhập</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <style type="text/css">

            .khungsanpham{
                padding-top: 20px;
                padding-left: 30px;
                float: left;
            }
            .boder{
                border: solid;
                width: 200px;
                height: 270px;
            }
            .img{
                margin-left: 3px;
                margin-top: 3px;
                width: 192px;
                height: 180px;
            }
            .gia{
                text-align: center;
                color: red;
                margin-top: 10px;
                margin-bottom: 10px;
            }
            .mua{
                color: red;
            }
        </style>
    </head>
    <body>

        <nav class="navbar navbar-inverse">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a class="navbar-brand" href="#">Xin chào</a>
                </div>
                <ul class="nav navbar-nav">
                    <li class="active"><a href="#">Trang chủ</a></li>
                    <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Page 1 <span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <li><a href="#">Page 1-1</a></li>
                            <li><a href="#">Page 1-2</a></li>
                            <li><a href="#">Page 1-3</a></li>
                        </ul>
                    </li>
                    <li><a href="#">Page 2</a></li>
                </ul>
                <ul class="nav navbar-nav navbar-right">
                    <li><a href="DangKy.jsp"><span class="glyphicon glyphicon-user"></span> Đăng kí</a></li>
                    <li><a href="DangNhap.jsp"><span class="glyphicon glyphicon-log-in"></span> Đăng nhập</a></li>
                    <li><a href="DangXuat"><span class="glyphicon glyphicon-user"></span> Đăng xuất</a></li>
                    <li><a href="insert.jsp"><span class="glyphicon glyphicon-user"></span> Thêm sản phẩm</a></li>
                    <li><a href="khachhang.jsp"><span class="glyphicon glyphicon-user"></span> Thêm khách hàng</a></li>
                    
                </ul>
            </div>
        </nav>

        <div class="container">

            <a href="GioHang.jsp"><button type="button" class="btn btn-danger" aria-label="Right Align">
                    <span class="glyphicon glyphicon-cart" aria-hidden="true"></span>Xem giỏ hàng
                </button></a>
            <h3>Các sản phẩm hiện có</h3>
            <%ArrayList<SanPham> dsSanPham = new GioHangDAO().get_ALL();%>
            <%	for (int i = 0; i < dsSanPham.size(); i++) {%>
            <div class="khungsanpham">
                <div class="boder">
                    <div class="img">
                        <img src="<%=dsSanPham.get(i).getHinhAnh()%>" width="192px" height="180px">
                    </div>
                    <div class="gia">
                        <%=dsSanPham.get(i).getGiaSanPham()%>
                    </div>
                    <div class="mua">
                        <center><a href="XuLyMuaSanPham?maSanPham=<%=dsSanPham.get(i).getMaSanPham()%>"><button class="btn btn-success">Mua ngay</button></a></center>
                    </div>
                </div>
            </div>
            <%}%>
        </div>
        <div style="padding-left:100px;padding-top:15px;">
            <a href="DangXuat"><button type="button" class="btn btn-danger" aria-label="Right Align">
                    <span class="glyphicon glyphicon-user" aria-hidden="true"></span>Đăng xuất
                </button></a>

        </div>
            <jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>
