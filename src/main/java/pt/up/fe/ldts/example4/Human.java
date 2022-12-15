package pt.up.fe.ldts.example4;

public class Human {
    private final String name;
    private final String phoneNumber;
    public Human(String name, String phoneNumber){
        this.name=name;
        this.phoneNumber=phoneNumber;
    }
    public String getName(){return name;}
    public String getPhoneNumber(){return phoneNumber;}
}
