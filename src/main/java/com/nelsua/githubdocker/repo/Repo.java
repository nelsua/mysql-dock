package com.nelsua.githubdocker.repo;

import com.nelsua.githubdocker.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repo extends JpaRepository<UserEntity, Integer> {
}
