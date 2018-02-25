package com.buildtools.introduction.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by Mateusz Brycki on 25/02/2018.
 */
@Service
@Profile({"en", "default"})
public class EnglishGreetingService implements GreetingService {
    @Override
    public String greet() {
        return "Hello";
    }
}
