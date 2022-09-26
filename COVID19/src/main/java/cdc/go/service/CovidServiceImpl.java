package cdc.go.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import cdc.go.domain.DomesticVO;
import cdc.go.persistence.CovidDAO;

@Service
public class CovidServiceImpl implements CovidService{
	
	@Inject
	private CovidDAO dao;
	
	@Override
	public List<DomesticVO> listAll() throws Exception{
		return dao.listAll();
	}
}
