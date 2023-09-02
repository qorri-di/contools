package com.qodev.tech.controller.masterdata.role;

import com.qodev.tech.common.GenRespDTO;
import com.qodev.tech.dto.request.role.roleRequest;
import com.qodev.tech.dto.request.searchRequest;
import com.qodev.tech.service.masterdata.role.roleService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.text.ParseException;

@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Path("/contools/v1-api/role")
public class roleController {
    @Inject
    roleService rls;

    @POST
    @Path("/save")
    public GenRespDTO saveController(roleRequest req) {
        return rls.save(req);
    }

    @POST
    @Path("/delete")
    public GenRespDTO deleteController(roleRequest req){
        return rls.delete(req);
    }

    @GET
    @Path("/read")
    public GenRespDTO readController(searchRequest req){
        return rls.read(req);
    }
}
