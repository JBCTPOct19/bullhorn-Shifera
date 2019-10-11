package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {
    @Autowired
    MessageRepository messageRepository;

    @Autowired
    CloudinaryConfig cloudinaryConfig cloudc;

    @RequestMapping("/")
    public String listMessages(Model model){
        model.addAttribute("messages", messageRepository.findAll());
        return"list";
    }

    @GetMapping("/add")
    public String newMessage(Model model){
        model.addAttribute("message", new Message());
        return "form";
    }
    @PostMapping("/add")
    public String processMessage(@ModelAttribute Message message,
                                 @RequestParam())
}
