package Structural.Proxy;

import java.util.ArrayList;
import java.util.List;

/**
 * ThisPartyYoutubeClass
 */
public class ThirdPartyYoutubeClass implements ThirdPartyYoutubeLib{
    private List<String> listVideos;
    public ThirdPartyYoutubeClass() {
        this.listVideos = new ArrayList<>();
        for (int i = 0; i < 10; ++i) {
            this.listVideos.add("Movie " + i);
        }
    }
    @Override
    public List<String> listVideos() {
        return this.listVideos;
    }

    @Override
    public String getVideoInfo(int id) {
        if (id < 0 || id >= this.listVideos.size()) {
            return null;
        }
        return this.listVideos.get(id);
    }

    @Override
    public void downloadvideo(int id) {
        System.out.println("Download " + this.listVideos.get(id)); 
    }

    
}