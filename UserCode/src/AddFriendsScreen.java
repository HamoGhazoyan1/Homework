public class AddFriendsScreen extends Screen {
    @Override
    public Screen process() {
        while(true) {
            for (User user : userRepository.getAll()) {
                if (!(user.getUsername().equals(loggedInUser.getUsername()))){
                    System.out.println(user.getUsername());
                }
            }
            System.out.println("Input new friend name");
            String newFriend = getStringFromUser();
            boolean find = userRepository.checkIfExistsByUsername(newFriend);
            if (find) {
                System.out.println("Your request sended");
                userRepository.getByUsername(newFriend).userFriends().getFriendRequests().add(loggedInUser.getUsername());
                UserFriendsScreen userFriendsScreen = new UserFriendsScreen();
                return userFriendsScreen;
            } else {
                System.out.println("Wrong input");
                continue;
            }
        }
    }

}

