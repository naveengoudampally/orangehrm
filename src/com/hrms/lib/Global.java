package com.hrms.lib;

import org.openqa.selenium.WebDriver;

public class Global {
    //Test data for TC_hrms_001
	public WebDriver driver;
	public String url="http://127.0.0.1/orangehrm-2.6/login.php";
	public String un="admin";
	public String pw="admin";
	
	//objects for TC_hrms_001
	public String txt_name_loginname="txtUserName";
	public String txt_name_password="txtPassword";
	public String btn_login="Submit";
	public String link_logout="Logout";
	
	//Test data for TC_hrms_002
	public String fn="ranjith";
	public String ln="kumar";
	//objects for TC_hrms_002
	
	public String btn_value_add="//input[@value='Add']";
	public String txt_name_firstname="txtEmpFirstName";
	public String txt_name_lastname="txtEmpLastName";
	public String btn_id_save="btnEdit";
	public String link_pim="PIM";
	public String link_add="Add Employee";
	
	//objects for TC_hrms_003
	public String check_box="//input[@value='0003']";
	
	public String btn_value_del="//input[@value='Delete']";
	
	
	
	
}
