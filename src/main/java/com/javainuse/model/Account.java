package com.javainuse.model;

public class Account {
  private String trackId;
  private String domain;
  private String name;

  public String getTrackId() {
    return trackId;
  }

  public void setTrackId(String trackId) {
    this.trackId = trackId;
  }

  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Account() {
  }

  @Override
  public String toString() {
    return this.getName() + " " + this.getDomain() + " " + this.getTrackId();
  }
}
