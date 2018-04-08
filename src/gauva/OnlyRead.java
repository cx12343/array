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
		//ֻ�ɶ�����
		List<String> xx=ImmutableList.of("aa", "bbb", "sss");
		//xx.add("sd");//����ִ�в���
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
				//list �ľ�̬��ʼ��
				List <String> list = Lists.newArrayList("moom","son","bjh");
				
				//�ҳ�����  ���Ƿ�����Ҳһ���ĵ���
				//filter���� ����comparable    �����ǹ�����  ����comparator
				Collection <String> col=Collections2.filter(list,new Predicate<String>() {

					@Override
					public boolean apply(String input) {
						//ҵ���߼�
						return new StringBuilder(input).reverse().toString().equals(input);
					}
					
				});
				for(String temp:col) {
					System.out.println(temp);
				}
	}
}
