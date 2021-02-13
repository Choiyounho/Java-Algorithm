package swallow.chapter7;
import java.util.ArrayList;
import java.util.List;


public class SetTest {

    public static void main(String[] args) {

        List<Integer> normalList = new ArrayList<>();
        normalList.add(5);
        normalList.add(2);
        normalList.add(4);
        normalList.add(8);
        normalList.add(1);
        normalList.add(7);

        List<Integer> comparison = new ArrayList<>();
        comparison.add(8);
        comparison.add(1);
        comparison.add(11);
        comparison.add(17);
        comparison.add(12);
        comparison.add(18);

        // 같은 요소가 있을 경우 새로운 집합에 추가
        List sameList = sameFactor(normalList, comparison);
        System.out.println(sameList);
    }

    public static List<Integer> sameFactor(List<Integer> normalList, List<Integer> comparison) {
        List<Integer> sameList = new ArrayList<>();
        for (int i = 0; i < normalList.size(); i++) {
            for (int j = 0; j < comparison.size(); j++) {
                if (normalList.get(i) == comparison.get(j)) {
                    sameList.add(normalList.get(i));
                }
            }
        }
        return sameList;
    }

}
