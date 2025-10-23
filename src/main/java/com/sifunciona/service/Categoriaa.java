/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.sifunciona.service;
import java.util.List;
import com.sifunciona.service.Categoriaa;

/**
 *
 * @author steve
 */
public interface Categoriaa {
 


    List<Categoriaa> listarCategorias();
    Categoriaa obtenerPorId(Long id);
    Categoriaa guardar(Categoriaa categoria);
    void eliminar(Long id);
}


