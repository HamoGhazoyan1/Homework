import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<User> users = new ArrayList<>();
    static ArrayList<Announcements> announcements = new ArrayList<>();
    static User loggedInUser = null;
    static User admin = new User("admin","12345");

    public static void main(String[] args) {
        while (true) {
            System.out.println("1. Login");
            System.out.println("2. Register");
            int i = scanner.nextInt();
            if (i == 1) {
                goLoginScreen();
                break;
            } else if (i == 2) {
                goRegistrationScreen();
                break;
            } else {
                System.out.println("Wrong input");
            }
        }
    }

    public static void goStartPage() {
        while (true) {
            System.out.println("1. Login");
            System.out.println("2. Register");
            int i = scanner.nextInt();
            if (i == 1) {
                goLoginScreen();
                break;
            } else if (i == 2) {
                goRegistrationScreen();
                break;
            } else {
                System.out.println("Wrong input");
            }
        }
    }

    public static void goLoginScreen() {
        System.out.println("Input username");
        String username = scanner.next();
        System.out.println("Input password");
        String password = scanner.next();
        boolean foundUser = false;
        if(username.equals(admin.getUsername()) && password.equals(admin.getPassword())){
            loggedInUser = admin;
            foundUser = true;
            goAdminPage();
        }else {
            for (User user : users) {
                if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                    foundUser = true;
                    System.out.println("Login successful");
                    loggedInUser = user;
                    goUserHomePage();
                    break;
                }
            }
        }
        if (!foundUser) {
            System.out.println("Wrong username password");
            goLoginScreen();
        }
    }
    public static void goAdminPage() {
        System.out.println("ADMIN HOME PAGE!!!");
        System.out.println("1.Create announcement");
        System.out.println("2.Log out");
        int i = scanner.nextInt();
        if (i == 1) {
            goAnnouncementPage();
        }else if (i == 2) {
            System.out.println("Logged out");
            loggedInUser = null;
            goStartPage();
        }else {
            System.out.println("Wrong input");
            goAdminPage();
        }
    }

    public static void goAnnouncementPage(){
        System.out.println("Create an announcement");
        Announcements newAnn = new Announcements();
        newAnn.addReaders(admin.getUsername());
        newAnn.setAnnouncement(scanner.next());
        announcements.add(newAnn);
        System.out.println("Announcement created successfully");
        System.out.println("1. Create new announcement");
        System.out.println("2. Go home page");
        int i = scanner.nextInt();
        while (true){
            if(i == 1){
                goAnnouncementPage();
                break;
            }else if (i == 2){
                goAdminPage();
                break;
            }else {
                System.out.println("Wrong input");
            }
        }

    }


    public static void goUserHomePage() {
        while (true) {
            System.out.println("New Announcements");
            for (Announcements announcement : announcements) {
                boolean annouc = announcement.newAnnouncement(announcement,loggedInUser.getUsername());
                if (!annouc){
                    System.out.println(announcement.getAnnouncement());
                    announcement.addReaders(loggedInUser.getUsername());
                }
            }

            System.out.println("1. Messages");
            System.out.println("2. Log Out");
            System.out.println("3. Announcements");
            int i = scanner.nextInt();
            if (i ==1) {
                goMessagesScreen();
                break;
            } else if (i == 2) {
                System.out.println("Logged out");
                loggedInUser = null;
                goStartPage();
                break;
            } else if (i == 3) {
                System.out.println("All announcements");
                for (Announcements announcement : announcements) {
                    System.out.println(announcement.getAnnouncement());
                }
                System.out.println("1. Go back");
                int x = scanner.nextInt();
                if (x==1){
                    goUserHomePage();
                }else {
                    System.out.println("Wrong input");
                    goUserHomePage();
                }
                break;
            }
            else {
                System.out.println("Wrong input");
            }
        }
    }

    public static void goMessagesScreen() {
        System.out.println("All users");
        for (User user : users) {
            if (!loggedInUser.getUsername().equals(user.getUsername())) {
                System.out.println(user.getUsername());
            }
        }
        System.out.println("Input some user's username");
        String someUsername = scanner.next();
        User target = null;
        for (User user : users) {
            if (user.getUsername().equals(someUsername)) {
                target = user;
                break;
            }
        }

        if (target != null && !(target.getUsername().equals(loggedInUser.getUsername()))) {
            goPM(target);
        } else {
            System.out.println("No user with this username");
            goMessagesScreen();
        }
    }

    public static void goPM(User target) {
        System.out.println("Your messages from " + target.getUsername());
        for (Message message : loggedInUser.getMessages()) {
            if (message.getFrom().getUsername().equals(target.getUsername())) {
                System.out.println(message.getMessage());
            }
        }
        System.out.println("Write message");
        String message = scanner.next();
        Message message1 = new Message(message, loggedInUser, target);
        target.getMessages().add(message1);
        System.out.println("Message sent");
        goUserHomePage();

    }

    public static void goRegistrationScreen() {
        System.out.println("Input username");
        String username = scanner.next();
        boolean foundUser = false;
        if(username.equals(admin.getUsername())){
            System.out.println("You cannot create ADMIN");
            foundUser=true;
        }else {
            for (User user : users) {
                if (user.getUsername().equals(username)) {
                    System.out.println("Username already exists. Try again");
                    foundUser = true;
                    break;
                }
            }
        }

        if (foundUser) {
            goRegistrationScreen();
        } else {
            System.out.println("Input password");
            String password = scanner.next();
            User user = new User(username, password);
            users.add(user);
            System.out.println("Successfully created new user with username " + username);
            goStartPage();
        }
    }
}