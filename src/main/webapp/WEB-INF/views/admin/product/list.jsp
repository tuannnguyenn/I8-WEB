<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/admin/layout/header.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div id="main-content-wp" class="list-post-page">
	<div class="wrap clearfix">
		<%@include file="/WEB-INF/views/admin/layout/sidebar.jsp"%>
		<div id="content" class="fl-right">
			<div class="section" id="title-page">
				<div class="clearfix">
					<h3 id="index" class="fl-left">Danh sách sản phẩm</h3>
					<a href="/i8-web/admin/product/create" title="" id="add-new"
						class="fl-left">Thêm mới</a>
				</div>
			</div>
			<div class="section" id="detail-page">
				<div class="section-detail">
					<div class="table-responsive">
						<table class="table list-table-wp">
							<thead>
								<tr>
									<td><input type="checkbox" name="checkAll" id="checkAll"></td>
									<td><span class="thead-text">STT</span></td>
									<td><span class="thead-text">Tên sản phẩm</span></td>
									<td><span class="thead-text">Giá cũ</span></td>
									<td><span class="thead-text">Giá mới</span></td>
									<td><span class="thead-text">Mô tả</span></td>
									<td><span class="thead-text">Status</span></td>
									<td><span class="thead-text">many_image</span></td>
									<td><span class="thead-text">Hình ảnh</span></td>
									<td><span class="thead-text">Chi tiết sản phẩm</span></td>
									<td><span class="thead-text">Danh mục</span></td>
									<td><span class="thead-text">ghimSale</span></td>
									<td><span class="thead-text">ghimNew</span></td>
									<td><span class="thead-text">Slug</span></td>
									<td><span class="thead-text">Ngày tạo</span></td>
								</tr>
							</thead>
							<tbody>
							<% int i = 0; %>
								<c:forEach var="item" items="${ products }">
									<tr>
										<td><input type="checkbox" name="checkItem"
											class="checkItem"></td>
										<td><span class="tbody-text">${i = i + 1}</span>
										
										<td><span class="tbody-text">${item.name }</span></td>
										<td><span class="tbody-text">${item.price_old }</span></td>
										<td><span class="tbody-text">${item.price_new }</span></td>
										<td><span class="tbody-text">${item.description }</span></td>
										<td><span class="tbody-text">${item.status }</span></td>
										<td><span class="tbody-text">${item.many_image }</span></td>
										<td>
											<span class="tbody-text">
												<img  src="<c:url value='/resources/assets/images/${item.image }'/>" alt="" style="width: 60px; height: 60px" />
											</span>
										</td>
										<td><span class="tbody-text">${item.detail }</span></td>
										<td><span class="tbody-text">${item.product_id}</span></td>
										<td><span class="tbody-text">${item.ghimSale }</span></td>
										<td><span class="tbody-text">${item.ghimNew }</span></td>
										<td><span class="tbody-text">${item.slug }</span></td>
										<td><span class="tbody-text">${item.created_at }</span></td>
										<td>
											<span class="tbody-text">
												<ul class="list-operation fl-right">
													<li><a href="<c:url value="/EditProduct/${item.id}"/>" title="Sửa" class="edit"><i
															class="fa fa-pencil" aria-hidden="true"></i></a></li>
													<li><a href="<c:url value="/DeleteProduct/${item.id}"/>"  title="Xóa" class="delete"><i
															class="fa fa-trash" aria-hidden="true"></i></a></li>
												</ul>
											</span>
										</td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>

				</div>
			</div>
		</div>
	</div>
</div>
<%@include file="/WEB-INF/views/admin/layout/footer.jsp"%>