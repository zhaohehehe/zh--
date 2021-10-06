package test.design_pattern.proxy_pattern;

public class ProxySubject extends Subject {

	private RealSubject realSubject;
	/**
	 * ��ʵ��ɫ����
	 */
	@Override
	public void request() {
		
		this.preRequest();//��ʡ

		if(null==realSubject){
			realSubject=new RealSubject();
		}
		realSubject.request();
		
		this.postRequest();//��ʡ
	}
	/**
	 * ����ʵ��ɫ����֮ǰ�������ɫ���ӹ���
	 */
	private void preRequest(){
		System.out.println("ProxySubject Pre Request!");
	}
	/**
	 * ����ʵ��ɫ����֮�󣬴����ɫ���ӹ���
	 */
	private void postRequest(){
		System.out.println("ProxySubject Post Request!");
	}

}
