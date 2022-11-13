<%@page import="com.i8web.model.Admin.PostsModel"%>
<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@include file="/WEB-INF/views/admin/layout/header.jsp"%>
<div id="main-content-wp" class="add-cat-page">
	<div class="wrap clearfix">
		<%@include file="/WEB-INF/views/admin/layout/sidebar.jsp"%>
		<div id="content" class="fl-right">
			<div class="section" id="title-page">
				<div class="clearfix">
					<h3 id="index" class="fl-left">Cập nhật Slider</h3>
				</div>
			</div>
			<div class="section" id="detail-page">
				<div class="section-detail">
					<c:forEach var="item" items="${ SliderId }">
						<form:form action="" method="POST" modelAttribute="slider">
							
							<label>Hình ảnh</label>
							<div id="uploadFile">
								<form:input type="file" value="${item.image }" name="file"
									id="upload-thumb" path="image" />
							</div>
							<div>
								<button type="submit" name="btn-submit" id="btn-submit">Cập
									nhật</button>
							</div>
						</form:form>
					</c:forEach>
				</div>
			</div>
		</div>
	</div>
</div>
<%@include file="/WEB-INF/views/admin/layout/footer.jsp"%>