package atividadeHeran�a01;

public class OqueTodosFazem {

	public static void main(String[] args) {
		
		cachorro dog = new cachorro();
		pregui�a preg = new pregui�a();
		cavalo cal = new cavalo();
		
		dog.setNome("rauf ");
		dog.setIdade(4);
		dog.setSom("late");		
		dog.setA��o("corre ");
		
		preg.setNome("ted");
		preg.setIdade(30);
		preg.setSom("gritar");
		preg.setA��o("escalar");
		
		cal.setNome("tio pan");
		cal.setIdade(20);
		cal.setSom("relinchar");
		cal.setA��o("cavalgar");
		
		System.out.println("nome do animal : " + dog.getNome());
		System.out.println("idade do animal : " + dog.getIdade());
		System.out.println("som que o animal faz : " + dog.getSom());
		System.out.println("o que ele faz " + dog.getA��o());
		System.out.println();
		
		System.out.println("nome do animal : " + preg.getNome());
		System.out.println("idade do animal : " + preg.getIdade());
		System.out.println("som que o animal faz : " + preg.getSom());
		System.out.println("o que ele faz " + preg.getA��o());
		System.out.println();
		
		System.out.println("nome do animal : " + cal.getNome());
		System.out.println("idade do animal : " + cal.getIdade());
		System.out.println("som que o animal faz : " + cal.getSom());
		System.out.println("o que ele faz " + cal.getA��o());
		System.out.println();
		
		
	}

}
