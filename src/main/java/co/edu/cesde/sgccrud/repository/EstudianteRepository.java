package co.edu.cesde.sgccrud.repository;

import co.edu.cesde.sgccrud.modules.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudianteRepository extends JpaRepository<Estudiante,Long> {
    Estudiante findByEstudianteId(Long estudianteaId);
    void deleteByEstudianteId(Long estudianteId);

}

