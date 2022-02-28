package com.jcj.mydemo.repository;

import com.jcj.mydemo.domain.Systemlog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface SystemlogRepo extends JpaRepository<Systemlog, String>, JpaSpecificationExecutor
{

}
