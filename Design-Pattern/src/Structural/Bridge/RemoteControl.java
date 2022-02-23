package Structural.Bridge;

public class RemoteControl {
    private Device device;
    public RemoteControl(Device device) {
        this.device = device;
    }

    public void togglePower() {
        this.device.enable();
    }

    public void volumnDown() {
        int volumn = this.device.getVolum() - 5 > 0 ? this.device.getVolum() - 5 : 0;
        this.device.setVolumn(volumn);
    }

    public void volumnUp() {
        int volumn = this.device.getVolum() +5 < 100 ? this.device.getVolum() + 5 : 100;
        this.device.setVolumn(volumn);
    }

    public void channelDown() {
        int channel = this.device.getChannel() -1 > 1? this.device.getChannel() -1 : 1;
        this.device.setChannel(channel);
    }

    public void channelUp() {
        int channel = this.device.getChannel() + 1 < 100? this.device.getChannel() + 1 : 100;
        this.device.setChannel(channel);
    }
}
