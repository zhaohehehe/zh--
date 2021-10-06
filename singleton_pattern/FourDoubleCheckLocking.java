package test.design_pattern.singleton_pattern;
/**
 * ���̰߳�ȫ��
 * 
 * @author zhaohe
 *
 */
public class FourDoubleCheckLocking {
	private volatile static FourDoubleCheckLocking singleton;
	private FourDoubleCheckLocking(){}
	public static FourDoubleCheckLocking getSingleton(){
		if(singleton==null){
			//�����������
			synchronized(FourDoubleCheckLocking.class){
				if(singleton==null){
					singleton=new FourDoubleCheckLocking();
				}
			}
		}
		return singleton;
	}

}