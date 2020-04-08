import java.util.ArrayList;

public class Friend {

    private ArrayList<String> friends;
    private ArrayList<String> friendRequests;

    public Friend() {
        friends = new ArrayList<>();
        friendRequests = new ArrayList<>();
    }

    public ArrayList<String> getFriends() {

        return friends;
    }

    public ArrayList<String> getFriendRequests() {
        return friendRequests;
    }
}
