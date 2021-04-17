package it.objectmethod.b2b.document.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.objectmethod.b2b.document.entity.Notification;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long> {
	public List<Notification> findByRefIdDocument(Long id);
}
