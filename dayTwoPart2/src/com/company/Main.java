package com.company;
import com.company.entity.NetflixMovie;
import com.company.entity.enumTest;
import com.company.library.NetflixMovieLibrary;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//	NetflixMovie movie1 = new NetflixMovie("DeadPool", "Tim Miller");
//	NetflixMovie movie2 = new NetflixMovie("Schindler's List", "Steven Spielburg");
//
//        List<NetflixMovie>allNetflixMovies = new ArrayList<>();
//        allNetflixMovies.add(movie1);
//        allNetflixMovies.add(movie2);
//
//        NetflixMovieLibrary netflix = new NetflixMovieLibrary(allNetflixMovies);
//        List<NetflixMovie> mvs = netflix.getTotalNetflixMoviesInNetflixLibrary();
//
//        for (NetflixMovie mv : mvs){
//            System.out.println("Title: "+mv.title +" and" + "Producer"  +mv.producer);
//        }
        enumTest weekday = new enumTest(enumTest.Day.MONDAY);
        weekday.weekendOrWeekday();

        enumTest weekend = new enumTest(enumTest.Day.MONDAY);
        weekend.weekendOrWeekday();
    }
}
