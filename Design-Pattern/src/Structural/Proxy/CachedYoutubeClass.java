package Structural.Proxy;

import java.util.List;

public class CachedYoutubeClass implements ThirdPartyYoutubeLib{
    private ThirdPartyYoutubeLib service;

    public CachedYoutubeClass(ThirdPartyYoutubeLib service) {
        this.service = service;
    }

    @Override
    public List<String> listVideos() {
        //Do something:
        return this.service.listVideos();
    }

    @Override
    public String getVideoInfo(int id) {
        //Do something
        return this.service.getVideoInfo(id);
    }

    @Override
    public void downloadvideo(int id) {
        //Do something:
        this.service.downloadvideo(id);
    }
    
}
