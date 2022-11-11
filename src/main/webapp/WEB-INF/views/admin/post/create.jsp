<%@page import="com.i8web.model.Admin.PostsModel"%>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@include file = "/WEB-INF/views/admin/layout/header.jsp" %>
<div id="main-content-wp" class="add-cat-page">
    <div class="wrap clearfix">
        <%@include file = "/WEB-INF/views/admin/layout/sidebar.jsp" %>
        <div id="content" class="fl-right">
            <div class="section" id="title-page">
                <div class="clearfix">
                    <h3 id="index" class="fl-left">Thêm mới bài viết</h3>
                </div>
            </div>
            <div class="section" id="detail-page">
                <div class="section-detail">
                    <form:form action="" method="POST" modelAttribute="post"> 
                        <label for="title">Tiêu đề</label>
                        <form:input type="text" name="title" id="title" path="title" />  
                        <label for="title">Slug ( Friendly_url )</label>
                        <form:input type="text" name="slug" id="slug" path="slug" />       
                        <label for="desc">Mô tả</label>
                        <form:textarea name="desc" id="desc" class="ckeditor" path = "description"></form:textarea>
                        <label>Hình ảnh</label>
                        <div id="uploadFile">
                            <form:input type="file" name="file" id="upload-thumb" path="image" />  
                        </div>
                        <label>Danh mục cha</label>
                        <form:select name="parent-Cat" path="post_id">
                            <option value="">-- Chọn danh mục --</option>
                           <c:forEach var="item" items="${ categoriesPost }">
								<form:option value="${item.id }">${item.name}</form:option>
							</c:forEach>
                        </form:select>
                        <div>
                        	<button type="submit" name="btn-submit" id="btn-submit">Thêm mới</button>
                        </div>    
                    </form:form>
                </div>
            </div>
        </div>
    </div>
</div>
<%@include file = "/WEB-INF/views/admin/layout/footer.jsp" %>