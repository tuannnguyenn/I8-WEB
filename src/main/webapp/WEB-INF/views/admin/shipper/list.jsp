<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="/WEB-INF/views/admin/layout/no_header.jsp"%>
<div id="main-content-wp" class="list-product-page">
	<div class="wrap clearfix">
		<div id="content" class="fl-right" style="width: 100%; border: none;">
			<div class="section" id="title-page">
				<div class="clearfix">
					<h3 id="index" class="fl-left">Danh sách đơn hàng</h3>
				</div>
			</div>
			<div class="section" id="detail-page">
				<div class="section-detail">
					<div class="filter-wp clearfix">
						<ul class="post-status fl-left">
						
							<li class="all"><a href="">Tất cả <span class="count">(${orders.size()})</span></a></li>
							
						</ul>
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
									<td><span class="thead-text">Trạng thái đơn hàng</span></td>
									<td><span class="thead-text">Chi tiết</span></td>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${ orders }" var="order" >								
									<tr>
										<td><span class="tbody-text">${ order.id.toString() }</span>
										<td><span class="tbody-text">${ order.fullname }</span></td>
										<td><span class="tbody-text">${ order.address }</span></td>
										<td><span class="tbody-text">${ order.phone }</span></td>
										<td><span class="tbody-text">${ order.created_at }</span></td>
										<td><span class="tbody-text">${ order.status }</span></td>
										<td><a href="/i8-web/shipper/order/detail/${order.id}" title=""
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
					<!-- <p id="desc" class="fl-left">Chọn vào checkbox để lựa chọn tất
						cả</p> -->
					<!-- <ul id="list-paging" class="fl-right">
						<li><a href="" title=""></li>
						<li><a href="" title="">1</a></li>
						<li><a href="" title="">2</a></li>
						<li><a href="" title="">3</a></li>
						<li><a href="" title="">></a></li>
					</ul> -->
				</div>
			</div>
		</div>
	</div>
</div>