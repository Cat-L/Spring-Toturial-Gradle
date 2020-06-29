package edu.snnu.css.EndDemo.springData;

import edu.snnu.css.EndDemo.entity.Unit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UnitRepo extends JpaRepository<Unit,Integer> {
    Optional<Unit> findByFilename(String filenme);
    Optional<Unit> findByUserid(Integer userid);

}
