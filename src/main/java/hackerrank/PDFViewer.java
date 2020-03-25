package hackerrank;

/*
https://www.hackerrank.com/challenges/designer-pdf-viewer/problem
 */
public class PDFViewer {
    static int designerPdfViewer(int[] height, String word) {
      int maxHeight = 0 ;
      for(char s : word.toCharArray()) {
          int ht = height[(s - 97) % 26];
          if(maxHeight < ht) {
              maxHeight = ht;
          }
      }

     return maxHeight * word.length();
    }

    public static void main(String[] args) {
       int []height = {1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 7};
       System.out.println(designerPdfViewer(height, "zaba"));
    }
}
