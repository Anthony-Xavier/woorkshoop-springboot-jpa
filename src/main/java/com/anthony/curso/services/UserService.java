package com.anthony.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anthony.curso.entities.User;
import com.anthony.curso.repositories.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }

    public User findById(Long id) { // ✅ nome mais claro
        Optional<User> obj = repository.findById(id); // ✅ método correto
        return obj.get(); // ⚠️ cuidado: pode lançar NoSuchElementException se o ID não existir
    }
}
