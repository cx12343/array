package gauva;

import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

public class OnlyRead {
	public static void main(String[] args) {
		//只可读设置
		List<String> xx=ImmutableList.of("aa", "bbb", "sss");
		//xx.add("sd");//不可执行操作
		test01();
		Set<Long> set =Sets.newHashSet();
		set.add(111111111111111L);
		set.add(11111111L);
		Collection<String> test01=Collections2.transform(set,new Function<Long,String>() {

			@Override
			public String apply(Long input) {
				// TODO Auto-generated method stub
				return new SimpleDateFormat("yyyy-MM-dd").format(input);
			}});
		for(String temp:test01) {
			System.out.println(temp);
		}
	}
	public static void test01() {
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
