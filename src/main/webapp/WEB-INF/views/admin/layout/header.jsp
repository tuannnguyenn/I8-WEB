<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Quáº£n lÃ½ ISMART</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="<c:url value="resources/adminassets/css/bootstrap/bootstrap.min.css" />" rel="stylesheet" type="text/css"/>
        <link href="<c:url value="resources/adminassets/css/bootstrap/bootstrap-theme.min.css" />" rel="stylesheet" type="text/css"/>
        <link href="<c:url value="resources/adminassets/reset.css" />" rel="stylesheet" type="text/css"/>
        <link href="<c:url value="resources/adminassets/css/font-awesome/css/font-awesome.min.css" />" rel="stylesheet" type="text/css"/>
        <link href="public/style.css" rel="stylesheet" type="text/css"/>
        <link href="public/responsive.css" rel="stylesheet" type="text/css"/>

        <script src="public/js/jquery-2.2.4.min.js" type="text/javascript"></script>
        <script src="public/js/bootstrap/bootstrap.min.js" type="text/javascript"></script>
        <script src="public/js/plugins/ckeditor/ckeditor.js" type="text/javascript"></script>
        <script src="public/js/main.js" type="text/javascript"></script>
    </head>
    <body>
        <div id="site">
            <div id="container">
                <div id="header-wp">
                    <div class="wp-inner clearfix">
                        <a href="?page=list_post" title="" id="logo" class="fl-left">ADMIN</a>
                        <ul id="main-menu" class="fl-left">
                            <li>
                                <a href="?page=list_post" title="">Trang</a>
                                <ul class="sub-menu">
                                    <li>
                                        <a href="?page=add_page" title="">ThÃªm má»i</a> 
                                    </li>
                                    <li>
                                        <a href="?page=list_page" title="">Danh sÃ¡ch trang</a> 
                                    </li>
                                </ul>
                            </li>
                            <li>
                                <a href="?page=list_post" title="">BÃ i viáº¿t</a>
                                <ul class="sub-menu">
                                    <li>
                                        <a href="?page=add_post" title="">ThÃªm má»i</a> 
                                    </li>
                                    <li>
                                        <a href="?page=list_post" title="">Danh sÃ¡ch bÃ i viáº¿t</a> 
                                    </li>
                                    <li>
                                        <a href="?page=list_cat" title="">Danh má»¥c bÃ i viáº¿t</a> 
                                    </li>
                                </ul>
                            </li>
                            <li>
                                <a href="?page=list_product" title="">Sáº£n pháº©m</a>
                                <ul class="sub-menu">
                                    <li>
                                        <a href="?page=add_product" title="">ThÃªm má»i</a> 
                                    </li>
                                    <li>
                                        <a href="?page=list_product" title="">Danh sÃ¡ch sáº£n pháº©m</a> 
                                    </li>
                                    <li>
                                        <a href="?page=list_cat" title="">Danh má»¥c sáº£n pháº©m</a> 
                                    </li>
                                </ul>
                            </li>
                            <li>
                                <a href="" title="">BÃ¡n hÃ ng</a>
                                <ul class="sub-menu">
                                    <li>
                                        <a href="?page=list_order" title="">Danh sÃ¡ch ÄÆ¡n hÃ ng</a> 
                                    </li>
                                    <li>
                                        <a href="?page=list_order" title="">Danh sÃ¡ch khÃ¡ch hÃ ng</a> 
                                    </li>
                                </ul>
                            </li>
                            <li>
                                <a href="?page=menu" title="">Menu</a>
                            </li>
                        </ul>
                        <div id="dropdown-user" class="dropdown dropdown-extended fl-right">
                            <button class="dropdown-toggle clearfix" type="button"  data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
                                <div id="thumb-circle" class="fl-left">
                                    <img src="public/images/img-admin.png">
                                </div>
                                <h3 id="account" class="fl-right">Admin</h3>
                            </button>
                            <ul class="dropdown-menu">
                                <li><a href="?page=info_account" title="ThÃ´ng tin cÃ¡ nhÃ¢n">ThÃ´ng tin tÃ i khoáº£n</a></li>
                                <li><a href="#" title="ThoÃ¡t">ThoÃ¡t</a></li>
                            </ul>
                        </div>
                    </div>
                </div>