package test.design_pattern.singleton_pattern;
/**
 * �߳�ͬ��
 * @author zhaohe
 *
 */
public class OneNoLazy {
	private static OneNoLazy instance=new OneNoLazy();
	private OneNoLazy(){}
	public static OneNoLazy getInstance(){
		return instance;
	}
	

}
