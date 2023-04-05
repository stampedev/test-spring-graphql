package de.kopfgarn.tmpl.domain;

import lombok.Data;

@Data
public class Address extends IdType {

    private String street;
    private String houseNr;
    private String zip;
    private String city;
    private String country;

    // one-to-one
    private Location location;

}
