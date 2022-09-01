//20 division 5

package com.Stream;

import java.util.stream.Stream;

public class division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res=Stream.iterate(1,i->i+1).limit(20).filter(i->i%5==0).reduce(0, (i,j)->i+j);
		System.out.println(res);
	}

}
