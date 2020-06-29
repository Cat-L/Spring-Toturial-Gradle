package edu.snnu.css.EndDemo.springData;

import edu.snnu.css.EndDemo.entity.Video;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface VideoRepo extends JpaRepository<Video,Integer> {
    Optional<Video> findByFilename(String filename);
}
