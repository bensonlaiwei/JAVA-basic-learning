package tw.com.code.demo;
/**
 * 
 * @author pas90
 *
 *TODO:
 *格式化符號
 * %d 數字
 * %s 字串
 * %c 字母
 * %f 浮點數
 * 
 *
 *
 */
public class Demo05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("第一個數字%d加上第二個數字%d\n",10,20);
		System.out.printf("我在學%s，進行轉職到%s\n","JAVA","money");
		System.out.printf("我在學%C在學%s,一共學了%d個月\n",'c',"JAVA",2);
		System.out.printf("%f\n",23.6686886);
		System.out.printf("%.4f9.259\n",23.6686886);
		System.out.printf("%5.3f\n",23.668699999999886);//前面放五格 後面限定3各
	}

}
