public class MP3Player extends Component implements IConnect {

    public MP3Player(String make, String model, int volume){
        super(make, model, volume);
    }

    public String connect(Stereo stereo){
        return stereo.getName();
    }
}
