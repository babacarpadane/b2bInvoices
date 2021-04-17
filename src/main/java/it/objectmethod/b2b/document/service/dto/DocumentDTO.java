package it.objectmethod.b2b.document.service.dto;

import java.util.Date;
import java.util.List;

public class DocumentDTO {
	private Long idDocument;
	private Date deliveryDate;
	private Date documentDate;
	private String documentNumber;
	private String flowType;
	private String sender;
	private List<NotificationDTO> listNotifications;

	public Long getIdDocument() {
		return idDocument;
	}

	public void setIdDocument(Long idDocument) {
		this.idDocument = idDocument;
	}

	public Date getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public Date getDocumentDate() {
		return documentDate;
	}

	public void setDocumentDate(Date documentDate) {
		this.documentDate = documentDate;
	}

	public String getDocumentNumber() {
		return documentNumber;
	}

	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}

	public String getFlowType() {
		return flowType;
	}

	public void setFlowType(String flowType) {
		this.flowType = flowType;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public List<NotificationDTO> getListNotifications() {
		return listNotifications;
	}

	public void setListNotifications(List<NotificationDTO> listNotifications) {
		this.listNotifications = listNotifications;
	}

}
