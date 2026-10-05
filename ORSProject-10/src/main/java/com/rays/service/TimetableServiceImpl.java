package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.TimetableDAOInt;
import com.rays.dto.TimetableDTO;

@Service
@Transactional
public class TimetableServiceImpl extends BaseServiceImpl<TimetableDTO, TimetableDAOInt> implements TimetableServiceInt{

}
