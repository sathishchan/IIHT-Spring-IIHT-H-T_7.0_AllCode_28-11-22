package com.hr.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hr.Entity.HR;

@Service
public class HrServiceImpl implements IhrService {
	
	//fake HR List
	List<HR> list = List.of( 
			new HR(1001L, " Sathish", "9876543234"),
			new HR(1002L, " Vivek", "9634567843"),
			new HR(1003L, " Arun", "8778846763"),
			new HR(1004L, " Meena", "9878091436"),
			new HR(1005L, " Raja", "9879887763"),
			new HR(1006L, " Mala", "9789867358"));

	@Override
	public HR getHR(Long id) {
		// TODO Auto-generated method stub
		return list.stream().filter(hr -> hr.getUserID().equals(id)).findAny().orElse(null);
	}

}
