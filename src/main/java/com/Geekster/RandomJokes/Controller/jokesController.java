package com.Geekster.RandomJokes.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class jokesController {
        static ArrayList<String> jokesList =  new ArrayList<>();
        @PostMapping(value = "/jokes")
        public String savedJokes(@RequestBody String jokes){
            jokesList.add(jokes);
            return "Joke Saved";
        }

    @GetMapping(value = "/jokes")
    public String getJokes(){
//        jokesList.add("I invented a new word!\n" +
//                "Plagiarism!");
//        jokesList.add("Did you hear about the mathematician who’s afraid of negative numbers?\n" +
//                "He’ll stop at nothing to avoid them.");
//        jokesList.add("Hear about the new restaurant called Karma?\n" +
//                "There’s no menu: You get what you deserve.");
//        jokesList.add("A woman in labor suddenly shouted, “Shouldn’t! Wouldn’t! Couldn’t! Didn’t! Can’t!”\n" +
//                "“Don’t worry,” said the doc. “Those are just contractions.”");
//        jokesList.add("Did you hear about the actor who fell through the floorboards?\n" +
//                "He was just going through a stage.");
        int randomNumber = (int) (Math.random() * ((jokesList.size()-1) + 1));
        return jokesList.get(randomNumber);
    }
}
