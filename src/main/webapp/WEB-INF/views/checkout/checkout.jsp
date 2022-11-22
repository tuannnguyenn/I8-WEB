<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@include file = "/WEB-INF/views/layout/header.jsp" %>
<div id="main-content-wp" class="checkout-page">
    <div class="section" id="breadcrumb-wp">
        <div class="wp-inner">
            <div class="section-detail">
                <ul class="list-item clearfix">
                    <li>
                        <a href="/i8-web/trang-chu" title="">Trang chủ</a>
                    </li>
                    <li>
                        <a href="" title="">Thanh toán</a>
                    </li>
                </ul>
            </div>
        </div>
    </div>
   


 <script type="text/javascript">
    	function display(){
			document.getElementById("success").style.display ="block";
 }
 </script> 
    <div id="wrapper" class="wp-inner clearfix">
        <form action="<%=request.getContextPath() %>/thanh-toan/save" method="post" name="form-checkout" >
        <div class="section" id="customer-info-wp">
            <div class="section-head">
                <h1 class="section-title">Thông tin khách hàng</h1>
            </div>
            <div class="section-detail">
                    <div class="form-row clearfix">
                        <div class="form-col fl-left">
                            <label for="fullname">Họ tên*</label>
                            <input type="text" name="fullname" id="fullname" >
                        </div>
                        <div class="form-col fl-right">
                            <label for="email">Email*</label>
                            <input type="email" name="email" id="email">
                        </div>
                    </div>
                    <div class="form-row clearfix">
                        <div class="form-col fl-left">
                            <label for="address">Địa chỉ*</label>
                            <input type="text" name="address" id="address">
                        </div>
                        <div class="form-col fl-right">
                            <label for="phone">Số điện thoại*</label>
                            <input type="tel" name="phone" id="phone" pattern="[0-9]{5,20}">
                        </div>
                    </div>
                    <div class="form-row">
                    <div class="form-col">
                        <label for="notes">Ghi chú</label>
                        <textarea name="note" placeholder="Ghi chú đơn hàng"></textarea>
                    </div>
                </div> 			             
	    	</div>
        </div>
        <div class="section" id="order-review-wp">
            <div class="section-head">
                <h1 class="section-title">Thông tin đơn hàng</h1>
            </div>
            <div class="section-detail">
                <table class="shop-table">
                    <thead>
                        <tr>
                            <td>Sản phẩm</td>
                            <td>Tổng</td>
                        </tr>
                    </thead>
                    <tbody>
                    	<c:forEach var="item" items="${ CART}">
	                        <tr class="cart-item">
	                            <td class="product-name">${item.name }<strong class="product-quantity">x ${ item.quantity}</strong></td>
	                            <td class="product-total">${ item.amount}</td>
	                        </tr>
	                	</c:forEach>
                        
                    </tbody>
                    <tfoot>
                        <tr class="order-total">
                            <td>Tổng đơn hàng:</td>
                            <td><strong class="total-price">${TOTAL }</strong></td>
                        </tr>
                    </tfoot>
                </table>
                <div id="payment-checkout-wp">
                    <ul id="payment_methods">
                        <li>
                            <input type="radio" id="direct-payment" name="payment-method" value="direct-payment" checked>
                            <label for="direct-payment">Thanh toán qua thẻ ngân hàng</label>
                        </li>
                        <li>
                            <input type="radio" id="payment-home" name="payment-method" value="payment-home">
                            <label for="payment-home">Thanh toán tại nhà</label>
                        </li>
                    </ul>
                </div>
  				<div class="place-order-wp clearfix">
  				<input type="submit" id="order-now" onclick ="display()" value="Đặt hàng">
                </div>
                <div class="popup" id="success">
									<div class="popup-content">
										<div class="imgbox">
											<img src=<c:url value='/resources/assets/images/checked.png'/> alt="" class="img-popup">
										</div>
										<div class="popup-title">
											<h3>Đã thanh toán thành công!</h3>
										</div>
									</div>
            </div>
        </div>
        
        </form>   
    </div>
</div>
<%@include file = "/WEB-INF/views/layout/footer.jsp" %>