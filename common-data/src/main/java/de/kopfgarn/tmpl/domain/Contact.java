package de.kopfgarn.tmpl.domain;

import lombok.Data;

@Data
public class Contact extends IdType {

    private String email;
    private String mobile;
    private String fax;
    private String web;
    private String forename;
    private String surname;

}
