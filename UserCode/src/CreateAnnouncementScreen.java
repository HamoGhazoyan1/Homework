import java.util.ArrayList;

public class CreateAnnouncementScreen extends Screen {


    @Override
    public Screen process() {

        System.out.println("Create an announcement");
        Announcements newAnn = new Announcements();
        newAnn.addReaders(admin.getUsername());
        newAnn.setAnnouncement(getStringFromUser());
        announcements.add(newAnn);
        System.out.println("Announcement created successfully");
        while (true) {
            System.out.println("1. Create new announcement");
            System.out.println("2. Go home page");
            int i = getIntegerFromUser();
            if (i == 1) {
                CreateAnnouncementScreen createAnnouncementScreen = new CreateAnnouncementScreen();
                return createAnnouncementScreen;
            } else if (i == 2) {
                AdminHomeScreen adminHomeScreen = new AdminHomeScreen();
                return adminHomeScreen;
            } else {
                System.out.println("Wrong input");
                continue;
            }
        }
    }
}
