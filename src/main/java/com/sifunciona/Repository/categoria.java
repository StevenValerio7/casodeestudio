/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.sifunciona.Repository;
import com.sifunciona.Repository.categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
/**
 *
 * @author steve
 */



public interface categoria extends JpaRepository<categoria, Long> {
Optional<categoria> findByNombre(String nombre);
}

