package com.testrailway.backendtestrailway.repository;

import com.testrailway.backendtestrailway.domain.TextEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TextRepository extends JpaRepository<TextEntity, Long> {
    //queries custom
}
