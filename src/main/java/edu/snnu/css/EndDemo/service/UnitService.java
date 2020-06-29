package edu.snnu.css.EndDemo.service;

import edu.snnu.css.EndDemo.entity.Unit;

import java.util.List;
import java.util.Optional;

public interface UnitService {
    List<Unit> findAll();

    Optional<Unit> findById(Integer id);

    Optional<Unit> findByFilename(String filename);

    Optional<Unit> findByUserid(Integer userid);

    Unit add(Unit unit);

    Unit update(Unit unit);
}
