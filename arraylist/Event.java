package arraylist;
public class Event{
    private String name;
    private String date;
    private String venue;
    

    public Event(String name, String date , String venue){
        this.name = name;
        this.date = date;
    }

    // getter method 
    public String getName(){
        return name;
    }

    public String getdate(){
        return date;
    }


    public String getVenue(){
        return venue;
    }
  


    //setter methods 

      public void setName(String name) {
        this.name = name;
    }



      public void setdate(String date) {
        this.date = date;
    }


    
      public void setVenue(String venue) {
        this,venue = venue;
    }

    
     @Override
    public String toString() {
        return "Event{ name='" + name + "', date=" + date + "', venue = " + venue + '}';
    }

}