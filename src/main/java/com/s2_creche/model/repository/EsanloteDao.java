/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.s2_creche.model.repository;

import com.s2_creche.model.entities.Esanlote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EsanloteDao extends JpaRepository<Esanlote, Integer> {

}
