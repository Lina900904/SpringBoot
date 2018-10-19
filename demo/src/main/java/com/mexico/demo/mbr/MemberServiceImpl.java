package com.mexico.demo.mbr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mexico.demo.mapper.MemberMapper;

@Service
public class MemberServiceImpl implements MemberService{
	@Autowired MemberMapper mapper;
	@Override
	public String countAll() {
		// TODO Auto-generated method stub
		return mapper.countAll();
	}
	
}
