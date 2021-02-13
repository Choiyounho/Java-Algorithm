//package swallow.chapter4;
//
//import com.sun.jmx.remote.internal.ArrayQueue;
//
//public class QueueTest {
//
//    public static void main(String[] args) {
//
//        ArrayQueue<Integer> arrayQueue = new ArrayQueue<>(6);
//
//        arrayQueue.add(0);
//        arrayQueue.add(1);
//        arrayQueue.add(2);
//        arrayQueue.add(3);
//        arrayQueue.add(4);
//        arrayQueue.add(5);
//
//        System.out.println(arrayQueue); // 큐 출력
//        System.out.println(arrayQueue.get(3)); // 큐에 해당 객체가 있는 지 확인
//        arrayQueue.resize(12); // 큐의 양을 재 조정
//        arrayQueue.remove(0); // 가장 먼저 들어온 자료 제거
//        System.out.println(arrayQueue);
//        System.out.println(arrayQueue.size()); // 할당된 개체 수
//
//    }
//}
