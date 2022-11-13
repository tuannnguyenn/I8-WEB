package com.i8web.model.Admin;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.i8web.entity.Admin.MapperSliders;
import com.i8web.entity.Admin.Sliders;

@Repository
public class SlidersModel {
    @Autowired
	public JdbcTemplate _jdbcTemplate;
    public List<Sliders> GetListSliders(){
        List<Sliders> list = new ArrayList<Sliders>();
        String sql = "SELECT * FROM sliders";
        list = _jdbcTemplate.query(sql,new MapperSliders());
        return list;
    }
    public List<Sliders> GetSliderById(int id){
        List<Sliders> list = new ArrayList<Sliders>();
        String sql = "SELECT * FROM sliders WHERE id = " + id;
        list = _jdbcTemplate.query(sql,new MapperSliders());
        return list;
    }
    public void InsertDataSlider(Sliders slider){
        String sql = "INSERT INTO sliders(image,created_at)" + "VALUES(?,?)";
        _jdbcTemplate.update(sql,slider.getImage(),LocalDate.now().toString());
    }
    public void DeleteDataSlider(int id){
        String sql = "DELETE FROM sliders WHERE id = " + id;
        _jdbcTemplate.update(sql);
    }
    public void UpdateDataSlider(Sliders slider){
        String sql = "UPDATE sliders SET image = ?,created_at =? WHERE id = ?";
        _jdbcTemplate.update(sql,slider.getImage(),LocalDate.now().toString(),slider.getId());
    }
}
