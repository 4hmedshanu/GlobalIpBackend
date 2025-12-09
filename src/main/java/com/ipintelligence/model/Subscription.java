package com.ipintelligence.model;


import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "subscriptions")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Subscription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    // FK user_id
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    // FK ip_asset_id
    @ManyToOne
    @JoinColumn(name = "ip_asset_id")
    private IpAsset ipAsset;

    private LocalDateTime createdAt;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public IpAsset getIpAsset() {
		return ipAsset;
	}

	public void setIpAsset(IpAsset ipAsset) {
		this.ipAsset = ipAsset;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public Subscription(Integer id, User user, IpAsset ipAsset, LocalDateTime createdAt) {
		super();
		this.id = id;
		this.user = user;
		this.ipAsset = ipAsset;
		this.createdAt = createdAt;
	}

	public Subscription() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
    
    
}
