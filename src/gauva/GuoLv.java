package gauva;

import java.util.Collection;
import java.util.List;

import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;

public class GuoLv {

	public static void main(String[] args) {
		//predicate
				//Function
				//list 的静态初始化
				List <String> list = Lists.newArrayList("moom","son","bjh");
				
				//找出回文  就是反过来也一样的单词
				//filter方法 类似comparable    下面是过滤器  类似comparator
				Collection <String> col=Collections2.filter(list,new Predicate<String>() {

					@Override
					public boolean apply(String input) {
						//业务逻辑
						return new StringBuilder(input).reverse().toString().equals(input);
					}
					
				});
				for(String temp:col) {
					System.out.println(temp);
				}

	}

}
