package com.ipintelligence.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "ip_assets")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class IpAsset {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String type;
    private String assetNumber;

    @Column(columnDefinition = "TEXT")
    private String title;

    private String assignee;
    private String inventor;
    private String jurisdiction;
    private LocalDateTime filingDate;
    private String status;
    private String className;  

    @Column(columnDefinition = "TEXT")
    private String details;

    private String apiSource;
    private LocalDateTime lastUpdated;

    // IP asset has many subscriptions
    @OneToMany(mappedBy = "ipAsset")
    private List<Subscription> subscriptions;

    // IP asset has many notifications
    @OneToMany(mappedBy = "ipAsset")
    private List<Notification> notifications;

    // IP asset has many filings
    @OneToMany(mappedBy = "ipAsset")
    private List<Filing> filings;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAssetNumber() {
		return assetNumber;
	}

	public void setAssetNumber(String assetNumber) {
		this.assetNumber = assetNumber;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAssignee() {
		return assignee;
	}

	public void setAssignee(String assignee) {
		this.assignee = assignee;
	}

	public String getInventor() {
		return inventor;
	}

	public void setInventor(String inventor) {
		this.inventor = inventor;
	}

	public String getJurisdiction() {
		return jurisdiction;
	}

	public void setJurisdiction(String jurisdiction) {
		this.jurisdiction = jurisdiction;
	}

	public LocalDateTime getFilingDate() {
		return filingDate;
	}

	public void setFilingDate(LocalDateTime filingDate) {
		this.filingDate = filingDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public String getApiSource() {
		return apiSource;
	}

	public void setApiSource(String apiSource) {
		this.apiSource = apiSource;
	}

	public LocalDateTime getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(LocalDateTime lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public List<Subscription> getSubscriptions() {
		return subscriptions;
	}

	public void setSubscriptions(List<Subscription> subscriptions) {
		this.subscriptions = subscriptions;
	}

	public List<Notification> getNotifications() {
		return notifications;
	}

	public void setNotifications(List<Notification> notifications) {
		this.notifications = notifications;
	}

	public List<Filing> getFilings() {
		return filings;
	}

	public void setFilings(List<Filing> filings) {
		this.filings = filings;
	}

	public IpAsset(Integer id, String type, String assetNumber, String title, String assignee, String inventor,
			String jurisdiction, LocalDateTime filingDate, String status, String className, String details,
			String apiSource, LocalDateTime lastUpdated, List<Subscription> subscriptions,
			List<Notification> notifications, List<Filing> filings) {
		super();
		this.id = id;
		this.type = type;
		this.assetNumber = assetNumber;
		this.title = title;
		this.assignee = assignee;
		this.inventor = inventor;
		this.jurisdiction = jurisdiction;
		this.filingDate = filingDate;
		this.status = status;
		this.className = className;
		this.details = details;
		this.apiSource = apiSource;
		this.lastUpdated = lastUpdated;
		this.subscriptions = subscriptions;
		this.notifications = notifications;
		this.filings = filings;
	}

	public IpAsset() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
    
    
    
}
