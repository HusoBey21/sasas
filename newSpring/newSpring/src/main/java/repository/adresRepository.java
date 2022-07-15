package repository;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import entity.adressClass;


@Repository
public interface adresRepository extends JpaRepository<adressClass,Long>{

}


