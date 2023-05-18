package adapter_java;

public class Mp3Player implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String filename) {
        System.out.println("Playing vlc file. Name: " + filename);

    }

    @Override
    public void playMp4(String filename) {

    }
}
