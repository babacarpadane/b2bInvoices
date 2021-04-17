package it.objectmethod.b2b.document.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.objectmethod.b2b.document.service.NotificationService;
import it.objectmethod.b2b.document.service.dto.NotificationDTO;

@RestController
@RequestMapping("/api/notification")
public class NotificationController {
	@Autowired
	private NotificationService notSer;

	@GetMapping("/find")
	public ResponseEntity<List<NotificationDTO>> showNotification(@RequestParam("document_id") Long id) {
		ResponseEntity<List<NotificationDTO>> resp = null;
		List<NotificationDTO> finalList = notSer.showNotification(id);
		if (finalList != null) {
			resp = new ResponseEntity<List<NotificationDTO>>(finalList, HttpStatus.OK);
		} else {
			resp = new ResponseEntity<List<NotificationDTO>>(HttpStatus.BAD_REQUEST);
		}
		return resp;
	}
}
