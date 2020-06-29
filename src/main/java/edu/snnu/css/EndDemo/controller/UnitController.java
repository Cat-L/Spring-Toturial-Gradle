package edu.snnu.css.EndDemo.controller;

import edu.snnu.css.EndDemo.entity.Unit;
import edu.snnu.css.EndDemo.service.Impl.UnitServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Optional;

@RequestMapping
public class UnitController {
    @Autowired
    UnitServiceImpl unitService;

    @GetMapping("/unit/")
    public Map getAllUnitInJson(){
        return (Map) unitService.findAll();
    }

    @GetMapping("/unit/{id}")
    public Optional<Unit> getUnitById(@RequestParam Integer id){
        return unitService.findById(id);
    }

    @PutMapping("/unit/")
    public Unit putUnitInJson(Unit unit){
        return unitService.add(unit);
    }

    @PostMapping("/unit/")
    public Unit postUnitByJson(Unit unit){
        return unitService.update(unit);
    }

}
