package service;

import dao.PhoneDAO;
import model.Phone;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/phones")
public class PhoneService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Phone> getAllPhones(){
        return PhoneDAO.getAllPhones();
    }

    @Path("/{phoneId}/activate")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Phone activatePhone(@PathParam("phoneId") Integer id){
        return PhoneDAO.activatePhone(id);
    }
}
