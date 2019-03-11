/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.preyc.springbootrestapi.controller;

import com.preyc.springbootrestapi.entity.Artefacto;
import com.preyc.springbootrestapi.repository.ArtefactoRepository;
import java.util.List;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author prc
 */

@RestController
@RequestMapping("/artefactos")
public class ArtefactoController {
    
    private static final String PATH = "/error";
    
    @Autowired
    private ArtefactoRepository artefactoRepository;
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Artefacto> getAllArtefactos(){
        return artefactoRepository.findAll();
    }
    
    @RequestMapping(value = PATH)
    public String error() {
        return "Error handling";
    }
   
}
