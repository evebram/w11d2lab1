import java.util.ArrayList;

public class Stereo implements IConnect{

    private String name;
    private ArrayList<Component> components;

    public Stereo(String name, ArrayList<Component> components){
        this.name = name;
        components = new ArrayList<Component>();
    }

    public String getName() {
        return this.name;
    }

    public String connect(Stereo stereo){
        return stereo.getName();
    }


}
