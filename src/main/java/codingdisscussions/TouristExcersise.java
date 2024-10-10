package codingdisscussions;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
class Attractions{
    private String name;
    private LocalTime startTime;
    private LocalTime endTime;
    private double duration;

    public Attractions(String name, String startTime,String endTime,double duration){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

        this.name = name;
        this.startTime = LocalTime.parse(startTime, formatter);
        this.endTime = LocalTime.parse(endTime, formatter);
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public double getDuration() {
        return duration;
    }

    public LocalTime getStartTime() {
        return startTime;
    }
}
class Itinerary {
    private List<Attractions>attractions;
    LocalTime startTime;
    public Itinerary(List<Attractions>attractions,String startTime){
        this.attractions=attractions;
        DateTimeFormatter formater= DateTimeFormatter.ofPattern("HH:mm");
        this.startTime=LocalTime.parse(startTime,formater);
    }
    public List<String> schedule(){
        List<String> result=new ArrayList<>();

        attractions.sort((a1,a2)->((int)(Double.compare(a1.getDuration(),a2.getDuration()))));

//        attractions.sort((a1,a2)->(int)(a1.getDuration()-a2.getDuration()));

//        for(Attractions a:attractions){
//            result.add(a.getName());
//        }
        for(Attractions a:attractions){
            if(a.getStartTime().isAfter(startTime) && startTime.isBefore(a.getEndTime())) {

//                if(startTime.plus(Duration.ofHours((long)a.getDuration())).isAfter(a.getEndTime())) startTime=a.getEndTime();

                startTime=a.getStartTime();
                result.add(a.getName()+" visited");
                startTime.plus(
                        Duration.ofHours((long)a.getDuration())
                        .plusMinutes((long)(a.getDuration()%1 *60))
                );
            }
            else if(startTime.isAfter(a.getEndTime())){
                result.add(a.getName()+" can't visit because it is closed");
            }
            else{
                if(startTime.plus(Duration.ofHours((long)a.getDuration())).isAfter(a.getEndTime())) startTime=a.getEndTime();
                else{
                    result.add(a.getName()+" visited");
                    startTime.plus(
                            Duration.ofHours((long)a.getDuration())
                                    .plusMinutes((long)(a.getDuration()%1 *60))
                    );
                }
            }



        }
        return result;
    }

}
public class TouristExcersise {
    public static void main(String[] args) {

        List<Attractions>attractions=new ArrayList<>(List.of(
                new Attractions("Mueuem Of Art","09:00","17:00",2.0),
                new Attractions("central park","08:00","20:00",1.0),
                new Attractions("History Museum","10:00","18:00",3.0),
                new Attractions("Science Center","18:30","21:30",2.5)
        ));


        Itinerary it= new Itinerary(attractions,"08:00");
        List<String> result= it.schedule();
        System.out.println(result);
    }
}
