/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.jpa.repositories;

import com.bootcamp.jpa.entities.Media;

/**
 *
 * @author rosius
 */
public class MediaRepository extends BaseRepository<Media>{
    public MediaRepository(String unitPersistence) {
        super(unitPersistence, Media.class);
    }
}
