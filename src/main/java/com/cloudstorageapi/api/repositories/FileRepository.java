package com.cloudstorageapi.api.repositories;

import java.util.List;

 import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cloudstorageapi.api.entity.FileEntity;
 
 
@Repository
public interface  FileRepository extends CrudRepository<FileEntity,Integer> {

	@Query(value = "select * from  main_File ", nativeQuery = true)
	Page<FileEntity> listallusersfromdb(Pageable pageable);

	@Query(value = "SELECT count(*) from main_File", nativeQuery = true)
	String countNumberOfFiles();



}
