package de.kopfgarn.tmpl.domain;

import lombok.Data;

import java.util.List;

@Data
public class Offer extends IdType {

    private String title;
    private String description;

    // one-to-one
    private Address address;
    private Contact contact;
    private Organisation organisation;

    // one-to-many
    private List<Topic> topics;
}
