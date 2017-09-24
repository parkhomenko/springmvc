package com.hillel.lessons.controller;

import com.hillel.lessons.model.Book;
import com.hillel.lessons.model.Student;
import com.hillel.lessons.repository.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BookController {

  @Autowired
  StudentRepository studentRepository;

  @RequestMapping(value = "/books")
  public String getBooks(Model model) {
    List<Book> books = new ArrayList<>();
    Book book = new Book();
    book.setName("Test");
    book.setAuthor("Author");
    books.add(book);
    model.addAttribute("test", "A list of books");
    model.addAttribute("books", books);
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

  @RequestMapping(value = "students")
  public String getStudents(Model model) {
    List<Student> students = studentRepository.getStudents();
    return "students";
  }
}
