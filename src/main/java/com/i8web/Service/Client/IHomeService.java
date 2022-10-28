package com.i8web.Service.Client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.i8web.entity.Client.Home;

public interface IHomeService {
	@Autowired
	public List<Home> GetDataHome();
}
