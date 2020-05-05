package musicPlayerExample;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MusicPlayer {

    private final List<String> tracks = Arrays.asList("Track 1", "Track 2", "Track 3");
    int currentTrackNumber = 0;

    public void playFirstTrack() {
        currentTrackNumber = 0;
        System.out.println("Gram pierwszy utwór.");
    }

    public void playNextTrack() {
        if(currentTrackNumber != 2) {
            currentTrackNumber ++;
            System.out.println("Gram kolejny utwór: " + tracks.get(currentTrackNumber));
        }else {
            currentTrackNumber = 0;
            System.out.println("Brak kolejnych utworów, gram pierwszy utwór.");
        }

    }

    public void playRandomTrack() {
        currentTrackNumber = new Random().nextInt(3);
        System.out.println("Gram losowy utwór: " + tracks.get(currentTrackNumber));
    }
}
