package com.i8web.entity.Admin;
 
public class UserAccount{
	private int _id;
	private String _name;
	private String _email;
	private String _userName;
	private String _passWord;
	public int get_id() {
		return _id;
	}
	public void set_id(int _id) {
		this._id = _id;
	}
	public String get_name() {
		return _name;
	}
	public void set_name(String _name) {
		this._name = _name;
	}
	public String get_email() {
		return _email;
	}
	public void set_email(String _email) {
		this._email = _email;
	}
	public String get_userName() {
		return _userName;
	}
	public void set_userName(String _userName) {
		this._userName = _userName;
	}
	public String get_passWord() {
		return _passWord;
	}
	public void set_passWord(String _passWord) {
		this._passWord = _passWord;
	}
}