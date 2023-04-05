package de.kopfgarn.tmpl.domain;

import lombok.Data;

@Data
public class OrganisationUser extends User {

    private Role role;

}
