package mx.alfredo.expert;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Video> Misvideos = new ArrayList<>(){{
            add(new Video("Segundo","El",948809));
            add(new Video("Segundo","El",948809));
            add(new Video("Video 3","tu",60569));
            add(new Video("el cuarto","todos",14209));
        }};

        // Creamos una instancia de la clase que tiene como responsabilidad mostrar todos los videos.
        VideoStore store = new VideoStore(Misvideos);
        store.getAllVideos();


    }
}
