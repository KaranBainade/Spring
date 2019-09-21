package com.curd.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curd.bo.EmployeeBO;
import com.curd.dao.EmployeeSearchDAO;
import com.curd.dto.EmployeeDTO;

@Service("empService")
public class EmployeeSearchServiceImpl implements EmployeeSearchService {
	@Autowired
	private EmployeeSearchDAO empDao;
	private String name;

//	public EmployeeSearchServiceImpl(EmployeeSearchDAO empDao, String name) {
//
//		this.empDao = empDao;
//		this.name = name;
//	}

	public String getName() {
		return name;
	}

	public List<EmployeeDTO> getAllEmps() throws Exception {
		String cond = "(";
		List<EmployeeBO> listBO = null;
		List<EmployeeDTO> listDTO = new ArrayList();

		int length = 0;
		// prepare Condition String
//		for (int i = 0; i < desgs.length; ++i) {
//			if (i == desgs.length - 1)
//				cond = cond + "'" + desgs[i] + "')";
//			else
//				cond = cond + "'" + desgs[i] + "',";
//		}
		// use DAO
		listBO = empDao.retriveAllEmps();
		// Convert ListBO to ListDTO
		for (EmployeeBO bo : listBO) {
			EmployeeDTO dto = new EmployeeDTO();
			BeanUtils.copyProperties(bo, dto);
			dto.setSno(listDTO.size() + 1);
			listDTO.add(dto);
		}
		/*
		 * listBO.forEach(bo->{ EmployeeDTO dto=new EmployeeDTO();
		 * BeanUtils.copyProperties(bo,dto); dto.setSno(listDTO.size()+1);
		 * listDTO.add(dto); });
		 */
		return listDTO;
	}

}// class
