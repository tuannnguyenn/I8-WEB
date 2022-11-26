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
					<h3 id="index" class="fl-left" style="width: 100%">THỐNG KÊ
						SẢN PHẨM THEO DANH MỤC</h3>
				</div>
				
				<div style="height: 500px; width: 500px;margin-bottom: 30px;">
					<canvas id="myCateStatsChart"></canvas>

				</div>
				<table class="table">

					<tr>
						<th>Mã danh mục</th>
						<th>Tên danh mục</th>
						<th>Số lượng sản phẩm</th>
					</tr>
					<c:forEach var="item" items="${countProductByCate }">
						<tr>
							<td>${item.id }</td>
							<td>${item.name }</td>
							<td>${item.amount}</td>
						</tr>
					</c:forEach>

				</table>
			</div>
		</div>
	</div>
</div>
<script type="text/javascript">
	let cateLabels = [], cateInfo = [];
	<c:forEach var="item" items="${countProductByCate }">
		cateLabels.push('${item.name }')
		cateInfo.push('${item.amount}')
	</c:forEach>

	window.onload = function() {
		cateChart("myCateStatsChart", cateLabels, cateInfo)
	}
</script>
<%@include file="/WEB-INF/views/admin/layout/footer.jsp"%>