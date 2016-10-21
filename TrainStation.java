
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
    private int totalMoney;

    public TrainStation()
    {
        maquina1 = new TicketMaquina(300);
        maquina2 = new TicketMaquina(200);
        totalMoney = 0;
  }
  
  public void printTotalDinero()
    {
        totalMoney = maquina1.getTotal();
        totalMoney = totalMoney + maquina2.getTotal();
    System.out.println(totalMoney);
	}
public void ventaBillete()
{
    maquina1.introducirDinero(300);
    maquina1.imprimirTicket();
    maquina2.introducirDinero(200);
    maquina2.imprimirTicket();

}
}