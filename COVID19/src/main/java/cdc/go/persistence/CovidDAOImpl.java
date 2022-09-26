package cdc.go.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import cdc.go.domain.DomesticVO;

@Repository
public class CovidDAOImpl implements CovidDAO{
	
	@Inject
	private SqlSession session;
	
	private static final String namespace = "cdc.go.mapper.CovidMapper";
	
	@Override
	public List<DomesticVO> listAll() throws Exception {
		return session.selectList(namespace + ".listAll");
	}
}
