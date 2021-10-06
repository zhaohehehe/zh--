package test.design_pattern.adapter_pattern;

public class WildTurkey implements Turkey {

	@Override
	public void gobble() {
		System.out.println("���ڿ�����");

	}

	@Override
	public void fly() {
		System.out.println("����������");

	}

}
