package com.idat.EC2MonicaNolascoBodega.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.EC2MonicaNolascoBodega.model.Bodega;

@Repository
public interface BodegasRepository extends JpaRepository<Bodega, Integer> {

}
