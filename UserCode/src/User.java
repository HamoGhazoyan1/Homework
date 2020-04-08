import java.util.ArrayList;

public class User {
    private String username;
    private String password;
    private ArrayList<Message> messages;
    private Friend friends;

    public Friend userFriends() {
        return friends;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        messages = new ArrayList<>();
        friends = new Friend();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Message> getMessages() {
        return messages;
    }

    public void setMessages(ArrayList<Message> messages) {
        this.messages = messages;
    }

}