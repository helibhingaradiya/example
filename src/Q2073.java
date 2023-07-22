public class Q2073 {
    public static void main(String[] args) {
        int[] tickets = {2,3,2};
        int k = 2;
        System.out.println(timeRequiredToBuy(tickets, k));
    }

    public static int timeRequiredToBuy(int[] tickets, int k) {
        int time = 0;

        while (tickets[k] != 0) {
            for (int i = 0; i < tickets.length; i++) {
                if (tickets[k] == 0) {
                    continue;
                }else if(tickets[i]==0){
                    continue;
                }
                int minus = tickets[i] - 1;
                tickets[i] = minus;
                time++;

            }
//            time++;
        }


        return time;
    }
}
