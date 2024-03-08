package com.example.demo.Repositorys;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Estudiante;



@Repository
public interface IEstudianteRepository extends JpaRepository<Estudiante, Long>{

}