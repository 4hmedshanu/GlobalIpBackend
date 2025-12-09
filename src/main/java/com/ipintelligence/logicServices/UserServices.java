package com.ipintelligence.logicServices;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ipintelligence.model.User;
import com.ipintelligence.repo.UserRepository;

@Service
public class UserServices {
	
	@Autowired
	UserRepository Userrepo;
	
	
    public User createUser(User user) {
    	user.setCreatedAt(LocalDateTime.now());
    	return  this.Userrepo.save(user);
    }

    public  User getUserById(int id) {
    	return this.Userrepo.findById(id).orElse(null);
    }
    
    
    public User getUserByEmail(String email) {
    	return this.Userrepo.findByEmail(email).get();
    }
    
    public User getUserByUserName(String UserName) {
    	return this.Userrepo.findByUsername(UserName).get();
    }

    public List<User> getAllUsers(){
    	return this.Userrepo.findAll();
    }

    public  User updateUser(int id, User user) {
    	
    	return null;
    }

    public void deleteUser(int id) {
    	
    }
	

}
