package co.edu.cesde.sgccrud.controller;

import co.edu.cesde.sgccrud.modules.Estudiante;
import co.edu.cesde.sgccrud.service.EstudianteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {

    private final EstudianteService estudianteService;
    public EstudianteController(EstudianteService estudianteService){
        this.estudianteService=estudianteService;
    }
    @GetMapping
    public List<Estudiante> findAll(){
        return estudianteService.findAll();
    }
    @GetMapping("/{estudianteId}")
    public Estudiante findByEstudianteId(@PathVariable Long estudianteId){
        return estudianteService.findByEstudianteId(estudianteId);
    }
    @PostMapping
    public Estudiante save (@RequestBody Estudiante estudiante){
        return estudianteService.save(estudiante);
    }
    @PutMapping
    public Estudiante update(@RequestBody Estudiante estudiante){
        return estudianteService.update(estudiante);
    }
@DeleteMapping("/{estudianteId}")
    public void delete (@PathVariable Long estudianteId){
        estudianteService.deleteByEstudianteId(estudianteId);
    }
    @PatchMapping("/{estudianteId}")
    public Estudiante partialUpdate(@PathVariable Long estudianteId, @RequestBody Estudiante estudiante){
     return estudianteService.patch(estudiante, estudianteId);
    }



}

