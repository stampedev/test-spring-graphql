package de.kopfgarn.tmpl.domain;

import lombok.Data;

import java.util.List;

@Data
public class TopicSubscription {

    private List<Topic> topics;
    private String email;
    private String mobile;

}
