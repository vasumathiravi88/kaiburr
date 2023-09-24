package com.curd.mongo.service;
import java.util.List;



import com.curd.mongo.model.server;

public interface service {
	String saveServer(server server);
	List<server> getAllserver();
	server getserverByid(Long id);
	String deleteserverByid(Long id);
   
	 
	List<server> deleteserverByid();
	
    
}
