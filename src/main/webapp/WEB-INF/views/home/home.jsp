<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@include file = "/WEB-INF/views/layout/header.jsp" %>
<body>	
	<div id="main-content-wp" class="home-page clearfix">
	    <div class="wp-inner">
	        <div class="main-content fl-right">
	            <div class="section" id="slider-wp">
	                <div class="section-detail">
	                    <div class="item">
	                        <img src="resources/assets/images/slider-01.png" alt="">
	                    </div>
	                    <div class="item">
	                        <img src="resources/assets/images/slider-02.png" alt="">
	                    </div>
	                    <div class="item">
	                        <img src="resources/assets/images/slider-03.png" alt="">
	                    </div>
	                </div>
	            </div>
	            <div class="section" id="support-wp">
	                <div class="section-detail">
	                    <ul class="list-item clearfix">
	                        <li>
	                            <div class="thumb">
	                                <img src="resources/assets/images/icon-1.png">
	                            </div>
	                            <h3 class="title">Miễn phí vận chuyển</h3>
	                            <p class="desc">Tới tận tay khách hàng</p>
	                        </li>
	                        <li>
	                            <div class="thumb">
	                                <img src="resources/assets/images/icon-2.png">
	                            </div>
	                            <h3 class="title">Tư vấn 24/7</h3>
	                            <p class="desc">1900.9999</p>
	                        </li>
	                        <li>
	                            <div class="thumb">
	                                <img src="resources/assets/images/icon-3.png">
	                            </div>
	                            <h3 class="title">Tiết kiệm hơn</h3>
	                            <p class="desc">Với nhiều ưu đãi cực lớn</p>
	                        </li>
	                        <li>
	                            <div class="thumb">
	                                <img src="resources/assets/images/icon-4.png">
	                            </div>
	                            <h3 class="title">Thanh toán nhanh</h3>
	                            <p class="desc">Hỗ trợ nhiều hình thức</p>
	                        </li>
	                        <li>
	                            <div class="thumb">
	                                <img src="resources/assets/images/icon-5.png">
	                            </div>
	                            <h3 class="title">Đặt hàng online</h3>
	                            <p class="desc">Thao tác đơn giản</p>
	                        </li>
	                    </ul>
	                </div>
	            </div>
	            <div class="section" id="feature-product-wp">
	                <div class="section-head">
	                    <h3 class="section-title">Sản phẩm nổi bật</h3>
	                </div>
	                <div class="section-detail">
	                    <ul class="list-item">
	                    	<c:forEach var="item" items="${ listNew }">
		                        <li>
		                            <a href="/i8-web/chi-tiet-san-pham/${item.slug }?id=${item.id }" title="" class="thumb">
		                                <img src=<c:url value='/resources/assets/images/${item.image }'/>>
		                            </a>
		                            <a href="/i8-web/chi-tiet-san-pham/${item.slug }?id=${item.id }" title="" class="product-name">${item.name }</a>
		                            <div class="price">
		                                <span class="new">${item.price_new }</span>
		                                <span class="old">${item.price_old }</span>
		                            </div>
		                            <div class="action clearfix">
		                                <a href="/i8-web/gio-hang" title="" class="add-cart fl-left">Thêm giỏ hàng</a>
		                                <a href="/i8-web/thanh-toan" title="" class="buy-now fl-right">Mua ngay</a>
		                            </div>
		                        </li>
	                        </c:forEach>
	                    </ul>
	                </div>
	            </div>
	            <div class="section" id="list-product-wp">
	                <div class="section-head">
	                    <h3 class="section-title">Điện thoại</h3>
	                </div>
	                <div class="section-detail">
	                    <ul class="list-item clearfix">
	                       <c:forEach var="item" items="${ listMobile }">
		                        <li>
		                            <a href="/i8-web/chi-tiet-san-pham/${item.slug }?id=${item.id }" title="" class="thumb">
		                                <img src=<c:url value='/resources/assets/images/${item.image }'/>>
		                            </a>
		                            <a href="/i8-web/chi-tiet-san-pham/${item.slug }?id=${item.id }" title="" class="product-name">${item.name}</a>
		                            <div class="price">
		                                <span class="new">${item.price_new }</span>
		                                <span class="old">${item.price_old }</span>
		                            </div>
		                            <div class="action clearfix">
		                                <a href="/i8-web/gio-hang" title="Thêm giỏ hàng" class="add-cart fl-left">Thêm giỏ hàng</a>
		                                <a href="/i8-web/thanh-toan" title="Mua ngay" class="buy-now fl-right">Mua ngay</a>
		                            </div>
		                        </li>
	                        </c:forEach>
	                    </ul>
	                </div>
	            </div>
	            <div class="section" id="list-product-wp">
	                <div class="section-head">
	                    <h3 class="section-title">Laptop</h3>
	                </div>
	                <div class="section-detail">
	                    <ul class="list-item clearfix">
	                    	<c:forEach var="item" items="${ listLaptop }">
		                        <li>
		                            <a href="/i8-web/chi-tiet-san-pham/${item.slug }?id=${item.id }" title="" class="thumb">
		                                <img src=<c:url value='/resources/assets/images/${item.image }'/>>
		                            </a>
		                            <a href="/i8-web/chi-tiet-san-pham/${item.slug }?id=${item.id }" title="" class="product-name">${item.name }</a>
		                            <div class="price">
		                                <span class="new">${item.price_new }</span>
		                                <span class="old">${item.price_old }</span>
		                            </div>
		                            <div class="action clearfix">
		                                <a href="/i8-web/gio-hang" title="Thêm giỏ hàng" class="add-cart fl-left">Thêm giỏ hàng</a>
		                                <a href="/i8-web/thanh-toan" title="Mua ngay" class="buy-now fl-right">Mua ngay</a>
		                            </div>
		                        </li>
	                        </c:forEach>
	                    </ul>
	                </div>
	            </div>
	        </div>
	        <div class="sidebar fl-left">
	            <div class="section" id="category-product-wp">
	                <div class="section-head">
	                    <h3 class="section-title">Danh mục sản phẩm</h3>
	                </div>
	                <div class="secion-detail">
	                    <ul class="list-item">
	                        <c:forEach var="item" items="${ listCat }">	                        
		                        <li>
		                            <a href="/i8-web/${item.slug}?id=${item.id}" title="">${item.name }</a>
		                        </li>
	                        </c:forEach>
	                    </ul>
	                </div>
	            </div>
	            <div class="section" id="selling-wp">
	                <div class="section-head">
	                    <h3 class="section-title">Sản phẩm bán chạy</h3>
	                </div>
	                <div class="section-detail">
	                    <ul class="list-item">
	                    	<c:forEach var="item" items="${ listSale }">
		                        <li class="clearfix">
		                            <a href="/i8-web/chi-tiet-san-pham/${item.slug }?id=${item.id }" title="" class="thumb fl-left">
		                                <img src=<c:url value='/resources/assets/images/${item.image }'/> alt="">
		                            </a>
		                            <div class="info fl-right">
		                                <a href="/i8-web/chi-tiet-san-pham/${item.slug }?id=${item.id }" title="" class="product-name">${item.name }</a>
		                                <div class="price">
		                                    <span class="new">${item.price_new }</span>
		                                    <span class="old">${item.price_old }</span>
		                                </div>
		                                <a href="" title="" class="buy-now">Mua ngay</a>
		                            </div>
		                        </li>
	                        </c:forEach>
	                    </ul>
	                </div>
	            </div>
	        </div>
	    </div>
	</div>
</body>
<%@include file = "/WEB-INF/views/layout/footer.jsp" %>
