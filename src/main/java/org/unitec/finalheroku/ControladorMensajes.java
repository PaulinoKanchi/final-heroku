/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.finalheroku;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")


public class ControladorMensajes {
    
    @RequestMapping(value="/mensajitos",method=RequestMethod.GET,
            headers={"Accept=application/json"})
    
    public Mensajitos hola(){
        Mensajitos mensa=new Mensajitos("Hola","Hola!");
        return mensa;
    }
}
            
    
    

