package com.yidu.hj.formBean;

import java.util.Arrays;

import com.yidu.base.allEntity.Columns;

public class ColumnsClild extends Columns{
	private String [] array;

	public String[] getArray() {
		return array;
	}

	public void setArray(String[] array) {
		this.array = array;
	}

	public ColumnsClild(String[] array) {
		super();
		this.array = array;
	}

	public ColumnsClild() {
		super();
	}

	@Override
	public String toString() {
		return "Columns [array=" + Arrays.toString(array) + "]";
	}
}
