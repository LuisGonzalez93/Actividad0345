
/**
 * Write a description of class TrainStation here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TrainStation
{
  private TicketMaquina maquina1;
    private TicketMaquina maquina2;
    private int totalDinero;

    public TrainStation()
    {
        maquina1 = new TicketMaquina(300);
        maquina2 = new TicketMaquina(200);
        totalDinero = 0;
  }
  
  public void printTotalDinero()
    {
        totalDinero = maquina1.getTotal();
        totalDinero = totalDinero + maquina2.getTotal();
    System.out.println(totalDinero);
	}
public void ventaBillete()
{
    maquina1.introducirDinero(300);
    maquina1.imprimirTicket();
    maquina2.introducirDinero(200);
    maquina2.imprimirTicket();

}
}