public class Jogador{
    public final String name;
    private int votos=0;

    public Jogador(String name) {
        this.name = name;
    }

    public int getVotos(){ return votos; }
    public void incrementaUmVoto(){
        this.votos=getVotos()+1;
    }
}




