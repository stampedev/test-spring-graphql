package de.kopfgarn.tmpl.domain;

import lombok.Data;

@Data
public class Location extends IdType {

    private String geoN;
    private String geoE;

}
