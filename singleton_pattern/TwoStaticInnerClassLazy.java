package test.design_pattern.singleton_pattern;
/**
 * ���̰߳�ȫ;
 * final��Ա���� ���������ж������ʱ������ǰ�����final�ؼ��֣��Ǳ���˵���������һ������ʼ���㲻�ɸı䣬
 * ���ﲻ�ɸı����˼�Ի���������˵����ֵ���ɱ䣬
 * �����ڶ��������˵�����ò����ٱ䣬�����ñ�����ָ��Ķ����е����ݻ��ǿ��Ըı��;
 * @author zhaohe
 *
 *static����������ͨJava�࣬���ǿ��������ڲ���;
 *
 *final���εķ������ܱ����า�ǣ��������޸�
 */
public class TwoStaticInnerClassLazy {
	public static class SingletonHolder{
		//ͬʱ����instance��static final���ͣ���֤���ڴ���ֻ������һ��ʵ�����ڣ�����ֻ�ܱ���ֵһ�Σ��Ӷ���֤���̰߳�ȫ��
		//��ʹ�ڸ߲���������¶���߳�ͬʱ����getInstance()���� Ҳ�ܹ���֤ʵ����Ψһ��
		private static final TwoStaticInnerClassLazy INSTANCE=new TwoStaticInnerClassLazy();
	}
	private TwoStaticInnerClassLazy(){}
	//�ڲ���ֻ����Ҫ��ʱ��Żᱻ����������أ�ʵ���������أ�������Ҫ��ʱ���ʵ������һ��Manager,������Ψһ��һ��
	public static final TwoStaticInnerClassLazy getInstance(){
		
		return SingletonHolder.INSTANCE;
	}
	public static void main(String[] args) {
		getInstance();
	}
}