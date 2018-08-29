package com.yidu.hj.entity;

import java.util.Arrays;

public class Columns extends com.yidu.base.allEntity.Columns{
	private String [] array;

	public String[] getArray() {
		return array;
	}

	public void setArray(String[] array) {
		this.array = array;
	}

	public Columns(String[] array) {
		super();
		this.array = array;
	}

	public Columns() {
		super();
	}

	@Override
	public String toString() {
		return "Columns [array=" + Arrays.toString(array) + "]";
	}
}
