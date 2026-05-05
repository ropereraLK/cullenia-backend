package com.cullenia_backend.util;

import com.cullenia_backend.api.CompanyApi;
import com.cullenia_backend.dto.ListedEntity;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

public class Tasks {
    public static Callable<List<ListedEntity>> getListedEntitiesTask(CompanyApi companyApi) {
        return companyApi::getListedEntitiesAlphabetical;
    }
}
