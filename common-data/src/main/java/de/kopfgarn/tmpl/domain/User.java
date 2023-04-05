package de.kopfgarn.tmpl.domain;

import lombok.Data;

import java.util.List;

@Data
public class User extends IdType {

    private double searchRadius;

    // one-to-one
    private Address address;
    private Role platformRole;
    private Location searchBase;
    private Contact contact;

    // one-to-many
    private List<TopicSubscription> subscriptions;
}
