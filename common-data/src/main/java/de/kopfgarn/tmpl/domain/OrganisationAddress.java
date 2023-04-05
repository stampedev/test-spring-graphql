package de.kopfgarn.tmpl.domain;

import lombok.Data;

@Data
public class OrganisationAddress extends Address {

    private String description;
    private int order;

    // one-to-one
    private Contact contact;

}
