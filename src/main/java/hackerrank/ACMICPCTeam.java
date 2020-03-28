package hackerrank;

public class ACMICPCTeam {

    static int topicsCovered(String topic1, String topic2){
            int max = 0;
            for(int i = 0 ; i< topic1.length(); i++) {
                if(topic1.charAt(i) == '1' || topic2.charAt(i) == '1') {
                    max += 1;
                }
            }
            return max;
    }

    static int[] acmTeam(String[] topic) {
     int maxTopicsCount = 0, maxCovered = 0;
     for(int i = 0 ; i < topic.length; i++) {
       for(int j = i + 1; j < topic.length; j++) {
           int topicsCovered = topicsCovered(topic[i], topic[j]);
           if(maxCovered < topicsCovered) {
              maxCovered = topicsCovered;
              maxTopicsCount = 1;
          } else if(topicsCovered >= maxCovered) {
               maxTopicsCount++;
           }
       }
     }

        return new int[]{maxCovered, maxTopicsCount };
    }

    public static void main(String[] args) {
        String []str = {"10101", "11100", "11010", "00101"};
      //  System.out.println(topicsCovered("10101", "11100"));
       for(int a: acmTeam(str)) {
           System.out.println(a);
       }
    }
}
