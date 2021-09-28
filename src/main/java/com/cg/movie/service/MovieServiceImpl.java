package com.cg.movie.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.movie.dao.IMovieDao;
import com.cg.movie.entities.Theatre;
import com.cg.movie.exception.TheatreAlreadyExistsException;


@Service
@Transactional
public class MovieServiceImpl implements  IMovieService{
	@Autowired
	private IMovieDao dao;

	@Override
	public Theatre registerMovie(Theatre theatre) throws Exception {
		boolean exists=theatre.getId()!=null && dao.existsById(theatre.getId());
        if(exists){
            throw new TheatreAlreadyExistsException("student already exists for id="+theatre.getId());
        }
        theatre = dao.save(theatre);
        System.out.println("returning saved stud: " + theatre);
        return theatre;
	}

//	@Override
//	public List<Theatre> findAll() {
//		System.out.println(dao.getClass().getName());
//		List<Theatre> list=dao.findAll();
//		return list;
//	}	



	
	
		
}
