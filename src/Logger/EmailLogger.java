package Logger;

public class EmailLogger extends Logger{
    @Override
    public void log() {
        System.out.println("Logged to email");
    }
}
