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
					<h3 id="index" class="fl-left">Danh sách tài khoản khách hàng</h3>
				</div>
			</div>
			<div class="section" id="detail-page">
				<div class="section-detail">
					<div class="table-responsive">
						<table class="table list-table-wp">
							<thead>
								<tr>
									<td><span class="thead-text">STT</span></td>
									<td><span class="thead-text">Tên</span></td>
									<td><span class="thead-text">Tên đăng nhập</span></td>
									<td><span class="thead-text">Mật khẩu</span></td>
									<td><span class="thead-text">Email</span></td>
								</tr>
							</thead>
							<tbody>
							<% int i = 0; %>
								<c:forEach var="item" items="${ users }">
									<tr>
										<td><span class="tbody-text">${i = i + 1}</span>										
										<td style="width: 200px"><span class="tbody-text">${item._name }</span></td>
										<td><span class="tbody-text">${item._userName }</span></td>
										<td><span class="tbody-text">${item._passWord }</span></td>
										<td><span class="tbody-text">${item._email }</span></td>
										
										<td>
											<span class="tbody-text">
												<ul class="list-operation fl-right">
													<li><a href="<c:url value="/DeleteAccountUser/${item._id}"/>"  title="Xóa" class="delete"><i
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