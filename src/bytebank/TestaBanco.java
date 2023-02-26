package bytebank;

public class TestaBanco {
	public static void main(String[] args) {
		Conta conta1 = new Conta(13142, 12121);
		Conta conta2 = new Conta(13142, 12121);
		Conta conta3 = new Conta(13142, 12121);
		Conta conta4 = new Conta(13142, 12121);
		Conta conta5 = new Conta(13142, 12121);
		
		System.out.println(Conta.getTotal());
	}
}
