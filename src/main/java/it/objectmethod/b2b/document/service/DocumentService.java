package it.objectmethod.b2b.document.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.objectmethod.b2b.document.entity.Document;
import it.objectmethod.b2b.document.repository.DocumentRepository;
import it.objectmethod.b2b.document.service.dto.DocumentDTO;
import it.objectmethod.b2b.document.service.mapper.DocumentMapper;

@Service
public class DocumentService {
	@Autowired
	private DocumentRepository docRep;

	@Autowired
	private DocumentMapper docMap;

	public List<DocumentDTO> showAllDocuments(Long firstDoc) {
		List<Document> listDocuments = docRep.printOnePageDocument(firstDoc);
		List<DocumentDTO> listDocumentDto = docMap.toDto(listDocuments);
		return listDocumentDto;

	}

	public Long howManyPages() {
		Long numberOfDocument = docRep.numberOfDocuments();
		Long pages = (numberOfDocument / 20) + ((numberOfDocument % 20 == 0) ? 0 : 1);
		return pages;
	}

}
