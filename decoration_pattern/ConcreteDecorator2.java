package test.design_pattern.decoration_pattern;

public class ConcreteDecorator2 extends Decorator {

	//��Ϊ����û���޲ι��췽��������Ҫ���������вι��췽��
	public ConcreteDecorator2(Component component) {
		super(component);
	}
	@Override
	public void doSomething() {
		super.doSomething();
		
		this.doAnotherthing();
	}
	private void doAnotherthing(){
		System.out.println("����C");
	}
}