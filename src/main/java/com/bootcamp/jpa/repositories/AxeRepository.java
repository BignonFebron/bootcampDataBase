/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.jpa.repositories;

import com.bootcamp.jpa.entities.Axe;

/**
 *
 * @author Bello
 */
public class AxeRepository extends BaseRepository<Axe> {
    public AxeRepository(String unitPersistence) {
        super(unitPersistence, Axe.class);
    }
}
