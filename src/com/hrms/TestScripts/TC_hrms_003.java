package com.hrms.TestScripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.*;
/* Test Script Name : deleting employee
 * Tester Name      : G Naveen Kumar
 * Date Created : 10/10/2020
 */

public class TC_hrms_003 {

	//public static void main(String[] args) throws Exception {
	//Test case steps
		/*1.open application
		 *2.login functionality
		 *3.deleting employee
		 *4.logout from application
		 *5.closing browser.*/
		
	    @Test
		public void tcm3() throws Exception{
	    DOMConfigurator.configure("log4j.xml");
		General g3=new General();
		
		g3.openapplication();
		g3.login();
		g3.del();
		g3.logout();
		g3.closebrowser();
		

	}

}
