import java.util.ArrayList;

public class UserFriendsScreen extends Screen {
    @Override
    public Screen process() {
        if (loggedInUser.userFriends().getFriends().size()<1){
            System.out.println("You have not friends");
        }else {
            System.out.println("Your friend list");
            for (String friend : loggedInUser.userFriends().getFriends()) {
                System.out.println(friend);
            }
        }

        System.out.println("1.Add friends");
        System.out.println("2.Friendship requests page");
        System.out.println("3.Go back");
        int i = getIntegerFromUser();
        if (i == 1) {
            AddFriendsScreen addFriendsScreen = new AddFriendsScreen();
            return addFriendsScreen;
        }else if (i == 2) {
            FriendRequestScreen friendRequestScreen = new FriendRequestScreen();
            return friendRequestScreen;
        }        else if (i == 3) {
            UserHomeScreen userHomeScreen = new UserHomeScreen();
            return userHomeScreen;
        } else {
            UserFriendsScreen userFriendsScreen = new UserFriendsScreen();
            return userFriendsScreen;
        }

    }
}
