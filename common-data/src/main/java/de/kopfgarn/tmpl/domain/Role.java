package de.kopfgarn.tmpl.domain;

import lombok.Data;

@Data
public class Role extends IdType {

    private String name;
    private String description;
    private RoleType type;

}
