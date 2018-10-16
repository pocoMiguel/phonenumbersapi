package service;

import dao.CustomerDAO;
import model.Phone;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import java.util.List;

@Path("/customer")
public class CustomerService {

    @GET
    @Path("{customerId}/phones")
    public List<Phone> getCustomerPhones(@PathParam("customerId") Integer id){
        return CustomerDAO.getCustomerPhones(id);
    }
}
