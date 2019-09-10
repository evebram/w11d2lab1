public abstract class Component {

private String make;
private String model;

public Component(String make, String model){
    this.make = make;
    this.model = model;
}

public String PowerOn(String component){
    return component + "has been turned on.";
}

}
