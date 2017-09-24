package com.hillel.lessons.model;

import org.hibernate.validator.constraints.Length;

import java.math.BigDecimal;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class Book {

  @NotBlank(message = "Add a book name")
  @Length(min = 10)
  private String name;

  @NotBlank(message = "Add an author name")
  private String author;

  @NotNull(message = "Add a price")
  private BigDecimal price;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }
}
