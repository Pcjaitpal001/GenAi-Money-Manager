package com.example.moneymanager.service;

import com.example.moneymanager.entity.User;
import com.example.moneymanager.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    public UserRepository userRepository;

    public List<User> getAllUser()
    {
        return userRepository.findAll();
    }

    public User getUser(Long id)
    {
        return userRepository.getById(id);
    }
    public List<User> addUser(List<User> user)
    {
      return userRepository.saveAll(user);
    }


    // public static List<User> allUserList = new ArrayList<>();
//    private final List<User> allUserList = new ArrayList<>();
//
//    public UserService() {
//        allUserList.add(new User(1L, "jaitpal@gmail.com", "Prathamesh", "pc1234"));
//        allUserList.add(new User(2L, "Prathamesh01@gmail.com", "PCjaitpal", "jj9423"));
//        allUserList.add(new User(3L, "Cvjaitpal", "chandradeep", "cv9423p"));
//    }
//
//    public List<User> getAllUser()  {
//
//      return allUserList;
//  }
//  public User getUser(Long id)  {
//      System.out.println("id"+id);
//      return allUserList.stream()
//              .filter(u -> u.getId().equals(id))
//              .findFirst()
//              .orElse(null);
//
//  }
//  public void addUser(List<User> user)
//  {
//      user.stream().map(u->allUserList.add(u)).forEach(u->System.out.println(u));
//  }


}
