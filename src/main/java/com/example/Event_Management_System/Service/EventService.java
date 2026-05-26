package com.example.Event_Management_System.Service;

import com.example.Event_Management_System.Models.Event;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EventService {
    private List<Event> events=new ArrayList<>();
    public void addEvent(Event event){
        events.add(event);
    }
    public List<Event> getAllEvents(){
        return events;
    }
}
