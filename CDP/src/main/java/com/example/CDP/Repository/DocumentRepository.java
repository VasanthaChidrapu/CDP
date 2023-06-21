package com.example.CDP.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.CDP.Entity.Document;
import com.example.CDP.Entity.DocumentId;

@Repository
public interface DocumentRepository extends JpaRepository<Document, DocumentId> {

}
