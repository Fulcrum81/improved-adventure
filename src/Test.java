public class Test {

    private static final String ERROR_MESSAGE = "Sorry, wrong username or password";

    public static void loginTest() {
        System.out.println("opening application");
        System.out.println("enter login and incorrect password");
        System.out.println("click login button");
        System.out.println("validate error message is: " + ERROR_MESSAGE);
    }

    public static void uploadFileLabelTest() {
        System.out.println("opening application");
        System.out.println("enter login and incorrect password");
        System.out.println("click login button");
        System.out.println("Label on the upload button should be: " + Labels.UPLOAD_FILE_BUTTON_TEXT);
    }
}
