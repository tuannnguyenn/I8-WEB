package com.i8web.controller.Admin;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.i8web.Service.SliderService;
import com.i8web.entity.Admin.CategoriesProduct;
import com.i8web.entity.Admin.Sliders;

@Controller
public class SlidersController {
	@Autowired
	SliderService sliderService;
	@RequestMapping(value = "/admin/slider/create", method = RequestMethod.GET)
	   
	public ModelAndView create() {
		ModelAndView mav = new ModelAndView("admin/slider/create");
		mav.addObject("slider", new Sliders());
	      return mav;
	   }
	@RequestMapping(value = "admin/slider/create", method = RequestMethod.POST)
	   public ModelAndView create(@ModelAttribute("slider") Sliders slider) {
	      ModelAndView mav = new ModelAndView("admin/slider/create");
	      sliderService.InsertDataSlider(slider);
	      return mav;
	   }
	   @RequestMapping(value = "/admin/slider/list", method = RequestMethod.GET)
	   public ModelAndView list() {
	      ModelAndView mav = new ModelAndView("/admin/slider/list");
	      mav.addObject("sliders", sliderService.GetListSliders());
	      return mav;
	   } 
	   @RequestMapping(value = "DeleteSlider/{id}")
	   public String delete(@PathVariable int id,HttpServletRequest req) {
	   sliderService.DeleteDataSlider(id);
	   return "redirect:/admin/slider/list";
	   } 
	   @RequestMapping(value = "/EditSlider/{id}", method = RequestMethod.GET)
	   public ModelAndView getEdit(@PathVariable int id,@ModelAttribute("slider") Sliders slider) {
		   ModelAndView mav = new ModelAndView("/admin/slider/edit");
	      mav.addObject("sliders", sliderService.GetListSliders());
	      mav.addObject("SliderId", sliderService.GetSliderById(id));
	      return mav;
	   }
	   @RequestMapping(value = "/EditSlider/{id}", method = RequestMethod.POST)
	   public String postEdit(@PathVariable int id,@ModelAttribute("slider") Sliders slider,HttpServletRequest req) {
		  sliderService.UpdateDataSlider(slider);
	      return "redirect:/admin/slider/list";
	   }
}
