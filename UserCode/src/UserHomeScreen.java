public class UserHomeScreen extends Screen {
    @Override
    public Screen process() {
        while (true) {
            System.out.println("New Announcements");
            for (Announcements announcement : announcements) {
                boolean annouc = announcement.newAnnouncement(announcement, loggedInUser.getUsername());
                if (!annouc) {
                    System.out.println(announcement.getAnnouncement());
                    announcement.addReaders(loggedInUser.getUsername());
                }
            }

            System.out.println("1. Messages");
            System.out.println("2. Log Out");
            System.out.println("3. Announcements");
            System.out.println("4. Change password");
            System.out.println("5. My friends");
            int i = getIntegerFromUser();
            if (i == 1) {
                UserMessagesScreen userMessagesScreen = new UserMessagesScreen();
                return userMessagesScreen;
            } else if (i == 2) {
                System.out.println("Logged out");
                loggedInUser = null;
                StartScreen startScreen = new StartScreen();
                return startScreen;
            } else if (i == 3) {
                System.out.println("All announcements");
                for (Announcements announcement : announcements) {
                    System.out.println(announcement.getAnnouncement());
                }
                System.out.println("1. Go back");
                int x = getIntegerFromUser();
                UserHomeScreen userHomeScreen = new UserHomeScreen();
                if (x == 1) {
                    return userHomeScreen;
                } else {
                    System.out.println("Wrong input");
                    return userHomeScreen;
                }
            } else if (i == 4) {
                ChangePasswordScreen changePasswordScreen = new ChangePasswordScreen();
                return changePasswordScreen;
            } else if (i == 5) {
                UserFriendsScreen userFriendsScreen = new UserFriendsScreen();
                return userFriendsScreen;
            }else{
                System.out.println("Wrong input");
            }
        }
    }
}
