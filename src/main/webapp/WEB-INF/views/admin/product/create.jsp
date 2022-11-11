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
                    <h3 id="index" class="fl-left">Thêm mới sản phẩm</h3>
                </div>
            </div>
            <div class="section" id="detail-page">
                <div class="section-detail">
                    <form:form accept-charset="UTF-8" action="" method="POST" modelAttribute="product"> 
                    	<label for="title">Tên sản phẩm</label>
                        <form:input type="text" name="title" id="title" path="name" />
                        <label for="price_old">Giá cũ</label>
                        <form:input type="text" name="price_old" id="price_old" path="price_old" />
                        <label for="price_new">Giá mới</label>
                        <form:input type="text" name="price_new" id="price_new" path="price_new" />
                        <label for="desc">Mô tả</label>
                        <form:textarea name="desc" id="desc" class="ckeditor" path = "description"></form:textarea>
                        <label for="status">Status</label>
                        <form:input type="text" name="status" id="status" path="status" />
                      	<label>Hình ảnh</label>
                        <div id="uploadFile">
                            <form:input type="file" name="file" id="upload-thumb" path="image" />  
                        </div>
                        <label for="detail">Chi tiết sản phẩm</label>
                        <form:textarea  name="desc" id="desc"
								class="ckeditor" path="detail" ></form:textarea>
                        <label for="ghimSale">ghimSale</label>
                        <form:input type="text" name="ghimSale" id="ghimSale" path="ghimSale" />
                        <label for="ghimNew">ghimNew</label>
                        <form:input type="text" name="ghimNew" id="ghimNew" path="ghimNew" />
                        <label for="title">Slug ( Friendly_url )</label>
                        <form:input type="text" name="slug" id="slug" path="slug" />       
                        <label>Danh mục cha</label>
                        <form:select name="parent-Cat" path="product_id">
							<option value="">-- Chọn danh mục --</option>
							<c:forEach var="item" items="${ categoriesProduct }">
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