package com.mundiaem.moviecatalogueservice.controllers;

import com.mundiaem.moviecatalogueservice.models.CatalogItem;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogueResource {

    @RequestMapping(method = RequestMethod.GET, value = "/{userId}")
    public List<CatalogItem> getCatalogItems(@PathVariable("userId") Integer userId) {
        return Collections.singletonList(new CatalogItem("J.I GOE", "Action theatre", 8));
    }
}
