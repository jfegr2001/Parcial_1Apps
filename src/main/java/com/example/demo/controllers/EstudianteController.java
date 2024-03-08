package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Repositorys.IEstudianteRepository;
import com.example.demo.models.Estudiante;


@Controller
@RequestMapping("/estudiante")
public class EstudianteController {

	
	@Autowired
    private IEstudianteRepository estudianteRepository;
	
	
	 @GetMapping("")
	    public String mostrarFormularioEstudiante(Estudiante estudiante) {
	        return "estudiante";
	    }
	
	@PostMapping("")
    public String guardarEmpleado(Estudiante estudiante) {
       estudianteRepository.save(estudiante);
       return "redirect:/estudiante";
    }
	
}
