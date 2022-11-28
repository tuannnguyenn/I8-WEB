<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@include file="/WEB-INF/views/admin/layout/header.jsp"%>
<div id="main-content-wp" class="list-product-page">
	<div class="wrap clearfix">
		<%@include file="/WEB-INF/views/admin/layout/sidebar.jsp"%>
		<c:forEach items="${ listOrder }" var="order">
			<div id="content" class="detail-exhibition fl-right">
				<div class="section" id="info">
					<div class="section-head">
						<h3 class="section-title">Thông tin đơn hàng</h3>
					</div>
					<ul class="list-item">
						<li>
							<h3 class="title">Địa chỉ nhận hàng</h3> <span class="detail">${order.address }
								/ ${order.phone }</span>
						</li>
						<li>
							<h3 class="title">Thông tin vận chuyển</h3> <span class="detail">${order.pay }</span>
						</li>
						<form:form method="POST" action="" modelAttribute="order">
							<h3 class="title">Tình trạng đơn hàng:</h3>${order.status}
							
							
						</form:form>
					</ul>

				</div>
				<div class="section">
					<div class="section-head">
						<h3 class="section-title">Sản phẩm đơn hàng</h3>
					</div>
					<div class="table-responsive">
						<table class="table info-exhibition">
							<thead>
								<tr>
									<td class="thead-text">STT</td>
									<td class="thead-text">Ảnh sản phẩm</td>
									<td class="thead-text">Tên sản phẩm</td>
									<td class="thead-text">Đơn giá</td>
									<td class="thead-text">Số lượng</td>
									<td class="thead-text">Thành tiền</td>
								</tr>
							</thead>
							<tbody>
								<c:forEach var="item" items="${ productDetails }">
									<tr>
										<td class="thead-text">${n = n + 1 }</td>
										<td class="thead-text">
											<div class="thumb">
												<img src="/i8-web/resources/assets/images/${ item.image }"
													alt="">
											</div>
										</td>
										<td class="thead-text">${ item.name }</td>
										<td class="thead-text">${ item.price_new }VNĐ</td>
										<td class="thead-text">${ item.quantity.toString() }</td>
										<td class="thead-text">${ item.total_price }VNĐ</td>
									</tr>
								</c:forEach>

							</tbody>
						</table>
					</div>
				</div>
				<div class="section">
					<h3 class="section-title">Giá trị đơn hàng</h3>
					<div class="section-detail">
						<ul class="list-item clearfix">
							<li><span class="total">Tổng đơn hàng</span></li>

							<li><span class="total">${ order.bill_total }</span></li>
						</ul>
					</div>
				</div>
			</div>
		</c:forEach>
	</div>
<%@include file="/WEB-INF/views/admin/layout/footer.jsp"%>