package com.iam2kabhishek.filejump.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iam2kabhishek.filejump.model.FileDB;

@Repository
public interface FileDBRepository extends JpaRepository<FileDB, String> {

}
