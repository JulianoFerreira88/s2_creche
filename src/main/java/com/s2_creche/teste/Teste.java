/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.s2_creche.teste;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Juliano
 */
@RestController
@RequestMapping("/ola")
public class Teste {

    @GetMapping()
    public String list() {
        return "Ola";
    }

}
