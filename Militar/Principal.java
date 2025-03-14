public class Principal {
    public static void main(String[] args) {
        CadastroMilitar cadastro = new CadastroMilitar();
        
        MilitarAeronautica ma = new MilitarAeronautica(101, "Soldado", 3, 120);
        MilitarExercito me = new MilitarExercito(102, "Cabo", true, true);
        MilitarMarinha mm = new MilitarMarinha(103, "Tenente", true);
        
        cadastro.adicionarMilitar(ma);
        cadastro.adicionarMilitar(me);
        cadastro.adicionarMilitar(mm);
        
        System.out.println("Militares que podem progredir:");
        for (Militar m : cadastro.militaresQuePodemProgredir()) {
            System.out.println("Matrícula: " + m.getMatricula());
        }
        
        System.out.println("Promovendo militares...");
        cadastro.promoverMilitares();
    }
}
