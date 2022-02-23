package Structural.Bridge;

public interface Device {
    public boolean isEnabled();
    public void enable();
    public void disable();
    public int getVolum();
    public void setVolumn(int volumn);
    public int getChannel();
    public void setChannel(int channel);
}
