package com.example.template.services;

import com.example.template.repositories.UserRepository;
import com.example.template.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
  @Autowired
  private UserRepository repository;

  public User save(User obj) {
    return this.repository.save(obj);
  }

  public Iterable<User> findAll() {
    return this.repository.findAll();
  }

  public Optional<User> find(Long id) {
    return this.repository.findById(id);
  }

  public void delete(User user) {
    this.repository.delete(user);
  }
}
