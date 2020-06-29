package edu.snnu.css.EndDemo.service.Impl;

import edu.snnu.css.EndDemo.entity.Unit;
import edu.snnu.css.EndDemo.service.UnitService;
import edu.snnu.css.EndDemo.springData.UnitRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class UnitServiceImpl implements UnitService {

    @Autowired
    UnitRepo unitRepo;

    @Override
    public List<Unit> findAll() {
        return unitRepo.findAll();
    }

    @Override
    public Optional<Unit> findById(Integer id) {
        return unitRepo.findById(id);
    }

    @Override
    public Optional<Unit> findByFilename(String filename) {
        return unitRepo.findByFilename(filename);
    }

    @Override
    public Optional<Unit> findByUserid(Integer userid) {
        return unitRepo.findByUserid(userid);
    }

    @Override
    public Unit add(Unit unit) {
        return unitRepo.save(unit);
    }

    @Override
    public Unit update(Unit unit) {
        return unitRepo.save(unit);
    }
}
