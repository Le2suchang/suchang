package cdc.go.service;

import java.util.List;

import cdc.go.domain.DomesticVO;

public interface CovidService {
	
	public List<DomesticVO> listAll() throws Exception;
}
