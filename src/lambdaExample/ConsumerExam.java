package lambdaExample;

import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerExam {

	
	public static void main(String[] args) {
		
		Consumer<String> consumer = text -> {
			
			int a = new Random().nextInt(45);
			
			System.out.println(text + a);
				
		};
		
		consumer.accept("����");
		
		BiConsumer<String, String> biConsumer = (t,u) -> System.out.println(t+" "+ u);
		biConsumer.accept("�ڹ�","����");
		
		System.out.println(jump("�ڹ�", "����"));
}
	
	public static String jump (String a, String b ){
		
		String sum ="";
		if(a!=null && b!= null){
			 sum = a+" " + b;
		}
		
		return sum;
	}
	
}
