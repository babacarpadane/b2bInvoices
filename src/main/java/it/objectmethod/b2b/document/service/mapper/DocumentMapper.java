package it.objectmethod.b2b.document.service.mapper;

import org.mapstruct.Mapper;

import it.objectmethod.b2b.document.entity.Document;
import it.objectmethod.b2b.document.service.dto.DocumentDTO;

@Mapper(componentModel = "spring")
public interface DocumentMapper extends EntityMapper<DocumentDTO, Document> {
	@Override
	DocumentDTO toDto(Document entity);

	@Override
	Document toEntity(DocumentDTO dto);
}
