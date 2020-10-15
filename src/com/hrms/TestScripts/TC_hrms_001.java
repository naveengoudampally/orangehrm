package com.hrms.TestScripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.*;
/* Test Script Name : login functionality
 * Tester Name      : G Naveen Kumar
 * Date Created : 10/10/2020
 */
public class TC_hrms_001 {

//	public static void main(String[] args) throws Exception {
		
		
	//Test case steps
	/*1.open application
	 *2.wait statement
	 *3.verifying hrms title
	 *4.login functionality
	 *5.verifying page title
	 *6.verifying welcome text
	 *7.logout functionality
	 *8.close browser. 	
	 */
	@Test
	public void tcm1() throws Exception {
		DOMConfigurator.configure("log4j.xml");
		General g=new General();
		
		g.openapplication();
		g.waitstatement();
		g.verifyhrmstitle();
		g.login();
		g.verifytitle();
		g.verifywelcometext();
		g.logout();
		g.closebrowser();
		
	}	

	}


