package com.i8web.Service.Client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

<<<<<<< HEAD
import com.i8web.entity.Client.Category;
=======
>>>>>>> nghia
import com.i8web.entity.Client.Home;
import com.i8web.model.Client.HomeModel;

@Service
public class HomeServiceImpl implements IHomeService {
	@Autowired
	private HomeModel homeModel;
<<<<<<< HEAD
	public List<Category> GetDataCategory(){
		return homeModel.GetDataCategory();
	}
	public List<Home> GetDataMobile() {
		return homeModel.GetDataMobile();
	}
	public List<Home> GetDataLaptop() {
		return homeModel.GetDataLaptop();
	}
	public List<Home> GetDataProductNew() {
		return homeModel.GetDataProductNew();
	}
	public List<Home> GetDataProductSale() {
		return homeModel.GetDataProductSale();
	}
	public List<Home> GetSearchData(String key) {
		return homeModel.GetSearchData(key);
	}
=======
	public List<Home> GetDataHome(){
		return homeModel.GetDataHome();
	}
	
>>>>>>> nghia
}
