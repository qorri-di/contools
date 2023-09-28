package com.qodev.tech.controller.cryptograph;

import com.qodev.tech.common.GenericResponseDTO;
import com.qodev.tech.dto.request.encodeRequest;
import com.qodev.tech.service.cryptograph.aesService;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.security.*;

@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Path("/contools/v1-api/cryptography/encode")
public class aesController {

    @Inject
    aesService aesService;

    @POST
    @Path("/aes")
    public GenericResponseDTO encodeAes(encodeRequest req) throws NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, BadPaddingException, InvalidKeyException, NoSuchProviderException {
        switch (req.getCategorise()){
            case "aes32":
                return aesService.aes32(req);
            case "aes64":
                return aesService.aes64(req);
            case "aes128":
                return aesService.aes128(req);
            case "aes192":
                return aesService.aes192(req);
            case "aes256":
                return aesService.aes256(req);
            default:
                return null;
        }
    }
}
