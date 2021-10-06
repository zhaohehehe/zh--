package test.design_pattern.adapter_pattern;

public class RedDuck implements Duck {

	@Override
	public void quack() {
		System.out.println("Ѽ�������ɽ�");
	}

	@Override
	public void fly() {
		System.out.println("Ѽ���ڷ�");

	}

}
