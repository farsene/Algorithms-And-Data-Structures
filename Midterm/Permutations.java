import java.util.*;

class Solution {

  /**
   * Takes an ArrayList of integers and adds all possible permutations to a Set that will be returned.
   *
   * @param list
   *     - the original ArrayList that has to be permuted.
   * @return a Set with all possible permutations of the original ArrayList.
   */
  public static Set<PermList<Integer>> permute(PermList<Integer> list) {
    Set<PermList<Integer>> set = new HashSet<PermList<Integer>>();
    if(list.size() == 0){
      return set;
    }
    permute(set, list, 0);
    return set;
  }

  public static void permute(Set<PermList<Integer>> set,PermList<Integer> list, int index) {
    if(index >= list.size()-1){

            PermList<Integer> l = new PermList<Integer>();

            for(int s = 0 ; s < list.size() ; s++){
               l.add(list.get(s));
            }

            set.add(l);

        }
        else{
            for(int i = index ; i < list.size() ; i++){

                int temp = list.get(index);
                list.set(index, list.get(i));
                list.set(i,temp);

                permute(set, list, index+1);

                int temp2 = list.get(index);
                list.set(index, list.get(i));
                list.set(i,temp2);

            }
        }
  }
}
