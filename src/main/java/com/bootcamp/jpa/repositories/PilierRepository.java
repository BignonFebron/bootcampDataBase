package com.bootcamp.jpa.repositories;

import com.bootcamp.jpa.entities.Pilier;

public class PilierRepository extends BaseRepository<Pilier>{
    public PilierRepository(String persistUnit){
        super(persistUnit,Pilier.class);
    }
}
