package com.onestore.user.details.impl;

import javax.ejb.Stateless;
import com.google.gson.Gson;
import com.onestore.model.UserDetail;
import com.onestore.user.dao.IUserInformationDAO;
import com.onestore.user.dao.impl.UserInformationDAO;
import com.onestore.user.details.IUserInformation;



/**
 * @author <a href="mailto:bill@burkecentral.com">Bill Burke</a>
 * @version $Revision: 1 $
 */
@Stateless
public class UserInformation implements IUserInformation
{
		
	
   @Override
public String getUserInfo(String userId) {
	
	return "ravi";
}
@Override
public String saveUserInfo(String userinfo) {
	
	try{
	Gson gson = new Gson();
	UserDetail userdetails=gson.fromJson(userinfo, UserDetail.class);
	System.out.println(userdetails.getUserAddresses().getClass());
	
	if(userdetails.getUserAddresses().iterator().hasNext())
		userdetails.getUserAddresses().iterator().next().setUserDetail(userdetails);
	System.out.println("UserInfo from node:  "+userinfo);
	IUserInformationDAO iUserInformationDAO=new UserInformationDAO();
	iUserInformationDAO.save(userdetails);
	return "Inserted Successfully!!!";
	}
	
	catch (Exception e) {
		e.printStackTrace();
		return "Not Inserted Successfully";
	}
	
}
@Override
public String updateUserInfo(String body) {
	
	return null;
}
@Override
public String deleteUserInfo(String body) {
	
	return null;
}






}
