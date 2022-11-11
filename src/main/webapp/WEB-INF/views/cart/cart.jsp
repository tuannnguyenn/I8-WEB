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
                        <a href="" title="">Sản phẩm làm đẹp da</a>
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
                            <td>Mã sản phẩm</td>
                            <td>Ảnh sản phẩm</td>
                            <td>Tên sản phẩm</td>
                            <td>Giá sản phẩm</td>
                            <td>Số lượng</td>
                            <td>Thành tiền</td>
                            <td> Xóa sản phẩm</td>
                        </tr>
                    </thead>
                    <tbody>
	                    <c:forEach var="item" items="${ CART}">
	                    	<form action="/i8-web/gio-hang/update" method="post">
	                    	<input type="hidden" name="id" value="${ item.id}"/>
		                    <tr>
		                    	<td>${ item.id}</td>
		                        <td><img src="<c:url value='/resources/assets/images/${item.image }'/>" data-zoom-image=<c:url value='/resources/assets/images/${item.image }'/> width="100" height="150"></td>
		                        <td>${ item.name}</td>
		                        <td>${ item.price}</td>
		                        <td><input name="quantity" value="${ item.quantity}" 
		           	                	onblur="this.form.submit()" style="width:50px;"></td>
		                        <td>${ item.amount}</td>
		                        <td>
		                            <div class="action clearfix">
		                                <a href="/i8-web/gio-hang/del/${item.id }" title="Xóa sản phẩm" class="delete-item fl-rigth">Xóa sản phẩm</a>
		                            </div>
		                        </td>
	                        </tr>
                        	</form>
	                    </c:forEach>
                    </tbody>
                    <tfoot>
                        <tr>
                            <td colspan="7">
                                <div class="clearfix">
                                    <p id="total-price" class="fl-right">Tổng giá: <span>${TOTAL }</span></p>
                                </div>
                            </td>
                        </tr>
                        <tr>
                            <td colspan="7">
                                <div class="clearfix">
                                    <div class="fl-right">
                                        <a href="/i8-web/thanh-toan" title="" id="checkout-cart">Thanh toán</a>
                                    </div>
                                </div>
                            </td>
                        </tr>
                    </tfoot>
                </table>
            </div>
        </div>
        <div class="section" id="action-cart-wp">
            <div class="section-detail">
                <p class="title">Click vào <span>“Cập nhật giỏ hàng”</span> để cập nhật số lượng. Nhập vào số lượng <span>0</span> để xóa sản phẩm khỏi giỏ hàng. Nhấn vào thanh toán để hoàn tất mua hàng.</p>
                <a href="/i8-web/trang-chu" title="" id="buy-more">Mua tiếp</a><br/>
                <a href="/i8-web/gio-hang/clear" title="" id="delete-cart">Xóa giỏ hàng</a>
            </div>
        </div>
    </div>
</div>
<%@include file = "/WEB-INF/views/layout/footer.jsp" %>