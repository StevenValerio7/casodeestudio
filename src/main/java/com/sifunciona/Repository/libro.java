package com.sifunciona.Repository;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */


/**
 *
 * @author steve
 */
   import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface libro extends JpaRepository<libro, Long> {
    // Método opcional para buscar libros por título
    List<libro> findByTituloContainingIgnoreCase(String titulo);
}
