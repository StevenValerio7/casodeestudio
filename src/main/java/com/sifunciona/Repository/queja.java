/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.sifunciona.Repository;

/**
 *
 * @author steve
 */

  import com.sifunciona.domain.Queja;
import org.springframework.data.jpa.repository.JpaRepository;


public interface queja extends JpaRepository<queja, Long> {
}  

