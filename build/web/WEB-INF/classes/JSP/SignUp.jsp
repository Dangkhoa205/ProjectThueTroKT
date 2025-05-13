<%-- 
    Document   : SignUp
    Created on : May 1, 2025, 7:23:26 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Đăng kí</title>
        <link rel="stylesheet" href="css/style.css"/>
    </head>
    <body>
        <div class="form-login">
            <h1 style="text-align: center;">Đăng kí</h1>
            <form action="SignUp" method="POST">
                <label for="username">Nhập Tài Khoản</label>
                <input type="text" id="username" name="user" placeholder="Nhập tên tài khoản" required>

                <label for="password">Nhập Mật Khẩu</label>
                <input type="password" id="password" name="pass" placeholder="Nhập mật khẩu" required>

                <input type="submit" value="Đăng kí">

                <%
                String error = (String) request.getAttribute("error");
                if (error != null) {
                %>
                <p style="color: red; text-align: center;"><%= error %></p>
                <%
                    }
                %>

            </form>
        </div>
    </body>
</html>
