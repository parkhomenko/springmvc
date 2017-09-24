package com.hillel.lessons.controller;

import com.hillel.lessons.model.Book;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BookController {

  @RequestMapping(value = "/books")
  public String getBooks(Model model) {
    model.addAttribute("test", "A list of books");
    return "books";
  }

  @RequestMapping("/book")
  public String displayAddBookForm(Model model) {
    model.addAttribute(new Book());
    return "book";
  }

  @RequestMapping(value = "/book", method = RequestMethod.POST)
  public String addBook(@Validated @ModelAttribute Book book, BindingResult bindingResult) {
    System.out.println(book);
    System.out.println(bindingResult.hasErrors());

    if (bindingResult.hasErrors()) {
      return "book";
    }

    return "redirect:books.html";
    //return "forward:books.html";
  }
}
