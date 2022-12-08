package com.resource.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.resource.Entity.Resource;

@Service
public class ResourceServiceImpl implements IResourceService {
	
	List<Resource> list = List.of(
			new Resource(1L,"satz@gmail.com", "Sathish", "Full Stack Dev", 1001L),
			new Resource(2L,"ram@gmail.com", "Ram", "React Dev", 1002L),
			new Resource(3L,"vicky@gmail.com", "Vicky", "Java Dev", 1003L),
			new Resource(4L,"dinesh@gmail.com", "Dinesh", "Full Stack Dev", 1004L),
			new Resource(5L,"ramesh@gmail.com", "Ramesh", "Marketing Dev", 1005L),
			new Resource(6L,"suresh@gmail.com", "Suresh", "Sales Dev", 1006L),
			new Resource(7L,"vivek@gmail.com", "Vivek", "Jenkins Dev", 1007L),
			new Resource(8L,"mala@gmail.com", "Mala", "AWS", 1008L),
			new Resource(9L,"heena@gmail.com", "Heena", "Angular Dev", 1009L),
			new Resource(10L,"sundar@gmail.com", "Sundar", "React Dev", 1001L));
			

	@Override
	public List<Resource> getResourceForUsers(Long userID) {

		return list.stream().filter(resource -> resource.getUserID().equals(userID)).collect(Collectors.toList());
	}

}
