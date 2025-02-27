package com.example.CDP.Entity;

import java.io.Serializable;

import jakarta.persistence.Embeddable;

@Embeddable
public class DocumentId implements Serializable {
    private String customerId;
    private String documentId;

	public DocumentId() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DocumentId(String customerId, String documentId) {
		super();
		this.customerId = customerId;
		this.documentId = documentId;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getDocumentId() {
		return documentId;
	}

	public void setDocumentId(String documentId) {
		this.documentId = documentId;
	}
	  public static DocumentId fromString(String documentId) {
	        String[] parts = documentId.split("_");
	        return new DocumentId(parts[0], parts[1]);
	    }
	@Override
	public String toString() {
		return "DocumentId [customerId=" + customerId + ", documentId=" + documentId + "]";
	}
    
}
