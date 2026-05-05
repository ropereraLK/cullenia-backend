package com.cullenia_backend.controller;

import com.cullenia_backend.dto.ListedEntity;
import com.cullenia_backend.service.ListedEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ListedEntityController {

    @Autowired
    private ListedEntityService listedEntityService;

    List<ListedEntity> entityList = new ArrayList<>();

    @GetMapping("/api/entities")
    public String getListedEntitiesByAlphabeticOrder() {
        try {
            entityList = listedEntityService.getListedEntities();
            entityList.size();
            return "Processed";
        } catch (Exception e) {
            return e.getMessage();
        }


    }
}
