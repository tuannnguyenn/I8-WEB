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
						DOANH THU THEO THÁNG</h3>
				</div>
				<div class="section" id="detail-page">
					<div class="section-detail">
					<form action="" method="POST"> 
						<div class="form-group">
								<label for="title">Danh mục</label>
							<div style = "width:150px;">
								 <select name="kw" style="width:200px">
		                        <option value="0">--Chọn từ khóa--</option>
								<c:forEach var="item" items="${ categoriesProduct }">
								<option value="${item.id }">${item.name}</option>
								</c:forEach>
								</select>
							</div>
		                       
						</div>
		                <div>
		                		<label for="title">Từ thời điểm</label>
		                        <input type="date" name="fromDate" id="title" />  
		                </div>
	                    <div>
	                    		<label for="title" style="margin-top:20px">Đến thời điểm</label>
	                        	<input type="date" name="toDate" id="title" />  
	                    </div>
	                        <div>
	                        	<button type="submit" name="btn-submit" id="btn-submit" style="margin-top:20px;">Báo cáo</button>
	                        </div>    
	                    </form>
                    </div>
                </div>
				<div style="height: 500px; width: 2000px;margin-bottom: 30px;">
					<canvas id="myMonthStatsChart"></canvas>
				</div>
				
				
				<table class="table">
					<tr>
						<th>Tháng</th>
						<th >Doanh thu</th>
					</tr>
					<c:forEach var="item" items="${ monthRevenue }">
						<tr>
							<td>${item.month } / ${item.year}</td>
							<td>${item.sum} Đ</td>
						</tr>
					</c:forEach>

				</table>
			</div>
		</div>
	</div>
</div>
<script type="text/javascript">
 	let monthLabels = [], monthInfo = [];
 	<c:forEach var="item" items="${monthRevenue }">
 		monthLabels.push('${item.month } / ${item.year}')
		monthInfo.push('${item.sum}')
	</c:forEach>

	window.onload = function() {
		monthChart("myMonthStatsChart",monthLabels,monthInfo)
	}
</script>
<%@include file="/WEB-INF/views/admin/layout/footer.jsp"%>