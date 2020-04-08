public class StartScreen extends Screen {
    public Screen process(){
        while (true) {
            System.out.println("1. Login");
            System.out.println("2. Register");
            int i = getIntegerFromUser();
            if (i == 1) {
                LoginScreen loginScreen = new LoginScreen();
                return loginScreen;
            } else if (i == 2) {
                RegistrationScreen registrationScreen = new RegistrationScreen();
                return registrationScreen;

            } else {
                System.out.println("Wrong input");
            }
        }
    }
}
