package in.shriram.dreambiketwowheelerloan.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.shriram.dreambiketwowheelerloan.model.entity.Cibil;

@Repository
public interface CibilRepo extends JpaRepository<Cibil, Integer>{

}
