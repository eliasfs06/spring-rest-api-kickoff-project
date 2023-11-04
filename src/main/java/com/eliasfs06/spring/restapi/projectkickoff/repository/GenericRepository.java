package com.eliasfs06.spring.restapi.projectkickoff.repository;

import com.eliasfs06.spring.restapi.projectkickoff.model.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface GenericRepository<T extends BaseEntity> extends JpaRepository<T, Long> {
}