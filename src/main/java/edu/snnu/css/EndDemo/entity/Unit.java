package edu.snnu.css.EndDemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@NamedQuery(name = "fetch_all_units",query = "select s from  Unit s")
public class Unit {
    @Id
    private int id;

    private String filename;

    int userid;
}
