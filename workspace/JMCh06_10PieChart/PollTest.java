/**
 * This class tests the PollDisplayPanel class
 *
 * @author Alex Xu
 * @version Sept 4, 2015
 * @author Period: 4
 * @author Assignment: JMCh06_10PieChartSoln
 *
 * @author Sources: Alex Xu
 */
public class PollTest
{
    /**
     * test for poll
     * 
     * @param args
     *            command line argument
     */
    public static void main( String[] args )
    {
        PollDisplayPanel votingMachine = new PollDisplayPanel( "Tami",
            "Brian",
            "Liz" );
        votingMachine.vote1();
        votingMachine.vote2();
        votingMachine.vote2();
        System.out.println( votingMachine.toString() );
    }
}
