import java.util.ArrayList;
import java.util.Scanner;

public abstract class Screen {
    private static Scanner scanner = new Scanner(System.in);
    protected static UserRepository userRepository = new UserRepository();
    protected static ArrayList<Announcements> announcements = new ArrayList<>();
    protected static User loggedInUser = null;
    protected User admin = userRepository.getAdmin();
    protected int getIntegerFromUser(){
        return scanner.nextInt();
    }

    protected String getStringFromUser(){
        return scanner.next();
    }
    public abstract Screen process();

}
