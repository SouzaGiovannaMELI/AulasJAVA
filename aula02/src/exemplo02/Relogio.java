package exemplo02;

public class Relogio {
    // atributos
    private int hora, minuto, segundo;
    private static String marca;
    private final int HORA_PADRAO = 12;

    public Relogio(int hora, int minuto, int segundo) {
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }

    public void setHora(int novaHora){
        if(novaHora >= 0 && novaHora < 24 ){
            hora = novaHora;
        } else {
            hora = HORA_PADRAO;
        }
    }

    public int getHora() {
        return hora;
    }

    public void setMinuto(int novoMinuto){
        if(novoMinuto >= 0 && novoMinuto < 60){
            minuto = novoMinuto;
        }
    }

    public int getMinuto() {
        return minuto;
    }

    public void setSegundo(int novoSegundo) {
        if(novoSegundo >= 0 && novoSegundo < 60){
            segundo = novoSegundo;
        }
    }

    public int getSegundo() {
        return segundo;
    }

    public static String getMarca() {
        return marca;
    }

    public static void setMarca(String marca) {
        Relogio.marca = marca;
    }

    // métodos = ações (função)
    // [retorno] nome ([parametros]) { }
    public void exibir(){
        System.out.println(marca+ " - hora atual: " +hora+ ":"
            +minuto+ ":" +segundo);
    }

    public String show(){
        return (Relogio.marca+ " - hora atual: " +hora+ ":"
                +minuto+ ":" +segundo);
    }

    public static String horaAtual(){
        return "00:00:00";
    }
}
