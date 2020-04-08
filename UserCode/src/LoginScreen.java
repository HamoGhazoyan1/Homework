public class LoginScreen extends Screen {
    public Screen process() {
        while (true) {
            System.out.println("Input username");
            String username = getStringFromUser();
            System.out.println("Input password");
            String password = getStringFromUser();
        if(username.equals(admin.getUsername()) && password.equals(admin.getPassword())){
            loggedInUser = admin;
            AdminHomeScreen adminHomeScreen = new AdminHomeScreen();
            return adminHomeScreen;
        }else {}
            User user = userRepository.getByUsernameAndPassword(username, password);
            if (user == null) {
                System.out.println("Wrong username password");
                continue;
            }
            System.out.println("Login successful");
            loggedInUser = user;
            UserHomeScreen userHomeScreen = new UserHomeScreen();
            return userHomeScreen;

        }
    }

}
