package Structural.Facade;

public class ClientApplication {
    public void main() {
        VideoConverter converter = new VideoConverter();
        //Don't need to know the underly third-party
        converter.convert("funny-cats-video.ogg", "mp4");
    }
}
