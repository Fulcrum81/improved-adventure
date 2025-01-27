import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import static org.testng.Assert.*;

public class LoginTest {

    @BeforeSuite
    public void suiteSetup() {
        System.out.println("-This is suite setup====================");
    }

    @AfterSuite
    public void suiteTeardown() {
        System.out.println("-This is suite teardown====================");
    }

    @BeforeTest
    public void testSetup() {
        System.out.println("--This is test setup===================");
    }

    @BeforeGroups({"smoke", "regression"})
    public void groupSetup() {
        System.out.println("---This is group setup===================");
    }

    @AfterGroups({"smoke", "regression"})
    public void groupTeardown() {
        System.out.println("---This is group teardown===================");
    }

    @AfterTest
    public void testTeardown() {
        System.out.println("--This is test teardown===================");

    }

    @BeforeClass
    public void classSetup() {
        System.out.println("----This is class setup===================");
    }

    @AfterClass
    public void classTeardown() {
        System.out.println("----This is class teardown===================");
    }

    @BeforeMethod
    public void methodSetup() {
        System.out.println("-----This is method setup===================");
    }

    @AfterMethod
    public void methodTeardown() {
        System.out.println("-----This is method teardown===================");
    }

    @Test(groups = "smoke") // TODO: disabled due to defect ABC-12345
    public void myFirstTest() {
        System.out.println("Hello Test!");

        SoftAssert softAssert = new SoftAssert();

        boolean loginButtonIsVisible = false;
        boolean forgotPasswordButtonIsVisible = true;

        softAssert.assertTrue(loginButtonIsVisible, "Login button is not visible");
        softAssert.assertTrue(forgotPasswordButtonIsVisible, "Forgot password button is not visible");

        softAssert.assertAll();
    }

    @Test(groups = "regression")
    public void mySecondTest() {
        System.out.println("Goodbye Test!");
        String expectedButtonText = "Login";
        String actualButtonText = "Logon";

        assertEquals(actualButtonText, expectedButtonText, "Wrong Login button text");
    }

    @Test(groups = "regression")
    public void myThirdTest() throws InterruptedException {
        System.out.println("Another Test!");
        Thread.sleep(5000);
        fail("I'm a failure");
    }

    @Test
    public void shouldReturn5() throws InterruptedException {
//        String expectedResult = "I have a BMW and it's max speed id 250";
//
//        Car bmw = new Car("BMW", 250);
//
//        assertEquals(bmw.getCarInfo(), expectedResult);
        int result = Main.divideTwoNumbers(10, 2);
        Thread.sleep(5000);
        assertEquals(result, 55);
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void shouldThrowArithmeticException() throws InterruptedException {
        Thread.sleep(5000);
        Main.divideTwoNumbers(10, 0);
    }

    @Test(dataProvider = "creds")
    public void loginWithIncorrectCredentials(int userEntry) throws InterruptedException {
        Thread.sleep(5000);
        System.out.println("User enters " + userEntry + " in the field");
        String actualMessage = "Number is greater than 50";

//        assertEquals(actualMessage, message);
    }

    @DataProvider(name = "creds")
    public Object[][] credentialsProvider() {
        return new Object[][] {
                { 5 },
                { -50 },
                { 100 },
        };
    }

//    @Test
//    @Parameters({"login", "password"})
//    public void loginTest(String login, String password) {
//        System.out.println("User enters " + login + " in login field");
//        System.out.println("User enters " + password + " in password field");
//
//    }
}
