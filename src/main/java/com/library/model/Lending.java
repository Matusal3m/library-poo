package com.library.model;

import java.util.Date;

public class Lending {
  private int id;
  private Book book;
  private User user;
  private Date startDate;
  private Date endDate;
  private Boolean isReturned;
  private UserAdminister userAdminister;

  public Lending(int id, User user, Book book, Date startDate, Date endDate, Boolean isReturned, UserAdminister userAdminister) {
    this.id = id;
    this.user = user;
    this.book = book;
    this.startDate = startDate;
    this.endDate = endDate;
    this.isReturned = isReturned;
    this.userAdminister = userAdminister;
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

  public UserAdminister getUserAdminister() {
    return userAdminister;
  }

  public Boolean getIsReturned() {
    return isReturned;
  }

  public void setIsReturned(Boolean isReturned) {
    this.isReturned = isReturned;
  }
}
