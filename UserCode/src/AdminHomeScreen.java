public class AdminHomeScreen extends Screen {
    @Override
    public Screen process() {
        while (true) {
            System.out.println("ADMIN HOME PAGE!!!");
            System.out.println("1.Create announcement");
            System.out.println("2.Log out");
            int i = getIntegerFromUser();
            if (i == 1) {
                CreateAnnouncementScreen createAnnouncementScreen = new CreateAnnouncementScreen();
                return createAnnouncementScreen;
            } else if (i == 2) {
                System.out.println("Logged out");
                loggedInUser = null;
                StartScreen startScreen = new StartScreen();
                return startScreen;
            } else {
                System.out.println("Wrong input");
                continue;
            }
        }
    }
}
