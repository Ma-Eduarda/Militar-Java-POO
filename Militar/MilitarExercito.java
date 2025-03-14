class MilitarExercito extends Militar implements Carreira {
    private boolean participouGuerra;
    private boolean paisGanhouGuerra;
    
    public MilitarExercito(int matricula, String patente, boolean participouGuerra, boolean paisGanhouGuerra) {
        super(matricula, patente);
        this.participouGuerra = participouGuerra;
        this.paisGanhouGuerra = paisGanhouGuerra;
    }
    
    public boolean isParticipouGuerra() {
        return participouGuerra;
    }
    
    public void setParticipouGuerra(boolean participouGuerra) {
        this.participouGuerra = participouGuerra;
    }
    
    public boolean isPaisGanhouGuerra() {
        return paisGanhouGuerra;
    }
    
    public void setPaisGanhouGuerra(boolean paisGanhouGuerra) {
        this.paisGanhouGuerra = paisGanhouGuerra;
    }
    
    @Override
    public boolean podeProgredir() {
        return participouGuerra && paisGanhouGuerra;
    }
}