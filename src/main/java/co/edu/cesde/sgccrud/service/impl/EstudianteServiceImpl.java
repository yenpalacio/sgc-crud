package co.edu.cesde.sgccrud.service.impl;

import co.edu.cesde.sgccrud.modules.Estudiante;
import co.edu.cesde.sgccrud.repository.EstudianteRepository;
import co.edu.cesde.sgccrud.service.EstudianteService;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class EstudianteServiceImpl implements EstudianteService {
    private EstudianteRepository estudianteRepository;

    public EstudianteServiceImpl(EstudianteRepository estudianteRepository){
        this.estudianteRepository= estudianteRepository;
    }

    @Override
    public List<Estudiante> findAll() {
        return estudianteRepository.findAll ();
    }

    @Override
    public Estudiante findByEstudianteId(Long estudianteId) {
        Estudiante estudiante = estudianteRepository.findByEstudianteId(estudianteId);
        if (estudiante!= null){
            return estudiante;
        }
        return null;
    }

    @Override
    @Transactional
    public Estudiante save(Estudiante estudiante) {
        return estudianteRepository.save(estudiante);
    }

    @Override
    public void deleteById(Long estudianteId) {

    }


    @Override
    @Transactional
    public void deleteByEstudianteId(Long estudianteId) {
        estudianteRepository.deleteByEstudianteId(estudianteId);

    }

    @Override
    @Transactional
    public Estudiante update(Estudiante estudiante) {
        if (estudiante!= null){
            return estudianteRepository.save(estudiante);
        }
        return null;
    }

    @Override
    @Transactional
    public Estudiante patch(Estudiante estudiante,Long estudianteId) {
        Estudiante updateEstudiante=estudianteRepository.findByEstudianteId(estudianteId);
        if (estudiante!= null){
            return estudianteRepository.save(estudiante);
        }
        return null;
    }
}
