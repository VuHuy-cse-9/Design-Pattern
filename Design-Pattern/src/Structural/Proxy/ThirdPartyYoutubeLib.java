package Structural.Proxy;

import java.util.List;

public interface ThirdPartyYoutubeLib {
    public List<String> listVideos();
    public String getVideoInfo(int id);
    public void downloadvideo(int id);
}