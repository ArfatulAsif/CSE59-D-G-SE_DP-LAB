class ContestStates{
    int[] scores={85,90,95};
    void printFirstScore(){
        System.out.println(scores[0]);
    }
}

public class main1{
    public static void main(String[] args){
        ContestStates cs = new ContestStates();
        cs.printFirstScore();
    }
}
