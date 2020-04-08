public class UserMessagesScreen extends Screen {
    @Override
    public Screen process() {
        while (true) {
            System.out.println("Your friends");
            for (String  friend : loggedInUser.userFriends().getFriends()) {
                System.out.println(friend);
            }
            System.out.println("Input some user's username");
            String someUsername = getStringFromUser();
            User target = userRepository.getByUsername(someUsername);

            if (target != null && !(target.getUsername().equals(loggedInUser.getUsername()))) {
                PersonalMessageScreen personalMessageScreen = new PersonalMessageScreen(target);
                return personalMessageScreen;
            } else {
                System.out.println("No user with this username");

            }
        }
    }
}
