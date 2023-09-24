package com.curd.mongo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curd.mongo.model.server;
import com.curd.mongo.repository.ServerRepository;
@Service
public  class serverimpl implements service{
	
	@Autowired
    ServerRepository serverrepo;
	@Override
	public String saveServer(server server) {
		// TODO Auto-generated method stub
		serverrepo.save(server);
		
		return "server id:"+server.getserverid()+" is saved succesfully";
	}

	@Override
	public List<server> getAllserver() {
		// TODO Auto-generated method stub
		return serverrepo.findAll();
	}
    @Override
	public  server getserverByid(Long id) {
		// TODO Auto-generated method stub
    	
		return serverrepo.findById(id).get();
				
		
	}

	@Override
	public String deleteserverByid(Long id) {
		// TODO Auto-generated method stub
		boolean delete=false;
		if(serverrepo.existsById(id)) {
			serverrepo.deleteById(id);
			delete=true;
		}
		return "server with id:"+id+"deleted status"+delete;
	
	}

	@Override
	public List<server> deleteserverByid() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

	
}
