set projectLocation=G:\Naveen Workspace\Orangehrm_Framework
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testng.xml pause