package com.i8web.controller.Admin;
import java.text.ParseException;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.i8web.Service.Admin.CategoriesProductService;
import com.i8web.model.Admin.ReportModel;

@Controller
public class ReportController extends BaseReportController {
	@Autowired
	ReportModel reportModel;
	CategoriesProductService categoriesProductService;
	//ProductByCate
	@RequestMapping(value = "/admin/report/category", method = RequestMethod.GET)
	public ModelAndView getListAProductByCate() {
		ModelAndView mav = new ModelAndView("admin/report/category");
		mav.addObject("countProductByCate", reportModel.GetListAProductByCate());
		return mav;
	}
	//ProductRevenue
	@RequestMapping(value = "/admin/report/product", method = RequestMethod.GET)
	public ModelAndView getListProductRevenue() {
		reportModel.dropTableProductRevenue();
		reportModel.createTableProductRevenue();
		_mav.addObject("productRevenue", reportModel.GetListProductRevenue());
		return _mav;
	}
	@RequestMapping(value = "/admin/report/product", method = RequestMethod.POST)
	public ModelAndView postFilterProduct(HttpServletRequest req) throws ParseException {
		String fromDate = req.getParameter("fromDate");
		String toDate = req.getParameter("toDate");
		int kw = Integer.parseInt(req.getParameter("kw"));
		reportModel.dropTableProductRevenue();
		if (fromDate == "" && toDate == "" && kw == 0) {
			reportModel.createTableProductRevenue();
		} else if (fromDate == "" || toDate == "") {
			reportModel.createTableProductRevenueByCate(kw);
		} else if (kw == 0) {
			reportModel.createTableProductRevenueByTime(fromDate, toDate);
		} else {
			reportModel.createTableProductRevenueByTimeAndCate(fromDate, toDate, kw);
		}
		_mav.addObject("productRevenue", reportModel.GetListProductRevenue());
		return _mav;
	}
	//MonthRevenue
	@RequestMapping(value = "/admin/report/month", method = RequestMethod.GET)
	public ModelAndView getListMonthRevenue() {
		reportModel.dropTableMonthRevenue();
		reportModel.createTableMonthRevenue();
		_mav.addObject("monthRevenue", reportModel.GetListMonthRevenue());
		return _mav;
	}
	@RequestMapping(value = "/admin/report/month", method = RequestMethod.POST)
	public ModelAndView postFilterMonth(HttpServletRequest req) throws ParseException {
		String fromDate = req.getParameter("fromDate");
		String toDate = req.getParameter("toDate");
		int kw = Integer.parseInt(req.getParameter("kw"));
		reportModel.dropTableMonthRevenue();
		if (fromDate == "" && toDate == "" && kw == 0) {
			reportModel.createTableMonthRevenue();
		} else if (fromDate == "" || toDate == "") {
			reportModel.createTableMonthRevenueByCate(kw);
		} else if (kw == 0) {
			reportModel.createTableMonthRevenueByTime(fromDate, toDate);
		} else {
			reportModel.createTableMonthRevenueByTimeAndCate(fromDate, toDate, kw);
		}
		_mav.addObject("monthRevenue", reportModel.GetListMonthRevenue());
		return _mav;
	}
}
