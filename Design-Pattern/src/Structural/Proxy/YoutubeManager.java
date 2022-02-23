package Structural.Proxy;

import java.util.List;

public class YoutubeManager {
    protected ThirdPartyYoutubeLib service;

    public YoutubeManager(ThirdPartyYoutubeLib service) {
        this.service = service;
    }

    public void renderVideoPage(int id) {
        String info = service.getVideoInfo(id);
        System.out.println("Render video: " + info);
    }

    public void renderListPanel() {
        List<String> lists = service.listVideos();
        for (String list : lists) {
            System.out.println(list);
        }
    }
}
