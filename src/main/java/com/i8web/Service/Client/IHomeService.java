package com.i8web.Service.Client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

<<<<<<< HEAD
import com.i8web.entity.Client.Category;
=======
>>>>>>> nghia
import com.i8web.entity.Client.Home;

public interface IHomeService {
	@Autowired
<<<<<<< HEAD
	public List<Category> GetDataCategory();
	public List<Home> GetDataMobile();
	public List<Home> GetDataLaptop();
	public List<Home> GetDataProductNew();
	public List<Home> GetDataProductSale();
	public List<Home> GetSearchData(String key);
=======
	public List<Home> GetDataHome();
>>>>>>> nghia
}
