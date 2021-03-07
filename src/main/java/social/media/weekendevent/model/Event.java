package social.media.weekendevent.model;

public class Event
{
    private String eventName;
    private String firstName;
    private String lastName;
    private String date;
    private String eventDescription;

    // constructer.
    public Event(String eventName, String firstName, String lastName, String date, String eventDescription)
    {
       this.eventName = eventName;
       this.firstName = firstName;
       this.lastName = lastName;
       this.date = date;
       this.eventDescription = eventDescription;

    }

    // Method Getter.
    public String getEventName(){ return eventName; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getDate() { return date; }
    public String getEventDescription() { return eventDescription;}





}
