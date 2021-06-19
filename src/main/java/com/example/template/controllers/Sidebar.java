package com.example.template.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Sidebar {
  @GetMapping({"/", "/index"})
  public String index(Model model) {
    model.addAttribute("active", "dashboard");
    return "dashboard";
  }

  @GetMapping("/typography")
  public String typography(Model model) {
    model.addAttribute("active", "typography");
    return "typography";
  }

  @GetMapping("/icons")
  public String icons(Model model) {
    model.addAttribute("active", "icons");
    return "icons";
  }

  @GetMapping("/map")
  public String map(Model model) {
    model.addAttribute("active", "map");
    return "map";
  }

  @GetMapping("/notifications")
  public String notifications(Model model) {
    model.addAttribute("active", "notifications");
    return "notifications";
  }

  @GetMapping("/rtl")
  public String rtl(Model model) {
    model.addAttribute("active", "rtl");
    return "rtl";
  }

  @GetMapping("/upgrade")
  public String upgrade(Model model) {
    model.addAttribute("active", "upgrade");
    return "upgrade";
  }
}
