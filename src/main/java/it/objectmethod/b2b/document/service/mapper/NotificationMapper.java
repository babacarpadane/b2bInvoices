package it.objectmethod.b2b.document.service.mapper;

import org.mapstruct.Mapper;

import it.objectmethod.b2b.document.entity.Notification;
import it.objectmethod.b2b.document.service.dto.NotificationDTO;

@Mapper(componentModel = "spring")
public interface NotificationMapper extends EntityMapper<NotificationDTO, Notification> {
	@Override
	NotificationDTO toDto(Notification entity);

	@Override
	Notification toEntity(NotificationDTO dto);
}
