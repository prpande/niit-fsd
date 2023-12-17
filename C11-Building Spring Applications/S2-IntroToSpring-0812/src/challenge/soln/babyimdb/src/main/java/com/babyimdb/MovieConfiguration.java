package com.babyimdb;

import org.springframework.context.annotation.Bean;

public class MovieConfiguration {
    @Bean("Shawshank")
    public Movie getMovie1(){
        return new Movie(1,
                "The Shawshank Redemption",
                "Frank Darabont",
                9.3f);
    }

    @Bean("Godfather")
    public Movie getMovie2(){
        return new Movie(2,
                "The Godfather",
                "Francis Ford Coppola",
                9.2f);
    }
}
