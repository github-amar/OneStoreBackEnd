package com.onestore.user.details;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * @author <a href="mailto:bill@burkecentral.com">Bill Burke</a>
 * @version $Revision: 1 $
 */
@Path("/")
public interface IUserInformation
{
   @GET
   @Path("userinfo")
   @Produces("text/plain")
   String getUserInfo(String userId);

   @POST
   @Path("userinfo")
   @Consumes("application/json")
   String saveUserInfo(String body);
   
   @PUT
   @Path("userinfo")
   @Consumes("application/json")
   String updateUserInfo(String body);

   @DELETE
   @Path("userinfo")
   @Consumes("application/json")
   String deleteUserInfo(String body);
}
