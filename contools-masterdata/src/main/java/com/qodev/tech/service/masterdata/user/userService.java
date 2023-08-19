package com.qodev.tech.service.masterdata.user;

import com.qodev.tech.common.GenRespDTO;
import com.qodev.tech.common.helpers.GlobalFunction;
import com.qodev.tech.dto.request.searchRequest;
import com.qodev.tech.dto.request.user.registerRequest;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;

@ApplicationScoped
@Transactional
public class userService extends GlobalFunction {

    public GenRespDTO save(registerRequest req){
        if ( req.getUserId() == null) {
            return create(req);
        } else {
            return update(req);
        }
    }

    private GenRespDTO create(registerRequest req) {
        return null;
    }

    public GenRespDTO read(searchRequest req){
        GenRespDTO response = new GenRespDTO();
        if (req == null) {
            return response.noDataFoundResponse("Please page and size cannot be empty");
        } else if (req.getId() == null && req.getSearch() == null && req.getCategory() == null) {
            return getAll(req);
        } else if (req.getId() != null) {
            return getById(req);
        } else if (req.getCategory() != null) {
            if (req.getCategory().equalsIgnoreCase("all category")) {
                req.setCategory(null);
                return getAll(req);
            }
            return getByKategory(req);
        }else if (req.getSearch() != null) {
            return getBySearch(req);
        }
        return response.noDataFoundResponse("Data not found in search");
    }

    private GenRespDTO getAll(searchRequest req){
        return null;
    }

    private GenRespDTO getById(searchRequest req){
        return null;
    }

    private GenRespDTO getByKategory(searchRequest req){
        return null;
    }

    private GenRespDTO getBySearch(searchRequest req){
        return null;
    }

    private GenRespDTO update(registerRequest req) {
        return null;
    }

    public GenRespDTO delete(registerRequest req){
        return null;
    }
}
