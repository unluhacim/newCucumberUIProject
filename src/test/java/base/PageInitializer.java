package base;

import pages.LoginPage;

public class PageInitializer extends BaseTest{

    public static LoginPage loginPage;


    public static void initialize(){

        loginPage=new LoginPage();
    }

}
