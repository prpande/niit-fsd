package com.jap;

import java.util.*;

public class MovieService {

    public Map<Movie,Integer> getMovieWithRating(){

        //create five movie object by calling Movie class parameterized constructor
        Movie m1 = new Movie(101,"A Beautiful Mind","economic","11/1/2001");
        Movie m2 = new Movie(102,"Boiler Room","Crime","1/1/2000");
        Movie m3 = new Movie(103,"Buy and Cell","comedy","13/4/1988");
        Movie m4 = new Movie(104,"Corsair","Crime","11/11/1997");
        Movie m5 = new Movie(105,"Diamond Necklace","comedy","10/11/2021");

        //create HashMap object and add all the Movie object inside it
        Map<Movie,Integer> movieRatingMap = new HashMap<>();

        //Key will be movie object and value will be rating ranging from 1 to 5
        movieRatingMap.put(m1, 5);
        movieRatingMap.put(m2, 3);
        movieRatingMap.put(m3, 3);
        movieRatingMap.put(m4, 4);
        movieRatingMap.put(m5, 4);

        //return the HashMap object
        return movieRatingMap;
    }

    public Set<String> getMovieNameWithRating4(Map<Movie,Integer> map,int rating) {
        //Create a TreeSet object
        Set<String> moviesWithRating4 = new TreeSet<>();

        //Use entrySet() method to iterate through the map object
        for (Map.Entry<Movie, Integer> entry : map.entrySet()) {
            //retrieve all the movies name having rating as 4
            //Store the movie name in TreeSet object
            if (entry.getValue() == 4) {
                moviesWithRating4.add(entry.getKey().getMovieName());
            }
        }

        //return the TreeSet object
        return moviesWithRating4;
    }

    public List<String> getMovieWithHighestRating(Map<Movie,Integer> map){
        //Create a ArrayList object of type String
        List<String> topRatedMovieList = new ArrayList<>();

        //get the first value from the map and store it in the variable max
        // Use entrySet().iterator().next() method to retrieve the first value of Map object
        Iterator<Map.Entry<Movie, Integer>> iterator = map.entrySet().iterator();
        Map.Entry<Movie, Integer> firstEntry= iterator.next();
        String topRatedMovie = firstEntry.getKey().getMovieName();
        Integer topRating = firstEntry.getValue();

        //get the name of the movie with the highest rating and add it in the List created
        while (iterator.hasNext()){
            Map.Entry<Movie, Integer> entry = iterator.next();
            if(entry.getValue() > topRating){
                topRating = entry.getValue();
                topRatedMovie = entry.getKey().getMovieName();
            }
        }

        //return the List object
        topRatedMovieList.add(topRatedMovie);
        return topRatedMovieList;
    }
    public Map<String,String> getAllMoviesWithComedy(Map<Movie,Integer> map) {
        //Create a Map object
        Map<String, String> comedyMovies = new HashMap<>();

        //use entrySet to iterate through the Map object
        //get all the movies name and their released date for the movie of genre "comedy"
        //store movie name with release date in the above created Map object and return the Map object
        for (Map.Entry<Movie, Integer> entry : map.entrySet()) {
            if (entry.getKey().getGenre().equals("comedy")) {
                comedyMovies.put(entry.getKey().getMovieName(), entry.getKey().getReleaseDate());
            }
        }

        return comedyMovies;
    }
    public static void main(String[] args) {
        MovieService movieService = new MovieService();
        Map <Movie,Integer> map = movieService.getMovieWithRating();
        Set set = movieService.getMovieNameWithRating4(map,4);
        System.out.println("Rating 4" + set);
        Map map1 = movieService.getAllMoviesWithComedy(map);
        System.out.println("Comedy Movie " + map1);
        List list = movieService.getMovieWithHighestRating((Map<Movie, Integer>) map);
        System.out.println("--------------");
        System.out.println("Highest Rating " +list);
    }
}
