public class RegistrationScreen extends Screen {
    public Screen
    process() {
        while (true) {
            System.out.println("Input username");
            String username = getStringFromUser();
            boolean adminExist = false;

            if (username.equals(admin.getUsername())) {
                System.out.println("You cannot create ADMIN");
                adminExist = true;
                continue;
            } else {
                boolean userExistsByUsername = userRepository.checkIfExistsByUsername(username);
                if (userExistsByUsername) {
                    System.out.println("Username already exist. Try again");
                    continue;
                }
            }



            System.out.println("Input password");
            String password = getStringFromUser();
            User user = new User(username, password);
            userRepository.save(user);
            System.out.println("Successfully created new user with username " + username);
            StartScreen startScreen = new StartScreen();
            return startScreen;

        }
    }
}
