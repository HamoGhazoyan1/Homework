public class ChangePasswordScreen extends Screen {
    @Override
    public Screen process() {
        while (true) {
            System.out.println("Input old password");
            String pwd = getStringFromUser();
            if (pwd.equals(loggedInUser.getPassword())) {
                System.out.println("Input new password");
                loggedInUser.setPassword(getStringFromUser());
                System.out.println("Password changed successfully");
                UserHomeScreen userHomeScreen = new UserHomeScreen();
                return userHomeScreen;
            } else {
                System.out.println("Wrong password");
            }
        }
    }
}
