package edu.snnu.css.EndDemo.service.Impl;

import edu.snnu.css.EndDemo.entity.Video;
import edu.snnu.css.EndDemo.service.VideoService;
import edu.snnu.css.EndDemo.springData.VideoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VideoServiceImpl implements VideoService {

    @Autowired
    VideoRepo videoRepo;

    @Override
    public List<Video> findall() {
        return videoRepo.findAll();
    }

    @Override
    public Optional<Video> findById(Integer id) {
        return videoRepo.findById(id);
    }

    @Override
    public Optional<Video> findByFilename(String filename) {
        return videoRepo.findByFilename(filename);
    }

    @Override
    public Video add(Video video) {
        return videoRepo.save(video);
    }

    @Override
    public Video update(Video video) {
        return videoRepo.save(video);
    }
}
