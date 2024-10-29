package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Security {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(nullable=false)
  private long securityId;

  @ManyToOne(optional=false)
  @JoinColumn(name="portfolioId", referencedColumnName="portfolioId")
  private long portfolioId;

  @Column(nullable=false)
  private String name;

  @Column(nullable=false)
  private String category;

  @Column(nullable=false)
  private long purchasePrice;

  @Column(nullable=false)
  private String purchaseDate;

  @Column(nullable=false)
  private long quantity;

  protected Security() {
    // Default constructor
  }

  public Security(String name, String category, long purchasePrice, String purchaseDate, long quantity) {
    this.name = name;
    this.category = category;
    this.purchasePrice = purchasePrice;
    this.purchaseDate = purchaseDate;
    this.quantity = quantity;
  }

  public long getSecurityId() {
    return securityId;
  }

  public long getPortfolioId() {
    return portfolioId;
  }

  public void setPortfolioId(long portfolioId) {
    this.portfolioId = portfolioId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public long getPurchasePrice() {
    return purchasePrice;
  }

  public void setPurchasePrice(long purchasePrice) {
    this.purchasePrice = purchasePrice;
  }

  public String getPurchaseDate() {
    return purchaseDate;
  }

  public void setPurchaseDate(String purchaseDate) {
    this.purchaseDate = purchaseDate;
  }

  public long getQuantity() {
    return quantity;
  }

  public void setQuantity(long quantity) {
    this.quantity = quantity;
  }
  
}
