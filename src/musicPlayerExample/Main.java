package musicPlayerExample;

import musicPlayerExample.MusicPlayerCommand.PlayFirstTrack;
import musicPlayerExample.MusicPlayerCommand.PlayNextTrack;
import musicPlayerExample.MusicPlayerCommand.PlayRandomTrack;

public class Main {

    public static void main(String[] args) {

        MusicPlayer musicPlayer = new MusicPlayer();
        MusicPlayerRemote remote = new MusicPlayerRemote();

        remote.setMusicPlayerCommand(new PlayFirstTrack(musicPlayer));
        remote.pressButton();
        remote.setMusicPlayerCommand(new PlayNextTrack(musicPlayer));
        remote.pressButton();
        remote.pressButton();
        remote.pressButton();
        remote.setMusicPlayerCommand(new PlayRandomTrack(musicPlayer));
        remote.pressButton();
        remote.pressButton();
    }
}
