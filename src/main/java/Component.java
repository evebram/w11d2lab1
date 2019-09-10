public abstract class Component {

private String make;
private String model;
private int volume;

public Component(String make, String model, int volume){
    this.make = make;
    this.model = model;
    this.volume = volume;
}

public String PowerOn(String component){
    return component + " has been turned on.";
}

public void volumeUp(){
    if(volume < 11){
        volume += 1;
    }
}

public void volumeDown(){
    if(volume >= 0){
        volume -= 1;
    }
}

public int getVolume(){
    return this.volume;
}

}
