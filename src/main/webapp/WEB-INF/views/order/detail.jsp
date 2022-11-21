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
                        <a href="" title="">Chi tiết đơn hàng</a>
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
                            <td >STT</td>
                            <td>Ảnh sản phẩm</td>
                            <td>Tên sản phẩm</td>
                            <td>Giá sản phẩm</td>
                            <td>Số lượng</td>
                            <td>Thành tiền</td>
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
        	<c:choose>
        		<c:when test="${ITEMS=='0'}">
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