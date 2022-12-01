package com.example.demo.controller;







import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.User;
import com.example.demo.service.UserService;

@RestController
public class UserController {
	
	@Autowired
 UserService userService;
	@PostMapping("/add")
	public User saveuser(@RequestBody User user) {
		return userService.saveuser(user);
		
	}
	@GetMapping("/getAllUsers")
    public List<User> getAllStudents(){
        return userService.getAllUsers();
    }
	
	@GetMapping("/getById/{id}")
    public User getById(@PathVariable(value = "id")int id){
        return userService.getById(id);
    }

    @PutMapping("/updateUser/{id}")
    public User updateUser(@RequestBody User user,@PathVariable(value = "id")int id){
        return userService.updateUser(user,id);
    }
    
    @DeleteMapping("/deleteById/{id}")
    public String deleteById(@PathVariable(value = "id")int id){
    	userService.deleteById(id);
        return "Deleted";
    }
    
    @GetMapping("/getAllUserPaginated")
    public List<User> getAllUsersPaginated(@RequestParam int pageNo,@RequestParam int pageSize){
        return userService.getAllUserPaginated(pageNo,pageSize);
    }
    @GetMapping("/getAllUserByAge")
    public List<User> findAllUserByAge(@RequestParam int start,@RequestParam int end){
        return userService.findAllByUserAge(start,end);
    }
    @GetMapping("/getAllUserByFirstName")
    public  List<User> getUserByfirstname(@RequestParam String firstname) {
		return userService.getUserByfirstname(firstname);
		
	}
//    @GetMapping("/getUserByFirstnameandLastname")
//    public List<User> getUserByfirstname(@RequestParam String firstname, @RequestParam String lastname){
//		return userService.getUserByfirstnamelastname(firstname, lastname);
//		
//	
//		
//    	
//    }
    
    

    
	
    

}
