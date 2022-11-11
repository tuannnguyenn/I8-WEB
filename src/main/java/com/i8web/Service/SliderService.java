package com.i8web.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.i8web.entity.Admin.Sliders;
import com.i8web.model.Admin.SlidersModel;
@Service
@Transactional
public class SliderService {
	@Autowired
	SlidersModel slidersModel;
	public List<Sliders> GetListSliders(){
		return slidersModel.GetListSliders();
	}
	public List<Sliders> GetSliderById(int id){
		return slidersModel.GetSliderById(id);
	}
	public void InsertDataSlider(Sliders slider) {
		slidersModel.InsertDataSlider(slider);
	}
	public void DeleteDataSlider(int id) {
		slidersModel.DeleteDataSlider(id);
	}
	public void UpdateDataSlider(Sliders slider) {
		slidersModel.UpdateDataSlider(slider);
	}
}
