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
					<div class="filter-wp clearfix">
						<ul class="post-status fl-left">
							<li class="all"><a href="">Tất cả <span class="count">(10)</span></a>
								|</li>
							<li class="publish"><a href="">Đã đăng <span
									class="count">(5)</span></a> |</li>
							<li class="pending"><a href="">Chờ xét duyệt <span
									class="count">(5)</span></a></li>
							<li class="trash"><a href="">Thùng rác <span
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
								<option value="1">Chỉnh sửa</option>
								<option value="2">Bỏ vào thủng rác</option>
							</select> <input type="submit" name="sm_action" value="Áp dụng">
						</form>
					</div>
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
									<td><span class="thead-text">Trạng thái</span></td>
									<td><span class="thead-text">Người tạo</span></td>
									<td><span class="thead-text">Thời gian</span></td>
								</tr>
							</thead>
							<tbody>
								<c:forEach var="item" items="${ posts }">
									<tr>
										<td><input type="checkbox" name="checkItem"
											class="checkItem"></td>
										<td><span class="tbody-text">${item.id }</span>
										<td>
											<span class="tbody-text">
												<img src=${item.image } alt="" style="width: 60px; height: 60px" />
											</span>
										</td>
										<td class="clearfix">
											<div class="tb-title fl-left">
												<a href="" title="">${item.title }</a>
											</div>
										</td>
										<td><span class="tbody-text">${item.description }</span></td>
										<td><span class="tbody-text">Danh mục 1</span></td>
										<td><span class="tbody-text">Hoạt động</span></td>
										<td><span class="tbody-text">Admin</span></td>
										<td><span class="tbody-text">${item.date }</span></td>
										<td>
											<span class="tbody-text">
												<ul class="list-operation fl-right">
													<li><a href="" title="Sửa" class="edit"><i
															class="fa fa-pencil" aria-hidden="true"></i></a></li>
													<li><a href="" title="Xóa" class="delete"><i
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
			<div class="section" id="paging-wp">
				<div class="section-detail clearfix">
					<ul id="list-paging" class="fl-right">
						<li><a href="" title=""><</a></li>
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