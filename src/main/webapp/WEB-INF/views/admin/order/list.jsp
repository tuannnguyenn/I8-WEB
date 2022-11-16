<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="/WEB-INF/views/admin/layout/header.jsp"%>
<div id="main-content-wp" class="list-product-page">
	<div class="wrap clearfix">
		<%@include file="/WEB-INF/views/admin/layout/sidebar.jsp"%>
		<div id="content" class="fl-right">
			<div class="section" id="title-page">
				<div class="clearfix">
					<h3 id="index" class="fl-left">Danh sách đơn hàng</h3>
				</div>
			</div>
			<div class="section" id="detail-page">
				<div class="section-detail">
					<div class="filter-wp clearfix">
						<ul class="post-status fl-left">
							<li class="all"><a href="">Tất cả <span class="count">(69)</span></a>
								|</li>
							<li class="publish"><a href="">Đã đăng <span
									class="count">(51)</span></a> |</li>
							<li class="pending"><a href="">Chờ xét duyệt<span
									class="count">(0)</span> |
							</a></li>
							<li class="pending"><a href="">Thùng rác<span
									class="count">(0)</span></a></li>
						</ul>
						<form method="GET" class="form-s fl-right">
							<input type="text" name="s" id="s"> <input type="submit"
								name="sm_s" value="Tìm kiếm">
						</form>
					</div>
					<div class="actions">
						<form method="GET" action="" class="form-actions">
							<select name="actions">
								<option value="0">Tác vụ</option>
								<option value="1">Công khai</option>
								<option value="1">Chờ duyệt</option>
								<option value="2">Bỏ vào thủng rác</option>
							</select> <input type="submit" name="sm_action" value="Áp dụng">
						</form>
					</div>
					<div class="table-responsive">
						<table class="table list-table-wp">
							<thead>
								<tr>
									<td><span class="thead-text">Mã đơn hàng</span></td>
									<td><span class="thead-text">Họ và tên</span></td>
									<td><span class="thead-text">Địa chỉ</span></td>
									<td><span class="thead-text">Số điện thoại</span></td>
									<td><span class="thead-text">Thời gian</span></td>
									<td><span class="thead-text">Chi tiết</span></td>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${ orders }" var="order">
									<tr>
										<td><span class="tbody-text">${ order.id.toString() }</span>
										<td><span class="tbody-text">${ order.fullname }</span></td>
										<td><span class="tbody-text">${ order.address }</span></td>
										<td><span class="tbody-text">${ order.phone }</span></td>
										<td><span class="tbody-text">${ order.created_at }</span></td>
										<td><a href="/i8-web/admin/order/detail?id=${order.id }" title=""
											class="tbody-text">Chi tiết</a></td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
				</div>
			</div>
			<div class="section" id="paging-wp">
				<div class="section-detail clearfix">
					<p id="desc" class="fl-left">Chọn vào checkbox để lựa chọn tất
						cả</p>
					<ul id="list-paging" class="fl-right">
						<li><a href="" title=""></li>
						<li><a href="" title="">1</a></li>
						<li><a href="" title="">2</a></li>
						<li><a href="" title="">3</a></li>
						<li><a href="" title="">></a></li>
					</ul>
				</div>
			</div>
		</div>
	</div>
</div>
<%@include file="/WEB-INF/views/admin/layout/footer.jsp"%>