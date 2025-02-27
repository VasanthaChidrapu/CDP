package com.example.CDP.ServiceImplimentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.CDP.Entity.Document;
import com.example.CDP.Repository.DocumentRepository;
import com.example.CDP.ServiceInterface.DocumentInterface;

@Service
public class DocumentImplementation implements DocumentInterface{
//	@Autowired
//	private  CustomerRepository customerRepository;
	@Autowired
	private DocumentRepository documentRepository;
    
    
	@Override
    public Document createDocument(Document document) {
    	System.out.println("working fine");
        return documentRepository.save(document);
    }
}
