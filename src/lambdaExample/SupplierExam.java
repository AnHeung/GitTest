package lambdaExample;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class SupplierExam {
	
	public static void main(String[] args) {
		
		
		IntSupplier int2 = ()->{return new Random().nextInt(50);};
		Supplier<String> st = ()->{return "d";};
		System.out.println(st.get());
		System.out.println(int2.getAsInt());
		
//		
		List<Integer> list = Arrays.asList(1,2,3);
//		
		for(Integer i  : list){
			System.out.println(i);
		}
//		
		list.forEach(System.out::println);
		
	}

}
