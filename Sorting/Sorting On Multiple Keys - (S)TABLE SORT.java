class Solution {
  public static void stableSort(String[][] table, int column) {
    // TODO
  }
}
//class Solution {
//  public static void stableSort(String[][] table, int column) {
//
//    if(column >= 0 && column < table.length){
//
//      for(int i = 1 ; i < table.length ; i ++){
//        int j = i;
//        String[] temp = table[i];
//
//        int c = table[i][column].compareTo(table[j-1][column]);
//                   //System.out.println("j " + table[j][column] + " j-1 " + table[j-1][column] + " c " + c);
//
//        while(j > 0 && c < 0){
//           table[j] = table[j-1];
//           j--;
//           if(j > 0) {
//           c = temp[column].compareTo(table[j-1][column]);
//           }
//        }
//
//        table[j] = temp;
//
//      }
//    }
//  }
//}
////
