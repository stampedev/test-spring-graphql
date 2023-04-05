package de.kopfgarn.tmpl.domain;

import lombok.Data;

import java.util.List;

@Data
public class Organisation extends IdType {

    private String name;
    private String description;
    private String type;

    // one-to-many
    private List<OrganisationAddress> addresses;
    private List<OrganisationUser> users;
}
