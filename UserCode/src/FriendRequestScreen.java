public class FriendRequestScreen extends Screen {
    @Override
    public Screen process() {
        if (loggedInUser.userFriends().getFriendRequests().size()<1){
            System.out.println("You have not requests");
        }else{
            System.out.println("Friendship requests");
            for (String friendRequest : loggedInUser.userFriends().getFriendRequests()) {
                System.out.println(friendRequest);
            }
            System.out.println("1.Input user name");
        }
        System.out.println("2.Go Friend page");
        String fr = getStringFromUser();
        if (fr.equals("2")){
            UserFriendsScreen userFriendsScreen= new UserFriendsScreen();
            return userFriendsScreen;
        }else {
                System.out.println("Add "+ fr +" to your frends?");
                System.out.println("1.Yes");
                System.out.println("2.No");
                System.out.println("3.Go back");
                int k = getIntegerFromUser();
                if (k == 1){
                    for (String friendRequest : loggedInUser.userFriends().getFriendRequests()) {
                        if (fr.equals(friendRequest)){
                            loggedInUser.userFriends().getFriends().add(friendRequest);
                            userRepository.getByUsername(friendRequest).userFriends().getFriends().add(loggedInUser.getUsername());
                            loggedInUser.userFriends().getFriendRequests().remove(friendRequest);
                            System.out.println("Your friend added");
                            UserFriendsScreen userFriendsScreen= new UserFriendsScreen();
                            return userFriendsScreen;
                        }
                    }
                }else if(k == 2){
                    for (String friendRequest : loggedInUser.userFriends().getFriendRequests()) {
                        if (friendRequest.equals(fr)){
                            loggedInUser.userFriends().getFriendRequests().remove(friendRequest);
                            System.out.println("Request deleted");
                            UserFriendsScreen userFriendsScreen= new UserFriendsScreen();
                            return userFriendsScreen;
                        }
                    }
                }else if(k == 3){
                    FriendRequestScreen friendRequestScreen = new FriendRequestScreen();
                    return friendRequestScreen;
                }else{
                    System.out.println("Wrong input");
                    FriendRequestScreen friendRequestScreen = new FriendRequestScreen();
                    return friendRequestScreen;
                }


        }
        return null;
    }
}
