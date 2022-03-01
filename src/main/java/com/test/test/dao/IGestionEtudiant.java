package com.test.test.dao;

import com.test.test.model.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IGestionEtudiant extends JpaRepository<Etudiant,Integer> {

}
