package com.example.Event_Management_System.Controller;

import com.example.Event_Management_System.Models.Event;
import com.example.Event_Management_System.Service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EventController {
    @Autowired
    private EventService eventService;
    @GetMapping("/create")
    public String showForm(Model model){
        model.addAttribute("event",new Event());
        return "create-event";
    }
    @PostMapping("/save")
    public String saveEvent(@ModelAttribute Event event){
        eventService.addEvent(event);
        return "redirect:/events";
    }

    @GetMapping("/events")
    public String viewEvents(Model model){
        model.addAttribute("events",eventService.getAllEvents());
        return "view-events";
    }

}
