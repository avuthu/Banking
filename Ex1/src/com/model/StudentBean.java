package com.model;

import java.io.Serializable;

import com.abstractdao.AbstractStudent;

public class StudentBean extends AbstractStudent implements Serializable
{
		public StudentBean() {
			// TODO Auto-generated constructor stub
		}
		
		public StudentBean(Integer sid) {
			super(sid);
		}

		
		public StudentBean(Integer sid, String sname, Integer sage, String saddr) {
			super(sid, sname, sage, saddr);
		}
}
