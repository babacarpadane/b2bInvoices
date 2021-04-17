package it.objectmethod.b2b.document.service.dto;

import java.util.Date;

public class NotificationDTO {
	private Long idNotification;
	private String fileName;
	private Date notificationDate;
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
