package Logger;

public class FileLogger extends Logger{
    @Override
    public void log() {
        System.out.println("Logged to file");
    }
}
