public class Main {
    public static void main(String[] args) {
        Screen nextScreen = new StartScreen();
        while (true) {
            nextScreen = nextScreen.process();
        }

    }

}