package com.catrionbe.api.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.catrionbe.api.entity.CCPCertificate;
import com.catrionbe.api.entity.CCPCourses;
import com.catrionbe.api.entity.CCPSigning;

@Repository
public interface  CCPCertificateRepsitory extends CrudRepository<CCPCertificate, Integer> {

	@Query(value = "select     *   from ccpcertificate   where   userId =:userId ORDER BY userId DESC LIMIT 1", nativeQuery = true)
	public CCPCertificate  generatecertificatedata(int userId);
	
}
