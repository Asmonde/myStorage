/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.memoire.mystorage.api.dao.security;

import com.memoire.mystorage.dao.core.mystorageDaoBeanLocal;
import com.memoire.mystorage.api.entities.security.Sequence;
import javax.ejb.Local;


/**
 *
 * @author PaulAbram
 */
@Local
public interface SequenceDaoBeanLocal extends mystorageDaoBeanLocal<Sequence,String> {
    
    
}