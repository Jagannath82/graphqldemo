package com.graphql.model;

import java.util.Arrays;
import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Profile {
    
    private Integer id;
    private String firstName;
    private String lastName;
    private String displayName;
    private String phoneNumber;

    public static List<Profile> profiles = Arrays.asList(Profile.builder().displayName("Jagan").firstName("Jagannath").lastName("Ghosh").phoneNumber("909-987-8898").build());

    public static Profile getProfileById(Integer id){
        return profiles.get(0);
    }
}
