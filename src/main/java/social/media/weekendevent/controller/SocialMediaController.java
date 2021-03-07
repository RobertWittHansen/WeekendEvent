package social.media.weekendevent.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import social.media.weekendevent.model.Event;

import java.util.ArrayList;


@Controller // @Annotation. oplyser spring at klassen er en controller.
public class SocialMediaController
{
    ArrayList<Event> eventList = new ArrayList<Event>();

    @GetMapping("/") // @GetMapping tager imod en getrequest fra browseren.
    public String index()
    {
        return "index"; // index er den html fil der returneres.
    }

    @GetMapping("/createWeekendEvents") // createWeekendEvents er den html fil der returneres (get).
     public String weekendEventMethod()
    {
       return "createWeekendEvents";
    }

    @PostMapping("/signUp")
    public String signUp(@RequestParam("eventType") String eventType, @RequestParam("date") String date, @RequestParam("fname") String fname, @RequestParam("lname") String lname, @RequestParam("description") String description)
    {
        Event newEvent = new Event(eventType,date, fname, lname, description);
        eventList.add(newEvent);
        return "redirect:/succes";
    }

    @GetMapping("/succes")
    public String succes(Model model)
    {
        model.addAttribute("event", eventList.get(eventList.size()-1));
        return "succes";
    }

    @GetMapping("/overview")
    public String overview(Model model)
    {
        model.addAttribute("events", eventList);
        return "overview";
    }



}
