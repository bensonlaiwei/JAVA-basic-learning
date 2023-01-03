package tw.com.lccnet.demo5;

/*
 * 先繼承，後實作
 * class繼承class
 * class implements interface(多實作)
 * interface 繼承interface(多繼承)
 * 抽象、繼承、抽象
 */
public class MainClass extends TwoLayout implements FirstLayout,ThreeLayout
{

	@Override
	public void add(Student st) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
	}

	@Override
	public void updata(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void seach(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void seachName() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void searchAge() {
		// TODO Auto-generated method stub
		
	}

}
