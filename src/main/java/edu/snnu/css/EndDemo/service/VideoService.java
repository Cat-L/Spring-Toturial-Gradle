package edu.snnu.css.EndDemo.service;

import edu.snnu.css.EndDemo.entity.Video;

import java.util.List;
import java.util.Optional;

public interface VideoService {
    List<Video> findall();

    Optional<Video> findById(Integer id);

    Optional<Video> findByFilename(String filename);

    Video add(Video video);

    Video update(Video video);
}
