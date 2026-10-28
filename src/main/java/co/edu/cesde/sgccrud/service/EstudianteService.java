package co.edu.cesde.sgccrud.service;

import co.edu.cesde.sgccrud.modules.Estudiante;

import java.util.List;

public interface EstudianteService {

    List<Estudiante> findAll();
    Estudiante findByEstudianteId(Long estudianteId);
    Estudiante save(Estudiante estudiante);
    void deleteById(Long estudianteId);

    void deleteByEstudianteId(Long estudianteId);

    Estudiante update (Estudiante estudiante);
    Estudiante patch (Estudiante estudiante,Long estudianteId);

}
