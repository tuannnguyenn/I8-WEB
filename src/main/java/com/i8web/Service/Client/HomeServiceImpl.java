package com.i8web.Service.Client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.i8web.entity.Client.Home;
import com.i8web.model.Client.HomeModel;

@Service
public class HomeServiceImpl implements IHomeService {
	@Autowired
	private HomeModel homeModel;
	public List<Home> GetDataHome(){
		return homeModel.GetDataHome();
	}
	
}
