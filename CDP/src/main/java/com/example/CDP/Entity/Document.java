package com.example.CDP.Entity;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
@Entity
@Table(name="document_details")
public class Document {
	@EmbeddedId
    private DocumentId documentId;
    private String type;
    private String dateOfIssue;
    private String dateOfExpiry;
    private String issuingAuthority;

    @ManyToOne
    @JoinColumn(name = "customerId",insertable=false, updatable=false)
    private Customer customer;

	public Document() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Document(DocumentId documentId, String type, String dateOfIssue, String dateOfExpiry,
			String issuingAuthority, Customer customer) {
		super();
		this.documentId = documentId;
		this.type = type;
		this.dateOfIssue = dateOfIssue;
		this.dateOfExpiry = dateOfExpiry;
		this.issuingAuthority = issuingAuthority;
		this.customer = customer;
	}

	public DocumentId getDocumentId() {
		return documentId;
	}

	public void setDocumentId(DocumentId documentId) {
		this.documentId = documentId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDateOfIssue() {
		return dateOfIssue;
	}

	public void setDateOfIssue(String dateOfIssue) {
		this.dateOfIssue = dateOfIssue;
	}

	public String getDateOfExpiry() {
		return dateOfExpiry;
	}

	public void setDateOfExpiry(String dateOfExpiry) {
		this.dateOfExpiry = dateOfExpiry;
	}

	public String getIssuingAuthority() {
		return issuingAuthority;
	}

	public void setIssuingAuthority(String issuingAuthority) {
		this.issuingAuthority = issuingAuthority;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Document [documentId=" + documentId + ", type=" + type + ", dateOfIssue=" + dateOfIssue
				+ ", dateOfExpiry=" + dateOfExpiry + ", issuingAuthority=" + issuingAuthority + ", customer=" + customer
				+ "]";
	}
	
    
	
}
