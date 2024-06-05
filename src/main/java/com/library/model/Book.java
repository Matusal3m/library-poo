package com.library.model;

public class Book {
  private int id;
  private String author;
  private String title;
  private String gender;
  private Boolean isAvailable;

  public Book(int id, String author, String title, String gender, Boolean isAvailable) {
    this.id = id;
    this.author = author;
    this.title = title;
    this.gender = gender;
    this.isAvailable = isAvailable;
  }

  public int getId() {
    return id;
  }

  public String getAuthor() {
    return author;
  }

  public String getTitle() {
    return title;
  }

  public String getGender() {
    return gender;
  }

  public Boolean getIsAvailable() {
    return isAvailable;
  }

  public void setIsAvailable(Boolean isAvailable) {
    this.isAvailable = isAvailable;
  }
}
