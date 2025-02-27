package com.example.CDP.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.CDP.Entity.Document;
import com.example.CDP.Entity.DocumentId;
import com.example.CDP.ServiceInterface.DocumentInterface;

@RestController
@RequestMapping("/v1/customer/{customerId}/document")
public class DocumentController {
	@Autowired
	private DocumentInterface documentInterface;
//    @PostMapping
//    public ResponseEntity<String> createDocument(
//            @PathVariable("customerId") String customerId,
//            @RequestBody Document document)
//    {
//    	try {
//            // Set the customer ID in the Document object
//            DocumentId documentId = new DocumentId();
//            documentId.setCustomerId(customerId);
//            document.setDocumentId(documentId);
//
//            Document createdDocument = documentInterface.createDocument(document);
//            return ResponseEntity.status(HttpStatus.CREATED).body("Document created successfully");
//             }catch (Exception e) {
//            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to create document");
//        }
//    }
	@PostMapping
	public ResponseEntity<String> createDocument(
	        @PathVariable("customerId") String customerId,
	        @RequestBody Document document
	) {
		System.out.println("from controller outside try");
	    try {
	    	System.out.println("from controller");
	        // Set the customer ID in the DocumentId object
	        DocumentId documentId = new DocumentId();
	        documentId.setCustomerId(customerId);

	        // Set the DocumentId object in the Document object
	        document.setDocumentId(documentId);

	        // Call the createDocument method of the DocumentInterface
	        Document createdDocument = documentInterface.createDocument(document);

	        return ResponseEntity.status(HttpStatus.CREATED).body("Document created successfully");
	    } catch (Exception e) {
	        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to create document");
	    }
	}

}
