import java.util.ArrayList;

public class Announcements {
    private String announcement;
    private ArrayList<String> readers = new ArrayList<>();

    public String getAnnouncement() {
        return announcement;
    }

    public void setAnnouncement(String announcement) {
        this.announcement = announcement;
    }

    public ArrayList<String> getReaders() {
        return readers;
    }

    public void addReaders(String reader) {
        this.readers.add(reader);
    }
    public boolean newAnnouncement(Announcements announcement, String username){
        boolean x = false;
        for (String reader : announcement.getReaders()) {
            if(reader.equals(username)){
                x = true;
            }else {
                x = false;
            }
        }
        return x;
    }
}
