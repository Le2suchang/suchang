package cdc.go.persistence;

import java.util.List;

import cdc.go.domain.DomesticVO;

public interface CovidDAO {
	
	public List<DomesticVO> listAll() throws Exception;
	
}
