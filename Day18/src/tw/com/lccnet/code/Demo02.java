package tw.com.lccnet.code;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

import tw.com.lccnet.bean.Student;


/*
 * ArrayList 搜尋較快、新增刪除較慢
 * LinkedList 新增刪除較快、搜尋較慢
 * 可以上網查更詳細的介紹
 * array會需要重製一個記憶體
 * linked不需要 因為一個值已經有一塊記憶體，做相連即可
 * 
 */




public class Demo02 {

	
	
	@Test
	public void test02() {
		LinkedList<Student> list = new LinkedList<>();
		
		list.add(new Student(1,"rioe","ri3o2@fdotwej"));
		list.add(new Student(2,"rioe","ri3o2@fdotwej"));
		list.add(new Student(3,"rioe","ri3o2@fdotwej"));
		list.add(new Student(4,"rioe","ri3o2@fdotwej"));
		list.add(new Student(1,"rioe","ri3o2@fdotwej"));
		list.add(new Student(2,"rioe","ri3o2@fdotwej"));
		list.add(new Student(3,"rioe","ri3o2@fdotwej"));
		list.add(new Student(4,"rioe","ri3o2@fdotwej"));
		
		Iterator<Student> it = list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}
	
	
	
	
	
	
	
	@Test
	public void test01() {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		
		list.addFirst(100);
		list.addLast(1000);
		System.out.println("----------");
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		list.removeFirst();
		list.removeLast();
		
		
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}
}
