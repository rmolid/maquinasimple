public class MaquinaExpendedoraSimple {
    
    // El precio del billete
    private int precioBillete;
    // La cantidad de dinero que lleva metida el cliente actual
    private int balanceClienteActual;
    // El total de dinero almacenado en la maquina desde su ultimo vaciado
    private int totalDineroAcumulado;
    // El origen del billete
    private String estacionOrigen;
    // El destino del billete
    private String estacionDestino;

    /**
     * Crea una maquina expendedora de billetes de tren con el 
     * precio del billete es siempre 15 el origen León y el destino Cuenca 
     */
    public MaquinaExpendedoraSimple() {
        precioBillete = 12 ;
        balanceClienteActual = 0;
        totalDineroAcumulado = 0;
        estacionOrigen = "León";
        estacionDestino = "Cuenca";
    }
   
    /**
     * Crea una maquina expendedora de billetes donde el precio se indica
     * por parametro, el origen siempre es Leon y el destino se indica por
     * parametro
     */
    public MaquinaExpendedoraSimple(int newPrecioBillete,String newEstacionDestino2) {
        precioBillete = newPrecioBillete;
        balanceClienteActual = 0;
        totalDineroAcumulado = 0;
        estacionOrigen = "León";
        estacionDestino = newEstacionDestino2;
    }
    
    /**
     * Cambia el precio del billete
     */
    public void setPrecioBillete (int cambioPrecioBillete) {
      precioBillete=cambioPrecioBillete;
    }
    
    /**
     * Cambia el precio del billete
     */
    public void reducePrecioBillete (int reducePrecioBillete) {
      precioBillete=precioBillete - reducePrecioBillete;
    }
    
    /**
     * Cantidad de dinero total acumulada
     */
    public int getCantidadAcumulada() {
      return totalDineroAcumulado;
    }

    /**
     * Devuelve el precio del billete
     */
    public int getPrecioBillete() {
        return precioBillete;
    }
    
    /**
     * Devuelve la cantidad de dinero que el cliente actual lleva introducida
     */
    public int getBalanceClienteActual() {
        return balanceClienteActual;
    }

    /**
     * Simula la introduccion de dinero por parte del cliente actual
     */
    public void introducirDinero(int cantidadIntroducida) {
        balanceClienteActual = balanceClienteActual + cantidadIntroducida;
    }

    /**
     * Imprime un billete para el cliente actual
     */
    public void imprimirBillete() {
        // Simula la impresion de un billete
        System.out.println("##################");
        System.out.println("# Billete de tren:");
        System.out.println("# De " + estacionOrigen + " a " + estacionDestino);
        System.out.println("# " + precioBillete + " euros.");
        System.out.println("##################");
        System.out.println();

        // Actualiza el total de dinero acumulado en la maquina
        totalDineroAcumulado = totalDineroAcumulado + balanceClienteActual;
        // Queda preparada para el proximo cliente
        balanceClienteActual = 0;
    }
}
