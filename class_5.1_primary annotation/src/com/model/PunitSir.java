package com.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component
//@Primary
public class PunitSir extends Teacher{
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "punit Sir";
	}
}
