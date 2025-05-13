<%-- 
    Document   : login
    Created on : Apr 28, 2025, 1:37:11 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Dang nhap ThueTroDeDang</title>
        <link rel="stylesheet" href="css/style.css"/>
    </head>
    <body>
        <div class="form-login">
        <h1 style="text-align: center;">Login</h1>
        <form action="login" method="POST">
            <label for="username">Nhập Tài Khoản</label>
            <input type="text" id="username" name="user" placeholder="Nhập tên tài khoản" required>

            <label for="password">Nhập Mật Khẩu</label>
            <input type="password" id="password" name="pass" placeholder="Nhập mật khẩu" required>

            <input type="submit" value="Đăng Nhập">
        </form>
        </div>
    </body>
</html>
