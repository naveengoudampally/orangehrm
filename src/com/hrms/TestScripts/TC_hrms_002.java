package com.hrms.TestScripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.*;
/* Test Script Name : adding employee
 * Tester Name      : G Naveen Kumar
 * Date Created : 10/10/2020
 */

public class TC_hrms_002 {

//	public static void main(String[] args) throws Exception {
		//Test case steps
		/*1.open application
		 *2.login functionality
		 *3.navigate to pim menu
		 *4.navigate to sub menu add employee and click on it
		 *5.navigating to switch to frame
		 *6.adding details in add employee page
		 *7.navigating to default frame
		 *8.logout from application
		 *9.closeing browser	 *
		 */
	@Test
	public void tcm2() throws Exception{	
		DOMConfigurator.configure("log4j.xml");
		General g1=new General();
		
		g1.openapplication();
		g1.login();
		g1.pimmenu();
		g1.addemplink();
		g1.framein();
		g1.addempdetails();
		g1.frameout();
		g1.logout();
		g1.closebrowser();
	}
}


