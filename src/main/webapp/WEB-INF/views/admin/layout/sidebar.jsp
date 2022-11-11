<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div id="sidebar" class="fl-left">
    <ul id="sidebar-menu">
        <li class="nav-item">
            <a href="" title="" class="nav-link nav-toggle">
                <span class="fa fa-pencil-square-o icon"></span>
                <span class="title">Bài viết</span>
            </a>
            <ul class="sub-menu">
                <li class="nav-item">
                    <a href="/i8-web/admin/post/create" title="" class="nav-link">Thêm mới</a>
                </li>
                <li class="nav-item">
                    <a href="/i8-web/admin/post/list" title="" class="nav-link">Danh sách bài viết</a>
                </li>
                <li class="nav-item">
                    <a href="/i8-web/admin/post/category/list" title="" class="nav-link">Danh mục bài viết</a>
                </li>
            </ul>
        </li>
        <li class="nav-item">
            <a href="" title="" class="nav-link nav-toggle">
                <span class="fa fa-product-hunt icon"></span>
                <span class="title">Sản phẩm</span>
            </a>
            <ul class="sub-menu">
                <li class="nav-item">
                    <a href="/i8-web/admin/product/create" title="" class="nav-link">Thêm mới</a>
                </li>
                <li class="nav-item">
                    <a href="/i8-web/admin/product/list" title="" class="nav-link">Danh sách sản phẩm</a>
                </li>
                <li class="nav-item">
                    <a href="/i8-web/admin/product/category/list" title="" class="nav-link">Danh mục sản phẩm</a>
                </li>
            </ul>
        </li>
        <li class="nav-item">
            <a href="" title="" class="nav-link nav-toggle">
                <span class="fa fa-database icon"></span>
                <span class="title">Bán hàng</span>
            </a>
            <ul class="sub-menu">
                <li class="nav-item">
                    <a href="/i8-web/admin/order/list" title="" class="nav-link">Danh sách đơn hàng</a>
                </li>
                <li class="nav-item">
                    <a href="/i8-web/admin/order/list" title="" class="nav-link">Danh sách khách hàng</a>
                </li>
            </ul>
        </li>
        <li class="nav-item">
            <a href="#" title="" class="nav-link nav-toggle">
                <i class="fa fa-sliders" aria-hidden="true"></i>
                <span class="title">Slider</span>
            </a>
            <ul class="sub-menu">
                <li class="nav-item">
                    <a href="/i8-web/admin/slider/create" title="" class="nav-link">Thêm mới</a>
                </li>
                <li class="nav-item">
                    <a href="/i8-web/admin/slider/list" title="" class="nav-link">Danh sách slider</a>
                </li>
            </ul>
        </li>
    </ul>
</div>
