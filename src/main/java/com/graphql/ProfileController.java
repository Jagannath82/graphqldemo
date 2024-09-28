package com.graphql;


import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.graphql.model.Profile;

@Controller
public class ProfileController {
    
    @QueryMapping
    public Profile profileById(@Argument Integer id){
        return Profile.getProfileById(id);
    }
}
