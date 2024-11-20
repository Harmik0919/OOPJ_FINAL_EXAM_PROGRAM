
//qque 101
//  Create an interface TV_remote and use it to inherit another interface smart_TV_remote. 
// Create a class TV that implements the TVremote interface.

interface TV_remote {
    void powerOn();
    void powerOff();
}

interface smart_TV_remote extends TV_remote {
    void connectToInternet();
}

class TV implements TV_remote {
    @Override
    public void powerOn() {
        System.out.println("TV is powered on");
    }

    @Override
    public void powerOff() {
        System.out.println("TV is powered off");
    }
}

public class Main4 {
    public static void main(String[] args) {
        TV myTV = new TV();
        myTV.powerOn();
        myTV.powerOff();
    }
}

