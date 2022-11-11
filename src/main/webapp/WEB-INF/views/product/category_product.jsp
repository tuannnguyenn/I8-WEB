<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@include file = "/WEB-INF/views/layout/header.jsp" %>

<div id="main-content-wp" class="clearfix category-product-page">
    <div class="wp-inner">
        <div class="secion" id="breadcrumb-wp">
            <div class="secion-detail">
                <ul class="list-item clearfix">
                    <li>
                        <a href="/i8-web/trang-chu" title="">Trang chủ</a>
                    </li>
                    <c:forEach var="item" items="${ CatId }">	
	                    <li>
	                        <a href="/i8-web/danh-sach-san-pham" title="">${item.name }</a>
	                    </li>
                    </c:forEach>
                </ul>
            </div>
        </div>
        <div class="main-content fl-right">
            <div class="section" id="list-product-wp">
                <div class="section-head clearfix">
                	<c:forEach var="item" items="${ CatId }">	  
                    	<h3 class="section-title fl-left">${item.name }</h3>
                    </c:forEach>
                    <div class="filter-wp fl-right">
                        <p class="desc">Hiển thị 45 trên 50 sản phẩm</p>
                        <div class="form-filter">
                            <form method="POST" action="">
                                <select id="common_selector">
                                	 <option>Tất cả</option>
                                     <option value="1" class="filter_order">Từ A-Z</option>
                                     <option value="2" class="filter_order">Từ Z-A</option>
                                     <option value="3" class="filter_order">Giá cao xuống thấp</option>
                                     <option value="4" class="filter_order">Giá thấp lên cao</option>
                                 </select>
                            </form>
                        </div>
                    </div>
                </div>
                <div class="section-detail">
                    <ul class="list-item clearfix list-filter">
                    	<c:forEach var="item" items="${ listProduct }">	
	                        <li>
	                            <a href="/i8-web/chi-tiet-san-pham/${item.slug }?id=${item.id }" title="" class="thumb">
	                                <img src="<c:url value='/resources/assets/images/${item.image }'/>">
	                            </a>
	                            <a href="/i8-web/chi-tiet-san-pham" title="" class="product-name">${item.name }</a>
	                            <div class="price">
	                                <span class="new">${item.price_new }</span>
	                                <span class="old">${item.price_old }</span>
	                            </div>
	                            <div class="action clearfix">
	                                <a href="/i8-web/gio-hang/add/${item.id }" title="Thêm giỏ hàng" class="add-cart fl-left">Thêm giỏ hàng</a>
	                                <a href="/i8-web/thanh-toan" title="Mua ngay" class="buy-now fl-right">Mua ngay</a>
	                            </div>
	                        </li>
                        </c:forEach>
                    </ul>
                </div>
            </div>
            <div class="section" id="paging-wp">
                <div class="section-detail">
                    <ul class="list-item clearfix">
                        <li>
                            <a href="" title="">1</a>
                        </li>
                        <li>
                            <a href="" title="">2</a>
                        </li>
                        <li>
                            <a href="" title="">3</a>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
        <div class="sidebar fl-left">
            <div class="section" id="category-product-wp">
                <div class="section-head">
                    <h3 class="section-title">Danh mục sản phẩm</h3>
                </div>
                <c:forEach var="item" items="${ CatId }">	
                	<input type="hidden" name="" id="category_save" value="${item.id}">
                </c:forEach>
                <div class="secion-detail">
                    <ul class="list-item">
                    <c:forEach var="item" items="${ listCat }">	
                        <li>
                            <a href="/i8-web/${item.slug}?id=${item.id}" title="">${item.name}</a>
                        </li>
                      </c:forEach>
                    </ul>
                </div>
            </div>
            <div class="section" id="filter-product-wp">
                <div class="section-head">
                    <h3 class="section-title">Bộ lọc</h3>
                </div>
                <div class="section-detail">
                    <form method="POST" action="">
                        <table>
                            <thead>
                                <tr>
                                    <td colspan="2">Giá</td>
                                </tr>
                            </thead>
                            <tbody>
                            	<tr>
                                    <td><input type="radio" class="price_new" name="price_new" checked></td>
                                    <td>Tất cả</td>
                                </tr>
                                <tr>
                                    <td><input type="radio" class="common_selector price_new" name="price_new" value="500000"></td>
                                    <td>Dưới 500.000đ</td>
                                </tr>
                                <tr>
                                    <td><input type="radio" class="common_selector price_new" name="price_new" value="500000 AND 1000000"></td>
                                    <td>500.000đ - 1.000.000đ</td>
                                </tr>
                                <tr>
                                    <td><input type="radio" class="common_selector price_new" name="price_new" value="1000000 AND 5000000"></td>
                                    <td>1.000.000đ - 5.000.000đ</td>
                                </tr>
                                <tr>
                                    <td><input type="radio" class="common_selector price_new" name="price_new" value="5000000 AND 10000000"></td>
                                    <td>5.000.000đ - 10.000.000đ</td>
                                </tr>
                                <tr>
                                    <td><input type="radio" class="common_selector price_new" name="price_new" value="10000000"></td>
                                    <td>Giá trên 10.000.000đ</td>
                                </tr>
                            </tbody>
                        </table>
                        <table>
                            <thead>
                                <tr>
                                    <td colspan="2">Hãng</td>
                                </tr>
                            </thead>
                            <tbody>
                            	<tr>
                                    <td><input type="radio" name="brand" checked></td>
                                    <td>Tất cả</td>
                                </tr>
                                <tr>
                                    <td><input type="radio" class="common_selector_brand brand" name="brand" value="Acer"></td>
                                    <td>Acer</td>
                                </tr>
                                <tr>
                                    <td><input type="radio" class="common_selector_brand brand" name="brand" value="Apple"></td>
                                    <td>Apple</td>
                                </tr>
                                <tr>
                                    <td><input type="radio" class="common_selector_brand brand" name="brand" value="Lenovo"></td>
                                    <td>Lenovo</td>
                                </tr>
                                <tr>
                                    <td><input type="radio" class="common_selector_brand brand" name="brand" value="Samsung"></td>
                                    <td>Samsung</td>
                                </tr>
                            </tbody>
                        </table>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
<%@include file = "/WEB-INF/views/layout/footer.jsp" %>