package de.kopfgarn.tmpl.service;

import org.springframework.stereotype.Service;

@Service
public class GrpcTmplService {

    public String test(String testin) {
        return testin;
    }
}
