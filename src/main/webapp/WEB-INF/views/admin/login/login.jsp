<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="spring"%>

<link href="http://localhost:8080/i8-web/resources/adminassets/css/bootstrap/bootstrap.min.css" rel="stylesheet" type="text/css"/>
<link href="http://localhost:8080/i8-web/resources/adminassets/css/bootstrap/bootstrap-theme.min.css" rel="stylesheet" type="text/css"/>
<link href="http://localhost:8080/i8-web/resources/adminassets/reset.css" rel="stylesheet" type="text/css"/>
<link href="http://localhost:8080/i8-web/resources/adminassets/css/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css"/>
<script src="http://localhost:8080/i8-web/resources/adminassets/js/jquery-2.2.4.min.js" type="text/javascript"></script>
<script src="http://localhost:8080/i8-web/resources/adminassets/js/bootstrap/bootstrap.min.js" type="text/javascript"></script>
<script src="http://localhost:8080/i8-web/resources/adminassets/js/plugins/ckeditor/ckeditor.js" type="text/javascript"></script>
<script src="http://localhost:8080/i8-web/resources/adminassets/js/main.js" type="text/javascript"></script>
<link href="http://localhost:8080/i8-web/resources/adminassets/css/import/login.css" rel="stylesheet">

<div class="wrapper fadeInDown">
  <div id="formContent">
    <!-- Tabs Titles -->

    <!-- Icon -->
    <div class="fadeIn first">
      <img src="http://danielzawadzki.com/codepen/01/icon.svg" id="icon" alt="User Icon" />
    </div>

    <!-- Login Form -->
    <form action="../checkLogin" method="post">
      <input type="text" id="login" class="fadeIn second" name="username" placeholder="login">
      <input type="text" id="password" class="fadeIn third" name="password" placeholder="password">
      <input type="submit" class="fadeIn fourth" value="Log In">
    </form>

    <!-- Remind Passowrd -->
    <div id="formFooter">
      <a class="underlineHover" href="#">Forgot Password?</a>
    </div>

  </div>
</div>