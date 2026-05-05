package com.cullenia_backend.service;

import com.cullenia_backend.api.CompanyApi;
import com.cullenia_backend.dto.ListedEntity;
import com.cullenia_backend.util.Tasks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.autoconfigure.JacksonProperties;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

@Service
public class ListedEntityService {

    @Autowired
    private CompanyApi companyApi;
    @Autowired
    private ExecutorService executorService;

    private List<ListedEntity> companyList = new ArrayList<>();

    public List<ListedEntity> getListedEntities() throws Exception {
        Future<List<ListedEntity>> future = executorService.submit(Tasks.getListedEntitiesTask(companyApi));
        companyList =  future.get();
        return companyList;

    }


}
