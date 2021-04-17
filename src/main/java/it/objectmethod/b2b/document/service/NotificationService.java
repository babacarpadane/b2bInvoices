package it.objectmethod.b2b.document.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.objectmethod.b2b.document.entity.Notification;
import it.objectmethod.b2b.document.repository.NotificationRepository;
import it.objectmethod.b2b.document.service.dto.NotificationDTO;
import it.objectmethod.b2b.document.service.mapper.NotificationMapper;

@Service
public class NotificationService {
	@Autowired
	private NotificationRepository notRep;

	@Autowired
	private NotificationMapper notMap;

	public List<NotificationDTO> showNotification(Long id) {
		List<Notification> listNotification = notRep.findByRefIdDocument(id);
		List<NotificationDTO> listNotificationDto = notMap.toDto(listNotification);
		return listNotificationDto;
	}

}
