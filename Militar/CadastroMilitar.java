import java.util.ArrayList;
import java.util.List;

class CadastroMilitar {
    private List<Militar> militares = new ArrayList<>();
    
    public void adicionarMilitar(Militar militar) {
        militares.add(militar);
    }
    
    public List<Militar> militaresQuePodemProgredir() {
        List<Militar> aptos = new ArrayList<>();
        for (Militar m : militares) {
            if (m.podeProgredir()) {
                aptos.add(m);
            }
        }
        return aptos;
    }
    
    public void promoverMilitares() {
        for (Militar m : militaresQuePodemProgredir()) {
            m.promover();
        }
    }
}
