public class BarGraph 
{
    public static void main(String[] args) 
    {
        int[] scores = {1,7,9,4,3};
        BarGraph barGraph = new BarGraph();
        barGraph.generateBarGraph(scores);
    }
    
    public void generateBarGraph(int scores[])
    {
        // Fix the logical errors in the for loops
        for(int i = 0; i < scores.length; i++)
        {
            System.out.print(scores[i] + " ");
            for(int j = 0; j < scores[i]; j++)
            {
                System.out.print("*");
            }

            System.out.println("");
        }
    }

}
