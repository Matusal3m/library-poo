package com.library.model;

import java.util.Date;

public class Lending {
  private int id;
  private Book book;
  private User user;
  private Date startDate;
  private Date endDate;
  private Boolean isReturned;

  public Lending(int id, User user, Book book, Date startDate, Date endDate, Boolean isReturned) {
    this.id = id;
    this.user = user;
    this.book = book;
    this.startDate = startDate;
    this.endDate = endDate;
    this.isReturned = isReturned;
  }

  public int getId() {
    return id;
  }

  public Book getBook() {
    return book;
  }

  public User getUser() {
    return user;
  }

  public Date getStartDate() {
    return startDate;
  }

  public Date getEndDate() {
    return endDate;
  }

  public Boolean getIsReturned() {
    return isReturned;
  }

  public void setIsReturned(Boolean isReturned) {
    this.isReturned = isReturned;
  }
}
