package com.cpdias.metalhead;

import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class VideoStreamingService {
    
    private VideoDao videoDao;
    
    public VideoStreamingService(VideoDao videoDao) {
        super();
        this.videoDao = videoDao;
    }

    Video getVideo(String name) {
        if(!videoDao.existsByName(name)){
            throw new VideoNotFoundException();
    }
        return videoDao.findByName(name);
    }

    void saveVideo(MultipartFile file, String name) throws IOException{
        if(videoDao.existsByName(name)){
            throw new VideoAlreadyExistsException();
        }
        Video newVid = new Video(name, file.getBytes());
        videoDao.salve(newVid);
    }

    List<String> getAllVideoNames(){
        return videoDao.getAllEntryNames();
    }
}


