package it.objectmethod.b2b.document.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.objectmethod.b2b.document.service.DocumentService;
import it.objectmethod.b2b.document.service.dto.DocumentDTO;

@RestController
@RequestMapping("/api/document")
public class DocumentController {
	@Autowired
	private DocumentService docSer;

	@GetMapping("/all")
	public ResponseEntity<List<DocumentDTO>> showAllDocuments(@RequestParam("first_doc") Long firstDoc) {
		ResponseEntity<List<DocumentDTO>> resp = null;
		List<DocumentDTO> finalList = docSer.showAllDocuments(firstDoc);
		if (finalList != null) {
			resp = new ResponseEntity<List<DocumentDTO>>(finalList, HttpStatus.OK);
		} else {
			resp = new ResponseEntity<List<DocumentDTO>>(HttpStatus.BAD_REQUEST);
		}
		return resp;
	}

	@GetMapping("/count")
	public Long howManyPages() {
		Long pages = docSer.howManyPages();
		return pages;
	}
}
