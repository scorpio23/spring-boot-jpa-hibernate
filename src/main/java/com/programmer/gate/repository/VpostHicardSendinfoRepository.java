package com.programmer.gate.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.programmer.gate.model.Player;
import com.programmer.gate.model.VpostHicardSendinfo;

@Repository
public interface VpostHicardSendinfoRepository extends JpaRepository<VpostHicardSendinfo, Long> {
	
	@Query("SELECT v FROM VpostHicardSendinfo v WHERE v.loginname = :loginName AND trunc(datetimestart) = trunc(:date)")
	VpostHicardSendinfo findByloginnameAndDatetimestart(@Param("loginName")String loginName, @Param("date")Date date);
	
	VpostHicardSendinfo findByJday (String input);
}
