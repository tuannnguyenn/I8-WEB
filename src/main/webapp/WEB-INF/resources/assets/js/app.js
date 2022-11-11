$(document).ready(function () {
    function filter_data() {
        var price_new_arr = get_filter('price_new');
        let price_new = price_new_arr.toString();
        var category_id = $("#category_save").val();
        var filter_order_arr = get_filter_select('filter_order');
        let filter_order = filter_order_arr.toString();
        var brand_arr = get_filter('brand');
        let brand = brand_arr.toString();
        $.ajax({
            url: '/i8-web/filter_data',
            method: 'POST',
            data: {price_new: price_new, category_id: category_id, filter_order: filter_order, brand: brand},
            dataType: 'text',
            success: function (data) {
                $(".list-filter").html(data);
                //$("ul.list-category-responsive").html(data);
                console.log(data);
            },
            error: function (xhr, ajaxOption, thrownError) {
                alert(xhr.status);
                alert(thrownError);
            }
        });
    }
    
     function get_filter(class_name) {
        var filter = [];
        $('.' + class_name + ':checked').each(function () {
            filter.push($(this).val());
        });
        return filter;
    }
    function get_filter_select(class_name) {
        var filter = [];
        $('.' + class_name + ':selected').each(function () {
            filter.push($(this).val());
        });
        return filter;
    }
     $(".common_selector").click(function () {
        filter_data();
    });
    $("#common_selector").click(function(){
        filter_data();
    });
    $(".common_selector_brand").click(function(){
        filter_data();
    });
    
     $(".input_search").keyup(function () { 
        var action = "search";
        var search_name = $(".input_search").val();
        if($(".input_search").val() != ''){
            $.ajax({
                url: '/i8-web/search',
                method: 'POST',
                data: { action: action, search_name: search_name},
                dataType: 'text',
                success: function (data) {
                    $("ul.list-item-show").html(data);
                    // console.log(data);
                },
                error: function (xhr, ajaxOption, thrownError) {
                    alert(xhr.status);
                    alert(thrownError);
                }
            });
        }else{
            $("ul.list-item-show").html("");
        }
    });
});