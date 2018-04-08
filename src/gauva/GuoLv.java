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
