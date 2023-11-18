public class CDPlayer implements Media {

    @Override
    public void start() {
        System.out.println("Start the media player.");
    }

    @Override
    public void stop() {
        System.out.println("Stop the media player.");
    }
    
}
