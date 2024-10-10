package codingdisscussions;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.Collections;

import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Talk> talks = Arrays.asList(
                new Talk("Understanding Java Maps", 45),
                new Talk("Advanced Python for Data Processing", 30),
                new Talk("Machine Learning Basics", 45),
                new Talk("Intro to Kubernetes", 5),
                new Talk("Effective REST APIs with Spring", 30),
                new Talk("Migrating from Monolith to Microservices", 60)
        );

        ConferenceScheduler scheduler = new ConferenceScheduler(talks);
        scheduler.schedule();
        scheduler.printSchedule();
    }
}
class ConferenceScheduler {

    private List<Talk> talks;

    private List<Track> tracks;

    public ConferenceScheduler(List<Talk> talks) {

        this.talks = new ArrayList<>(talks);

    }

    public void schedule() {

        Collections.sort(this.talks);

        tracks = new ArrayList<>();

        Track currentTrack = new Track();

        tracks.add(currentTrack);


        for (Talk talk : talks) {

            boolean talkAdded = false;

            for (Session session : currentTrack.getSessions()) {

                if (session.addTalk(talk)) {

                    talkAdded = true;

                    break;

                }

            }

            if (!talkAdded) {

                currentTrack = new Track();

                tracks.add(currentTrack);

                currentTrack.getSessions().get(0).addTalk(talk);

            }

        }

    }

    public void printSchedule() {

        int trackNumber = 1;

        for (Track track : tracks) {

            System.out.println("Track " + trackNumber++ + ":");

            for (Session session : track.getSessions()) {

                for (Talk talk : session.getTalks()) {

                    System.out.println(talk.getTitle() + " " + talk.getDuration() + "min");

                }

            }

            System.out.println();

        }

    }

}


class Track {

    List<Session> sessions;

    public Track() {

        sessions = new ArrayList<>();

        sessions.add(new Session(180)); // Morning session: 3 hours

        sessions.add(new Session(240)); // Afternoon session: 4 hours

    }

    public List<Session> getSessions() {

        return sessions;

    }

}



class Session {

    private int totalDuration;

    private List<Talk> talks;

    public Session(int duration) {

        this.totalDuration = duration;

        this.talks = new ArrayList<>();

    }

    public boolean addTalk(Talk talk) {

        if (talk.getDuration() <= totalDuration) {

            talks.add(talk);

            totalDuration -= talk.getDuration();

            return true;

        }

        return false;

    }

    public List<Talk> getTalks() {

        return talks;

    }

}

class Talk implements Comparable<Talk> {

    private String title;

    private int duration;

    public Talk(String title, int duration) {

        this.title = title;

        this.duration = duration;

    }

    public String getTitle() {

        return title;

    }

    public int getDuration() {

        return duration;

    }

    @Override

    public int compareTo(Talk other) {

        return Integer.compare(other.duration, this.duration); // Descending order

    }

}
