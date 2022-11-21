<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file = "/WEB-INF/views/layout/header.jsp" %>

<div id="main-content-wp" class="cart-page">
    <div class="section" id="breadcrumb-wp">
        <div class="wp-inner">
            <div class="section-detail">
                <ul class="list-item clearfix">
                    <li>
                        <a href="/i8-web/trang-chu" title="">Trang chủ</a>
                    </li>
                    <li>
                        <a href="" title="">Thông tin đơn hàng</a>
                    </li>
                </ul>
            </div>
        </div>
    </div>
    <div id="wrapper" class="wp-inner clearfix">
        <div class="section" id="info-cart-wp">
            <div class="section-detail table-responsive">
                <table class="table">
                    <thead>
                        <tr>
                            <td>Họ và tên</td>
                            <td>Địa chỉ</td>
                            <td>Số điện thoại</td>
                            <td>Thời gian đặt hàng</td>
                            <td>Thành tiền</td>
                            <td> Trạng thái đơn hàng</td>
                            <td> Chi tiết </td>
                        </tr>
                    </thead>
                    <tbody>
	                    <c:forEach var="item" items="${ listOrder}">
	                    	<form action="/i8-web/gio-hang/update" method="post">
	                    	<input type="hidden" name="id" value="${ item.id}"/>
		                    <tr>
		                    	<td>${ item.fullname}</td>
		                        <td class="address">${ item.address}</td>
		                        <td>${ item.phone}</td>
		                        <td>${ item.created_at}</td>
		                        <td>${ item.bill_total}</td>
		                        <td>${ item.status}</td>
		                        <td><a href="/i8-web/chi-tiet-don-hang/${item.id}">Chi tiết</a></td>
	                        </tr>
                        	</form>
	                    </c:forEach>
                    </tbody>
                   
                </table>
            </div>
        	<c:choose>
        		<c:when test="${listOrder == null}">
        				<div>
		                <center><img src="resources/assets/images/empty-cart.png" alt="" align="middle"></center>
		                <p style="text-align: center;font-size: x-large">Không có sản phẩm nào trong giỏ hàng</p>
		                </div>
        			<br />
    			</c:when> 
        		
         </c:choose>   
        </div>
      
    </div>
</div>
<%@include file = "/WEB-INF/views/layout/footer.jsp" %>