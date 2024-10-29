package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Portfolio {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(nullable=false)
  private Long portfolioId;

  @ManyToOne(optional=false)
  @JoinColumn(name="clientId", referencedColumnName="clientId")
  private Long clientId;

  @Column(nullable=false)
  private String creationDate;

  protected Portfolio() {
    // Default constructor
  }

  public Portfolio(String creationDate) {
    this.creationDate = creationDate;
  }

  public Long getPortfolioId() {
    return portfolioId;
  }

  public Long getClientId() {
    return clientId;
  }

  public void setClientId(Long clientId) {
    this.clientId = clientId;
  }

  public String getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(String creationDate) {
    this.creationDate = creationDate;
  }
  
}
