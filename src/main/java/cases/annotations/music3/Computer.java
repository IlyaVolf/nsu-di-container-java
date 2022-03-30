package cases.annotations.music3;

import framework.annotations.Component;
import framework.annotations.Inject;

@Component
public class Computer {

    @Inject
    private MusicPlayer musicPlayer;

    public String result(){
        return "Computer: " + " " + musicPlayer.playMusic();
    }
}
