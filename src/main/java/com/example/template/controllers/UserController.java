package com.example.template.controllers;

import com.example.template.models.User;
import com.example.template.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class UserController {

  @Autowired
  private UserService service;

  @GetMapping("/user")
  public String userGet(Model model) {
    model.addAttribute("user", new User());
    model.addAttribute("active", "user");
    return "user";
  }

  @PostMapping("/user")
  public String userPost(@ModelAttribute User user, Model model) {
    model.addAttribute("user", user);
    service.save(user);
    return "redirect:/tables";
  }

  @GetMapping("/tables")
  public String tables(Model model) {
    model.addAttribute("active", "tables");
    model.addAttribute("users", (List<User>) this.service.findAll());
    return "tables";
  }

  @GetMapping("/tables/delete/{userId}")
  public String userDelete(@PathVariable Long userId, Model model) {
    model.addAttribute("active", "tables");
    Optional<User> userToDelete = this.service.find(userId);
    if (userToDelete.isPresent()) {
      System.out.println("Si existe: " + userToDelete.get().getId());
      this.service.delete(userToDelete.get());
    }
    return "redirect:/tables";
  }
}
