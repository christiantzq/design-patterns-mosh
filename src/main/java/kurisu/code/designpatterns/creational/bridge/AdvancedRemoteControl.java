package kurisu.code.designpatterns.creational.bridge;

public class AdvancedRemoteControl extends RemoteControl {

    public AdvancedRemoteControl(Device device) {
        super(device);
    }

    public void setChannel(int channel){
        device.setChannel(channel);
    } 
    
}
