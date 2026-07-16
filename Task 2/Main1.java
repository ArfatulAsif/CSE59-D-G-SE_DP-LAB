class contestStats{
    int[] scores = {85, 90, 95};

    public void printFirstScore() {
        System.out.println("the first score is: " + scores[0]);
    }
}

public class main1 {
    public static void main(String[] args) {
        contestStats stats = new contestStats();
        stats.printFirstScore();
        
    }

    
}
