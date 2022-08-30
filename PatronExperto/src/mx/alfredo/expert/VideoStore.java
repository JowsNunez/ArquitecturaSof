package mx.alfredo.expert;

import java.util.List;

public class VideoStore {
    private List<Video> store;

    public VideoStore(List<Video> store) {
        this.store = store;
    }

    public void getAllVideos(){
        store.forEach(video -> {
            System.out.println(video);
        });
    }


}
