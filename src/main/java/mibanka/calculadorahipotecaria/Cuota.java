package mibanka.calculadorahipotecaria;

public class Cuota {
  //define las constantes meses y porcentaje
  private final static byte MESES_EN_UN_AÑO = 12;
  private final static byte PORCIENTO = 100;

  private int monto;
  private float interesAnual;
  private byte años;
  
  public Cuota(int monto, float interesAnual, byte años) {
    this.monto = monto;
    this.interesAnual = interesAnual;
    this.años = años;
  }
  
  //metodo para calcular el interes mensual en porcentaje
  public float getInteresMensual() {
    return interesAnual / PORCIENTO / MESES_EN_UN_AÑO;
  }
  
  //metodo para calcular el numero de cuotas
  public int getNumeroDeCuotas() {
    return años * MESES_EN_UN_AÑO;
  }
  
  //metodo para calcular una cuota
  public double calcularCuota() {
      float interesMensual = getInteresMensual();
      float numeroDeCuotas = getNumeroDeCuotas();

      double cuota = monto
              * (interesMensual * Math.pow(1 + interesMensual, numeroDeCuotas))
              / (Math.pow(1 + interesMensual, numeroDeCuotas) - 1);

      return cuota;
  }
  
  //metodo para calcular el pago total con intereses
  public double calcularPagoTotal() {
      float numeroDeCuotas = getNumeroDeCuotas();
      double cuota = calcularCuota();

      double pagoTotal = cuota * numeroDeCuotas;

      return pagoTotal;
  }
  
  //metodo para calcular solo la deuda
  public double calcularDeuda(short numeroDeCuotasRealizadas) {
      float interesMensual = getInteresMensual();
      float numeroDeCuotas = getNumeroDeCuotas();

      double deuda = monto
              * (Math.pow(1 + interesMensual, numeroDeCuotas) - Math.pow(1 + interesMensual, numeroDeCuotasRealizadas))
              / (Math.pow(1 + interesMensual, numeroDeCuotas) - 1);

      return deuda;
  }
  
  //metodo para calcular las deudas restantes
  public double[] getDeudaRestante() {
    var balanceDeDeuda = new double[getNumeroDeCuotas()];
    for (short mes = 1; mes <= balanceDeDeuda.length; mes++)
      balanceDeDeuda[mes - 1] = calcularDeuda(mes);

    return balanceDeDeuda;
  }
}
