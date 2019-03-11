/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.preyc.springbootrestapi.repository;

import com.preyc.springbootrestapi.entity.Artefacto;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author prc
 */
public interface ArtefactoRepository extends MongoRepository<Artefacto,String> {
    Artefacto findBy_id(ObjectId _id);
}
