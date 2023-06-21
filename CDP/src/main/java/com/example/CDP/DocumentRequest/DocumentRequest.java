package com.example.CDP.DocumentRequest;

public class DocumentRequest {
	
	 private String documentId;
	 private String customerId;
	 private String type;
	 private String dateOfIssue;
	 private String dateOfExpiry;
	 private String issueingAurthority;
	public DocumentRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DocumentRequest(String documentId, String customerId, String type, String dateOfIssue, String dateOfExpiry,
			String issueingAurthority) {
		super();
		this.documentId = documentId;
		this.customerId = customerId;
		this.type = type;
		this.dateOfIssue = dateOfIssue;
		this.dateOfExpiry = dateOfExpiry;
		this.issueingAurthority = issueingAurthority;
	}
	public String getDocumentId() {
		return documentId;
	}
	public void setDocumentId(String documentId) {
		this.documentId = documentId;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
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
	public String getIssueingAurthority() {
		return issueingAurthority;
	}
	public void setIssueingAurthority(String issueingAurthority) {
		this.issueingAurthority = issueingAurthority;
	}
	@Override
	public String toString() {
		return "DocumentRequest [documentId=" + documentId + ", customerId=" + customerId + ", type=" + type
				+ ", dateOfIssue=" + dateOfIssue + ", dateOfExpiry=" + dateOfExpiry + ", issueingAurthority="
				+ issueingAurthority + "]";
	}	 

}
