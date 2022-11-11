<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <title>ISMART</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="http://localhost:8080/i8-web/resources/adminassets/css/bootstrap/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="http://localhost:8080/i8-web/resources/adminassets/css/bootstrap/bootstrap-theme.min.css" rel="stylesheet" type="text/css"/>
        <link href="http://localhost:8080/i8-web/resources/adminassets/reset.css" rel="stylesheet" type="text/css"/>
        <link href="http://localhost:8080/i8-web/resources/adminassets/css/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css"/>
        <link href="public/responsive.css" rel="stylesheet" type="text/css"/>
        <link href="http://localhost:8080/i8-web/resources/adminassets/css/import/fonts.css" rel="stylesheet">
        <link href="http://localhost:8080/i8-web/resources/adminassets/css/import/global.css" rel="stylesheet">
        <link href="http://localhost:8080/i8-web/resources/adminassets/css/import/list_post.css" rel="stylesheet">
        <link href="http://localhost:8080/i8-web/resources/adminassets/css/import/list_product.css" rel="stylesheet">
        <link href="http://localhost:8080/i8-web/resources/adminassets/css/import/add_cat.css" rel="stylesheet">
        <link href="http://localhost:8080/i8-web/resources/adminassets/css/import/info_account.css" rel="stylesheet">
        <link href="http://localhost:8080/i8-web/resources/adminassets/css/import/change_pass.css" rel="stylesheet">
        <link href="http://localhost:8080/i8-web/resources/adminassets/css/import/sidebar.css" rel="stylesheet">
        <link href="http://localhost:8080/i8-web/resources/adminassets/css/import/menu.css" rel="stylesheet">
        <link href="http://localhost:8080/i8-web/resources/adminassets/css/import/detail_order.css" rel="stylesheet">

        <script src="http://localhost:8080/i8-web/resources/adminassets/js/jquery-2.2.4.min.js" type="text/javascript"></script>
        <script src="http://localhost:8080/i8-web/resources/adminassets/js/bootstrap/bootstrap.min.js" type="text/javascript"></script>
        <script src="http://localhost:8080/i8-web/resources/adminassets/js/plugins/ckeditor/ckeditor.js" type="text/javascript"></script>
        <script src="http://localhost:8080/i8-web/resources/adminassets/js/main.js" type="text/javascript"></script>
    </head>
    <body>
        <div id="site">
            <div id="container">
                <div id="header-wp">
                    <div class="wp-inner clearfix">
                        <a href="?page=list_post" title="" id="logo" class="fl-left">ADMIN</a>
                        <ul id="main-menu" class="fl-left">
                            <li>
                                <a href="/i8-web/admin/post/list" title="">Bài viết</a>
                                <ul class="sub-menu">
                                    <li>
                                        <a href="/i8-web/admin/post/create" title="">Thêm mới</a> 
                                    </li>
                                    <li>
                                        <a href="/i8-web/admin/post/list" title="">Danh sách bài viết</a> 
                                    </li>
                                    <li>
                                        <a href="/i8-web/admin/post/category/list" title="">Danh mục bài viết</a> 
                                    </li>
                                </ul>
                            </li>
                            <li>
                                <a href="/i8-web/admin/product/list" title="">Sản phẩm</a>
                                <ul class="sub-menu">
                                    <li>
                                        <a href="/i8-web/admin/product/create" title="">Thêm mới</a> 
                                    </li>
                                    <li>
                                        <a href="/i8-web/admin/product/list" title="">Danh sách sản phẩm</a> 
                                    </li>
                                    <li>
                                        <a href="/i8-web/admin/product/category/list" title="">Danh mục sản phẩm</a> 
                                    </li>
                                </ul>
                            </li>
                            <li>
                                <a href="/i8-web/admin/order/list" title="">Bán hàng</a>
                                <ul class="sub-menu">
                                    <li>
                                        <a href="/i8-web/admin/order/list" title="">Danh sách đơn hàng</a> 
                                    </li>
                                    <li>
                                        <a href="/i8-web/admin/order/list" title="">Danh sách khách hàng</a> 
                                    </li>
                                </ul>
                            </li>
                            <li>
                                <a href="/i8-web/admin/slider/list" title="">Slider</a>
                                <ul class="sub-menu">
                                    <li>
                                        <a href="/i8-web/admin/slider/create" title="">Thêm mới</a> 
                                    </li>
                                    <li>
                                        <a href="/i8-web/admin/slider/list" title="">Danh sách Slider</a> 
                                    </li>
                                </ul>
                            </li>
                            
                        </ul>
                        <div id="dropdown-user" class="dropdown dropdown-extended fl-right">
                            <button class="dropdown-toggle clearfix" type="button"  data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
                                <div id="thumb-circle" class="fl-left">
                                    <img src="http://localhost:8080/i8-web/resources/adminassets/images/img-admin.png">
                                </div>
                                <h3 id="account" class="fl-right">${ userAccount.get_name() }</h3>
                            </button>
                            <ul class="dropdown-menu">
                                <li><a href="?page=info_account" title="Thông tin cá nhân">Thông tin tài khoản</a></li>
                                <li><a href="#" title="Thoát">Thoát</a></li>
                            </ul>
                        </div>
                    </div>
                </div>