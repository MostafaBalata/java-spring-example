package com.javainuse.controllers;

import com.javainuse.model.Account;

import java.util.ArrayList;

class Listing {
  private Integer limit;
  private Integer page;
  private ArrayList<Account> data;

  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }

  public ArrayList<Account> getData() {
    return data;
  }

  public void setData(ArrayList<Account> data) {
    this.data = data;
  }

  public Listing(Integer limit, Integer page, ArrayList<Account> data) {
    this.limit = limit;
    this.page = page;
    this.data = data;
  }
}
