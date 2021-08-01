package com.example.demo.controller;

import com.example.demo.eneity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserHandler {

    @Autowired
    private UserService userService;

    @GetMapping("/findall")
    public ModelAndView findAll(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject("list", userService.findAll());
        return modelAndView;
    }

    @GetMapping("/findbyid/{id}")
    public ModelAndView findById(@PathVariable("id") Integer id){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("update");
        modelAndView.addObject("user", userService.findById(id));
        return modelAndView;
    }

    @PostMapping("/save")
    public String save(User user){
        userService.save(user);
        return "redirect:/user/findall";
    }

    @GetMapping("/deletebyid/{id}")
    public String deleteById(@PathVariable("id") Integer id){
        System.out.println("invoked");
        userService.deleteById(id);
        return "redirect:/user/findall";
    }

    @PostMapping("/update")
    public String update(User user){
        userService.update(user);
        return "redirect:/user/findall";
    }

}
