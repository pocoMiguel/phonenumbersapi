package service;

import dao.CustomerDAO;
import model.Phone;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/customer")
public class CustomerService {

    @GET
    @Path("/{customerId}/phones")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Phone> getCustomerPhones(@PathParam("customerId") Integer id){
        return CustomerDAO.getCustomerPhones(id);
    }
}
