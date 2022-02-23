package Structural.Proxy;

public class ClientApplication {
    public void main() {
        ThirdPartyYoutubeLib aYoutubeService = new ThirdPartyYoutubeClass();
        ThirdPartyYoutubeLib aYoutubeProxy = new CachedYoutubeClass(aYoutubeService);
        YoutubeManager manager = new YoutubeManager(aYoutubeProxy);
        manager.renderListPanel();
    }
}
