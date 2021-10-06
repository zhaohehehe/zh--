package test.design_pattern.decoration_pattern;

public class ConcreteDecorator1 extends Decorator {

	//��Ϊ����û���޲ι��췽��������Ҫ���������вι��췽��
	public ConcreteDecorator1(Component component) {
		super(component);
	}
	@Override
	public void doSomething() {
		super.doSomething();
		
		this.doAnotherthing();
	}
	private void doAnotherthing(){
		System.out.println("����B");
	}
}