package com.Opencart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class RegistrationTest {
    public  static WebDriver driver;

    public static void main(String[] args) {

        launch_Chrome();
        openURL();

        TC_Reg_001();
        TC_Reg_002();
        TC_Reg_003();
        TC_Reg_004();
        TC_Reg_005();
        TC_Reg_006();
        TC_Reg_007();
        TC_Reg_008();
        TC_Reg_009();
        TC_Reg_010();
        TC_Reg_011();
        TC_Reg_012();

        close_Chrome();

    }

    public  static void launch_Chrome(){

        System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();                                // for windows maximization

    }

    public static  void openURL(){
        driver.get("https://demo.opencart.com/index.php?route=account/register");

    }

    // All Valid Data
    public static void TC_Reg_001(){

        WebElement Firstname= driver.findElement(By.name("firstname"));                 // first name
        Firstname.clear();
        Firstname.sendKeys("Kazi111");

        WebElement Lastname= driver.findElement(By.name("lastname"));                  //Last name
        Lastname.clear();
        Lastname.sendKeys("Sifat222");

        WebElement Email= driver.findElement(By.name("email"));                        //Email
        Email.clear();
        Email.sendKeys("sifat3333@email.com");

        WebElement Telephone= driver.findElement(By.name("telephone"));                 //Telephone
        Telephone.clear();
        Telephone.sendKeys("02020303030");

        WebElement Password= driver.findElement(By.name("password"));                   //Password
        Password.clear();
        Password.sendKeys("1234567");

        WebElement Con_Password= driver.findElement(By.name("confirm"));                //Confirm Password
        Con_Password.clear();
        Con_Password.sendKeys("1234567");

        WebElement AgreeBtn= driver.findElement(By.name("agree"));                     // Policy Checkbox
        //AgreeBtn.clear();
        AgreeBtn.click();

        WebElement ContinueBtn= driver.findElement(By.cssSelector("#content > form > div > div > input.btn.btn-primary"));     // Reg Button
        // AgreeBtn.clear();
        ContinueBtn.click();

        // Test Case Verification

        String Expected_Title="Your Account Has Been Created!";
        String Actual_title=driver.getTitle();


        if(Expected_Title.equals(Actual_title)){
            System.out.println("Test Case Passed, Account Created.");
        }
        else {
            System.out.println("Test Case failed.");
        }

        // Logout
        WebElement Logout=driver.findElement(By.linkText("Logout"));
        Logout.click();

        WebElement LoginPage=driver.findElement(By.linkText("Register"));
        LoginPage.click();

        System.out.println("TC_Reg_001 Completed");



}
        //All Blank Field Data
    public static void TC_Reg_002(){

        WebElement Firstname= driver.findElement(By.name("firstname"));                 // first name
        Firstname.clear();
        Firstname.sendKeys("");

        WebElement Lastname= driver.findElement(By.name("lastname"));                  //Last name
        Lastname.clear();
        Lastname.sendKeys("");

        WebElement Email= driver.findElement(By.name("email"));                        //Email
        Email.clear();
        Email.sendKeys("");

        WebElement Telephone= driver.findElement(By.name("telephone"));                 //Telephone
        Telephone.clear();
        Telephone.sendKeys("");

        WebElement Password= driver.findElement(By.name("password"));                   //Password
        Password.clear();
        Password.sendKeys("");

        WebElement Con_Password= driver.findElement(By.name("confirm"));                //Confirm Password
        Con_Password.clear();
        Con_Password.sendKeys("");

        WebElement AgreeBtn= driver.findElement(By.name("agree"));                     // Policy Checkbox
        //AgreeBtn.clear();
        AgreeBtn.click();

        WebElement ContinueBtn= driver.findElement(By.cssSelector("#content > form > div > div > input.btn.btn-primary"));     // Reg Button
        // AgreeBtn.clear();
        ContinueBtn.click();

        // Test Case Verification

        String Expected_Title="Register Account";
        String Actual_title=driver.getTitle();


        if(Expected_Title.equals(Actual_title)){
            System.out.println("Test Case Passed");
        }
        else {
            System.out.println("Test Case failed.");
        }

        // Logout
//        WebElement Logout=driver.findElement(By.linkText("Logout"));
//        Logout.click();
//
//        WebElement LoginPage=driver.findElement(By.linkText("Register"));
//        LoginPage.click();
//
        System.out.println("TC_Reg_002 Completed");



    }

    //All Invalid Data
    public static void TC_Reg_003(){

        WebElement Firstname= driver.findElement(By.name("firstname"));                 // first name
        Firstname.clear();
        Firstname.sendKeys("Kazi123456789654123569874123658941");

        WebElement Lastname= driver.findElement(By.name("lastname"));                  //Last name
        Lastname.clear();
        Lastname.sendKeys("Sifat123456789654123569874123658941");

        WebElement Email= driver.findElement(By.name("email"));                        //Email
        Email.clear();
        Email.sendKeys("sifat22355email.com");

        WebElement Telephone= driver.findElement(By.name("telephone"));                 //Telephone
        Telephone.clear();
        Telephone.sendKeys("85");

        WebElement Password= driver.findElement(By.name("password"));                   //Password
        Password.clear();
        Password.sendKeys("1");

        WebElement Con_Password= driver.findElement(By.name("confirm"));                //Confirm Password
        Con_Password.clear();
        Con_Password.sendKeys("12");

        WebElement AgreeBtn= driver.findElement(By.name("agree"));                     // Policy Checkbox
        //AgreeBtn.clear();
        AgreeBtn.click();

        WebElement ContinueBtn= driver.findElement(By.cssSelector("#content > form > div > div > input.btn.btn-primary"));     // Reg Button
        // AgreeBtn.clear();
        ContinueBtn.click();

        // Test Case Verification

        String Expected_Title="Register Account";
        String Actual_title=driver.getTitle();


        if(Expected_Title.equals(Actual_title)){
            System.out.println("Test Case Passed");
        }
        else {
            System.out.println("Test Case failed.");
        }

        //Logout
//        WebElement Logout=driver.findElement(By.linkText("Logout"));
//        Logout.click();
//
//        WebElement LoginPage=driver.findElement(By.linkText("Register"));
//        LoginPage.click();

        System.out.println("TC_Reg_003 Completed");



    }
        //With Existing Email Check
    public static void TC_Reg_004(){

        WebElement Firstname= driver.findElement(By.name("firstname"));                 // first name
        Firstname.clear();
        Firstname.sendKeys("Kazi130");

        WebElement Lastname= driver.findElement(By.name("lastname"));                  //Last name
        Lastname.clear();
        Lastname.sendKeys("Sifat232");

        WebElement Email= driver.findElement(By.name("email"));                        //Email
        Email.clear();
        Email.sendKeys("sifat3@email.com");

        WebElement Telephone= driver.findElement(By.name("telephone"));                 //Telephone
        Telephone.clear();
        Telephone.sendKeys("8529635435742");

        WebElement Password= driver.findElement(By.name("password"));                   //Password
        Password.clear();
        Password.sendKeys("123453");

        WebElement Con_Password= driver.findElement(By.name("confirm"));                //Confirm Password
        Con_Password.clear();
        Con_Password.sendKeys("123453");

        WebElement AgreeBtn= driver.findElement(By.name("agree"));                     // Policy Checkbox
        //AgreeBtn.clear();
        AgreeBtn.click();

        WebElement ContinueBtn= driver.findElement(By.cssSelector("#content > form > div > div > input.btn.btn-primary"));     // Reg Button
        // AgreeBtn.clear();
        ContinueBtn.click();

        // Test Case Verification

        String Expected_Title="Register Account";
        String Actual_title=driver.getTitle();


        if(Expected_Title.equals(Actual_title)){
            System.out.println("Test Case Passed.");
        }
        else {
            System.out.println("Test Case failed.");
        }

        //Logout
//        WebElement Logout=driver.findElement(By.linkText("Logout"));
//        Logout.click();
//
//        WebElement LoginPage=driver.findElement(By.linkText("Register"));
//        LoginPage.click();
//
        System.out.println("TC_Reg_004 Completed");




    }

    //First Name Invalid, With All Other Valid Data

    public static void TC_Reg_005(){

        WebElement Firstname= driver.findElement(By.name("firstname"));                 // first name
        Firstname.clear();
        Firstname.sendKeys("Kazi12345678912345678912345678912345");

        WebElement Lastname= driver.findElement(By.name("lastname"));                  //Last name
        Lastname.clear();
        Lastname.sendKeys("Sifat");

        WebElement Email= driver.findElement(By.name("email"));                        //Email
        Email.clear();
        Email.sendKeys("kazi1@email.com");

        WebElement Telephone= driver.findElement(By.name("telephone"));                 //Telephone
        Telephone.clear();
        Telephone.sendKeys("12345678");

        WebElement Password= driver.findElement(By.name("password"));                   //Password
        Password.clear();
        Password.sendKeys("12345");

        WebElement Con_Password= driver.findElement(By.name("confirm"));                //Confirm Password
        Con_Password.clear();
        Con_Password.sendKeys("12345");

        WebElement AgreeBtn= driver.findElement(By.name("agree"));                     // Policy Checkbox
        //AgreeBtn.clear();
        AgreeBtn.click();

        WebElement ContinueBtn= driver.findElement(By.cssSelector("#content > form > div > div > input.btn.btn-primary"));     // Reg Button
        // AgreeBtn.clear();
        ContinueBtn.click();

        // Test Case Verification

        String Expected_Title="Register Account";
        String Actual_title=driver.getTitle();


        if(Expected_Title.equals(Actual_title)){
            System.out.println("Test Case Passed");
        }
        else {
            System.out.println("Test Case failed.");
        }

        // Logout
//        WebElement Logout=driver.findElement(By.linkText("Logout"));
//        Logout.click();
//
//        WebElement LoginPage=driver.findElement(By.linkText("Register"));
//        LoginPage.click();
//
        System.out.println("TC_Reg_005 Completed");
    }

    //Last Name Invalid, With All Other Valid Data
    public static void TC_Reg_006(){

        WebElement Firstname= driver.findElement(By.name("firstname"));                 // first name
        Firstname.clear();
        Firstname.sendKeys("Kazi");

        WebElement Lastname= driver.findElement(By.name("lastname"));                  //Last name
        Lastname.clear();
        Lastname.sendKeys("Sifat12345678912345678912345678912345");

        WebElement Email= driver.findElement(By.name("email"));                        //Email
        Email.clear();
        Email.sendKeys("kazi00@email.com");

        WebElement Telephone= driver.findElement(By.name("telephone"));                 //Telephone
        Telephone.clear();
        Telephone.sendKeys("12345678");

        WebElement Password= driver.findElement(By.name("password"));                   //Password
        Password.clear();
        Password.sendKeys("123456");

        WebElement Con_Password= driver.findElement(By.name("confirm"));                //Confirm Password
        Con_Password.clear();
        Con_Password.sendKeys("123456");

        WebElement AgreeBtn= driver.findElement(By.name("agree"));                     // Policy Checkbox
        //AgreeBtn.clear();
        AgreeBtn.click();

        WebElement ContinueBtn= driver.findElement(By.cssSelector("#content > form > div > div > input.btn.btn-primary"));     // Reg Button
        // AgreeBtn.clear();
        ContinueBtn.click();

        // Test Case Verification

        String Expected_Title="Register Account";
        String Actual_title=driver.getTitle();


        if(Expected_Title.equals(Actual_title)){
            System.out.println("Test Case Passed");
        }
        else {
            System.out.println("Test Case failed.");
        }

        // Logout
//        WebElement Logout=driver.findElement(By.linkText("Logout"));
//        Logout.click();
//
//        WebElement LoginPage=driver.findElement(By.linkText("Register"));
//        LoginPage.click();
//
        System.out.println("TC_Reg_007 Completed");

    }

    //Email Without ".com" Included, With All Other Valid Data
    public static void TC_Reg_007(){

        WebElement Firstname= driver.findElement(By.name("firstname"));                 // first name
        Firstname.clear();
        Firstname.sendKeys("Kazi1");

        WebElement Lastname= driver.findElement(By.name("lastname"));                  //Last name
        Lastname.clear();
        Lastname.sendKeys("Sifat1");

        WebElement Email= driver.findElement(By.name("email"));                        //Email
        Email.clear();
        Email.sendKeys("sifat12@email");

        WebElement Telephone= driver.findElement(By.name("telephone"));                 //Telephone
        Telephone.clear();
        Telephone.sendKeys("123456789");

        WebElement Password= driver.findElement(By.name("password"));                   //Password
        Password.clear();
        Password.sendKeys("123456");

        WebElement Con_Password= driver.findElement(By.name("confirm"));                //Confirm Password
        Con_Password.clear();
        Con_Password.sendKeys("123456");

        WebElement AgreeBtn= driver.findElement(By.name("agree"));                     // Policy Checkbox
        //AgreeBtn.clear();
        AgreeBtn.click();

        WebElement ContinueBtn= driver.findElement(By.cssSelector("#content > form > div > div > input.btn.btn-primary"));     // Reg Button
        // AgreeBtn.clear();
        ContinueBtn.click();

        // Test Case Verification

        String Expected_Title="Register Account";
        String Actual_title=driver.getTitle();


        if(Expected_Title.equals(Actual_title)){
            System.out.println("Test Case Passed");
        }
        else {
            System.out.println("Test Case failed.");
        }

        // Logout
//        WebElement Logout=driver.findElement(By.linkText("Logout"));
//        Logout.click();
//
//        WebElement LoginPage=driver.findElement(By.linkText("Register"));
//        LoginPage.click();
//
        System.out.println("TC_Reg_007 Completed");

    }

    //Email Without "@" Sign, With All Other Valid Data
    public static void TC_Reg_008(){

        WebElement Firstname= driver.findElement(By.name("firstname"));                 // first name
        Firstname.clear();
        Firstname.sendKeys("Kazi12");

        WebElement Lastname= driver.findElement(By.name("lastname"));                  //Last name
        Lastname.clear();
        Lastname.sendKeys("Sifat12");

        WebElement Email= driver.findElement(By.name("email"));                        //Email
        Email.clear();
        Email.sendKeys("kazi122email.com");

        WebElement Telephone= driver.findElement(By.name("telephone"));                 //Telephone
        Telephone.clear();
        Telephone.sendKeys("123456780");

        WebElement Password= driver.findElement(By.name("password"));                   //Password
        Password.clear();
        Password.sendKeys("123654");

        WebElement Con_Password= driver.findElement(By.name("confirm"));                //Confirm Password
        Con_Password.clear();
        Con_Password.sendKeys("123654");

        WebElement AgreeBtn= driver.findElement(By.name("agree"));                     // Policy Checkbox
        //AgreeBtn.clear();
        AgreeBtn.click();

        WebElement ContinueBtn= driver.findElement(By.cssSelector("#content > form > div > div > input.btn.btn-primary"));     // Reg Button
        // AgreeBtn.clear();
        ContinueBtn.click();

        // Test Case Verification

        String Expected_Title="Register Account";
        String Actual_title=driver.getTitle();


        if(Expected_Title.equals(Actual_title)){
            System.out.println("Test Case Passed");
        }
        else {
            System.out.println("Test Case failed.");
        }

        // Logout
//        WebElement Logout=driver.findElement(By.linkText("Logout"));
//        Logout.click();
//
//        WebElement LoginPage=driver.findElement(By.linkText("Register"));
//        LoginPage.click();
//
        System.out.println("TC_Reg_008 Completed");

    }

    //Telephone Number Invalid, With All Other Valid Data
    public static void TC_Reg_009(){

        WebElement Firstname= driver.findElement(By.name("firstname"));                 // first name
        Firstname.clear();
        Firstname.sendKeys("Kazi123");

        WebElement Lastname= driver.findElement(By.name("lastname"));                  //Last name
        Lastname.clear();
        Lastname.sendKeys("Sifat123");

        WebElement Email= driver.findElement(By.name("email"));                        //Email
        Email.clear();
        Email.sendKeys("kazi123@email.com");

        WebElement Telephone= driver.findElement(By.name("telephone"));                 //Telephone
        Telephone.clear();
        Telephone.sendKeys("52");

        WebElement Password= driver.findElement(By.name("password"));                   //Password
        Password.clear();
        Password.sendKeys("321654");

        WebElement Con_Password= driver.findElement(By.name("confirm"));                //Confirm Password
        Con_Password.clear();
        Con_Password.sendKeys("321654");

        WebElement AgreeBtn= driver.findElement(By.name("agree"));                     // Policy Checkbox
        //AgreeBtn.clear();
        AgreeBtn.click();

        WebElement ContinueBtn= driver.findElement(By.cssSelector("#content > form > div > div > input.btn.btn-primary"));     // Reg Button
        // AgreeBtn.clear();
        ContinueBtn.click();

        // Test Case Verification

        String Expected_Title="Register Account";
        String Actual_title=driver.getTitle();


        if(Expected_Title.equals(Actual_title)){
            System.out.println("Test Case Passed");
        }
        else {
            System.out.println("Test Case failed.");
        }

        // Logout
//        WebElement Logout=driver.findElement(By.linkText("Logout"));
//        Logout.click();
//
//        WebElement LoginPage=driver.findElement(By.linkText("Register"));
//        LoginPage.click();
//
        System.out.println("TC_Reg_009 Completed");

    }

    //Both Passwords Filed Invalid, With All Other Valid Data
    public static void TC_Reg_010(){

        WebElement Firstname= driver.findElement(By.name("firstname"));                 // first name
        Firstname.clear();
        Firstname.sendKeys("Kazi321");

        WebElement Lastname= driver.findElement(By.name("lastname"));                  //Last name
        Lastname.clear();
        Lastname.sendKeys("Sifat321");

        WebElement Email= driver.findElement(By.name("email"));                        //Email
        Email.clear();
        Email.sendKeys("kazi321@email.com");

        WebElement Telephone= driver.findElement(By.name("telephone"));                 //Telephone
        Telephone.clear();
        Telephone.sendKeys("123654987");

        WebElement Password= driver.findElement(By.name("password"));                   //Password
        Password.clear();
        Password.sendKeys("321");

        WebElement Con_Password= driver.findElement(By.name("confirm"));                //Confirm Password
        Con_Password.clear();
        Con_Password.sendKeys("321");

        WebElement AgreeBtn= driver.findElement(By.name("agree"));                     // Policy Checkbox
        //AgreeBtn.clear();
        AgreeBtn.click();

        WebElement ContinueBtn= driver.findElement(By.cssSelector("#content > form > div > div > input.btn.btn-primary"));     // Reg Button
        // AgreeBtn.clear();
        ContinueBtn.click();

        // Test Case Verification

        String Expected_Title="Register Account";
        String Actual_title=driver.getTitle();


        if(Expected_Title.equals(Actual_title)){
            System.out.println("Test Case Passed");
        }
        else {
            System.out.println("Test Case failed.");
        }

        // Logout
//        WebElement Logout=driver.findElement(By.linkText("Logout"));
//        Logout.click();
//
//        WebElement LoginPage=driver.findElement(By.linkText("Register"));
//        LoginPage.click();
//
        System.out.println("TC_Reg_010 Completed");

    }

    //One Password Valid But Confirmation Password Invalid, With All Other Valid Data
    public static void TC_Reg_011(){

        WebElement Firstname= driver.findElement(By.name("firstname"));                 // first name
        Firstname.clear();
        Firstname.sendKeys("Kazi1234");

        WebElement Lastname= driver.findElement(By.name("lastname"));                  //Last name
        Lastname.clear();
        Lastname.sendKeys("Sifat1234");

        WebElement Email= driver.findElement(By.name("email"));                        //Email
        Email.clear();
        Email.sendKeys("kazi1234@email.com");

        WebElement Telephone= driver.findElement(By.name("telephone"));                 //Telephone
        Telephone.clear();
        Telephone.sendKeys("123456854");

        WebElement Password= driver.findElement(By.name("password"));                   //Password
        Password.clear();
        Password.sendKeys("15634");

        WebElement Con_Password= driver.findElement(By.name("confirm"));                //Confirm Password
        Con_Password.clear();
        Con_Password.sendKeys("15689");

        WebElement AgreeBtn= driver.findElement(By.name("agree"));                     // Policy Checkbox
        //AgreeBtn.clear();
        AgreeBtn.click();

        WebElement ContinueBtn= driver.findElement(By.cssSelector("#content > form > div > div > input.btn.btn-primary"));     // Reg Button
        // AgreeBtn.clear();
        ContinueBtn.click();

        // Test Case Verification

        String Expected_Title="Register Account";
        String Actual_title=driver.getTitle();


        if(Expected_Title.equals(Actual_title)){
            System.out.println("Test Case Passed");
        }
        else {
            System.out.println("Test Case failed.");
        }

        // Logout
//        WebElement Logout=driver.findElement(By.linkText("Logout"));
//        Logout.click();
//
//        WebElement LoginPage=driver.findElement(By.linkText("Register"));
//        LoginPage.click();
//
        System.out.println("TC_Reg_011 Completed");


    }

    //Policy Checkbox Invalid, With All Other Valid Data
    public static void TC_Reg_012(){

        WebElement Firstname= driver.findElement(By.name("firstname"));                 // first name
        Firstname.clear();
        Firstname.sendKeys("Kazi4321");

        WebElement Lastname= driver.findElement(By.name("lastname"));                  //Last name
        Lastname.clear();
        Lastname.sendKeys("Sifat4321");

        WebElement Email= driver.findElement(By.name("email"));                        //Email
        Email.clear();
        Email.sendKeys("kazi4321@email.com");

        WebElement Telephone= driver.findElement(By.name("telephone"));                 //Telephone
        Telephone.clear();
        Telephone.sendKeys("526489");

        WebElement Password= driver.findElement(By.name("password"));                   //Password
        Password.clear();
        Password.sendKeys("123456");

        WebElement Con_Password= driver.findElement(By.name("confirm"));                //Confirm Password
        Con_Password.clear();
        Con_Password.sendKeys("123456");

        WebElement AgreeBtn= driver.findElement(By.name("agree"));                     // Policy Checkbox
        //AgreeBtn.clear();
        //AgreeBtn.click();

        WebElement ContinueBtn= driver.findElement(By.cssSelector("#content > form > div > div > input.btn.btn-primary"));     // Reg Button
        // AgreeBtn.clear();
        ContinueBtn.click();

        // Test Case Verification

        String Expected_Title="Register Account";
        String Actual_title=driver.getTitle();


        if(Expected_Title.equals(Actual_title)){
            System.out.println("Test Case Passed");
        }
        else {
            System.out.println("Test Case failed.");
        }

        // Logout
//        WebElement Logout=driver.findElement(By.linkText("Logout"));
//        Logout.click();
//
//        WebElement LoginPage=driver.findElement(By.linkText("Register"));
//        LoginPage.click();
//
        System.out.println("TC_Reg_012 Completed");




    }

    //Email and Telephone Invalid, With All Other Valid Data
    public static void TC_Reg_013(){
        WebElement Firstname= driver.findElement(By.name("firstname"));                 // first name
        Firstname.clear();
        Firstname.sendKeys("Kazi4321");

        WebElement Lastname= driver.findElement(By.name("lastname"));                  //Last name
        Lastname.clear();
        Lastname.sendKeys("Sifat4321");

        WebElement Email= driver.findElement(By.name("email"));                        //Email
        Email.clear();
        Email.sendKeys("kazi4321email.com");

        WebElement Telephone= driver.findElement(By.name("telephone"));                 //Telephone
        Telephone.clear();
        Telephone.sendKeys("5");

        WebElement Password= driver.findElement(By.name("password"));                   //Password
        Password.clear();
        Password.sendKeys("123456");

        WebElement Con_Password= driver.findElement(By.name("confirm"));                //Confirm Password
        Con_Password.clear();
        Con_Password.sendKeys("123456");

        WebElement AgreeBtn= driver.findElement(By.name("agree"));                     // Policy Checkbox
        //AgreeBtn.clear();
        AgreeBtn.click();

        WebElement ContinueBtn= driver.findElement(By.cssSelector("#content > form > div > div > input.btn.btn-primary"));     // Reg Button
        // AgreeBtn.clear();
        ContinueBtn.click();

        // Test Case Verification

        String Expected_Title="Register Account";
        String Actual_title=driver.getTitle();


        if(Expected_Title.equals(Actual_title)){
            System.out.println("Test Case Passed");
        }
        else {
            System.out.println("Test Case failed.");
        }

        // Logout
//        WebElement Logout=driver.findElement(By.linkText("Logout"));
//        Logout.click();
//
//        WebElement LoginPage=driver.findElement(By.linkText("Register"));
//        LoginPage.click();
//
        System.out.println("TC_Reg_013 Completed");

    }
    public static void TC_Reg_014(){


    }
    public static void TC_Reg_015(){


    }
    public static void TC_Reg_016(){


    }
    public static void TC_Reg_017(){


    }



    public  static void close_Chrome(){

        driver.close();

    }

}
