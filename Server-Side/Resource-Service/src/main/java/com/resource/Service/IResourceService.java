package com.resource.Service;

import java.util.List;

import com.resource.Entity.Resource;

public interface IResourceService {
	
	public List<Resource> getResourceForUsers(Long userID);

}
