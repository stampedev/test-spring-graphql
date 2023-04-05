package de.kopfgarn.tmpl.domain;

import lombok.Data;

@Data
public class Topic extends IdType {

    private String name;
    private String description;

}
