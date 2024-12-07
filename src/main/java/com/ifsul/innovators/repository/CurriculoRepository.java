package com.ifsul.innovators.repository;
import com.ifsul.innovators.model.Curriculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurriculoRepository extends JpaRepository<Curriculo, Long> {
    void delete(Curriculo curriculo);
}
