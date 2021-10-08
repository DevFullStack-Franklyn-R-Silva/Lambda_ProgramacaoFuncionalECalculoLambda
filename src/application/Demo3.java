package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo3 {

	public static void main(String[] args) {

		List<Integer> list =  Arrays.asList(3,5);
		
//		int sum =0;
//		for(Integer x : list) {
//			sum+=x;
//		}

		Integer sum = list.stream().reduce(0, Integer::sum);
		System.out.println(sum);
	}

}
