package it.objectmethod.b2b.document.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "notification")
public class Notification {
	@GeneratedValue
	@Id
	@Column(name = "id")
	private Long idNotification;

	@Column(name = "file_name")
	private String fileName;

	@Column(name = "notification_date")
	private Date notificationDate;

	@Column(name = "document_id")
	private Long refIdDocument;

	public Long getIdNotification() {
		return idNotification;
	}

	public void setIdNotification(Long idNotification) {
		this.idNotification = idNotification;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public Date getNotificationDate() {
		return notificationDate;
	}

	public void setNotificationDate(Date notificationDate) {
		this.notificationDate = notificationDate;
	}

	public Long getRefIdDocument() {
		return refIdDocument;
	}

	public void setRefIdDocument(Long refIdDocument) {
		this.refIdDocument = refIdDocument;
	}

}
