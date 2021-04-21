package it.objectmethod.b2b.document.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import it.objectmethod.b2b.document.entity.Document;

@Repository
public interface DocumentRepository extends JpaRepository<Document, Long> {
	@Query(nativeQuery = true, value = "SELECT * FROM document LIMIT ?1,20")
	public List<Document> printOnePageDocument(Long firstDoc);

	@Query(nativeQuery = true, value = "SELECT COUNT(*) FROM document d")
	public Long numberOfDocuments();
}
