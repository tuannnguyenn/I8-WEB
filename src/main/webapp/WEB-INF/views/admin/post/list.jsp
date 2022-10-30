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
					<h3 id="index" class="fl-left">Danh sách bài viết</h3>
					<a href="/i8-web/admin/post/create" title="" id="add-new"
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
									<td><span class="thead-text">Hình ảnh</span></td>
									<td><span class="thead-text">Tiêu đề</span></td>
									<td><span class="thead-text">Mô tả</span></td>
									<td><span class="thead-text">Danh mục</span></td>
									<td><span class="thead-text">Thời gian</span></td>
								</tr>
							</thead>
							<tbody>
							<% int i = 0; %>
								<c:forEach var="item" items="${ posts }">
									<tr>
										<td><input type="checkbox" name="checkItem"
											class="checkItem"></td>
										<td><span class="tbody-text">${i = i + 1}</span>
										<td>
											<span class="tbody-text">
												<img  src="<c:url value='/resources/assets/images/${item.image }'/>" alt="" style="width: 60px; height: 60px" />
											</span>
										</td>
										<td class="clearfix">
											<div class="tb-title fl-left">
												<a href="" title="">${item.title }</a>
											</div>
										</td>
										<td><span class="tbody-text">${item.description }</span></td>
										<td><span class="tbody-text">${item.post_id}</span></td>
										<td><span class="tbody-text">${item.date }</span></td>
										<td>
											<span class="tbody-text">
												<ul class="list-operation fl-right">
													<li><a href="<c:url value="/EditPost/${item.id}"/>" title="Sửa" class="edit"><i
															class="fa fa-pencil" aria-hidden="true"></i></a></li>
													<li><a href="<c:url value="/DeletePost/${item.id}"/>"  title="Xóa" class="delete"><i
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