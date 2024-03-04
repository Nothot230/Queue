import java.util.LinkedList;
import java.util.Queue;

public class QeueTest {
    public static void main(String[] args){
        ///สร้างและกำหนดชนิดที่ใส่
        // ใส่แบบ String
        Queue<String> queue = new LinkedList<>();
        // ใส่แบบ Integer
        Queue<Integer> queue1 = new LinkedList<>();
 
        // คำสั่ง add คือการใส่ค่าต่อคิวเรียงตามลำดับ
        queue.add("Kirby");
        queue.add("Chocobo");
        queue.add("Versace");
 
        // แสดงค่าที่อยู่ในคิวทั้งหมด
        System.out.println("Queue: " + queue);
 
        // เอาค่าที่อยู่ข้างหน้าสุดออกและเก็บไว้ที่ Front
        String front = queue.remove();
        System.out.println("Removed element: " + front);
 
        // แสดงคิวหลังจากนำ 1 ตัว ออก
        System.out.println("Queue after removal: " + queue);
        
        // ใส่ "date" ต่อคิว
        queue.add("Batman");
 
        // คำสั่ง peek คือเรียกดูค่าที่อยู่หน้าสุด
        String peeked = queue.peek();
        System.out.println("Peeked element: " + peeked);
 
        System.out.println("Queue after peek: " + queue);

        System.out.println("///////////////////////////////////////////////////");

        queue1.add(1);
        queue1.add(2);
        queue1.add(3);

        System.out.println("Queue1: " + queue1);

        int front1 = queue1.remove();
        System.out.println("Removed element: " + front1);

        System.out.println("Queue after removal: " + queue1);

        queue1.add(4);
 
        int peeked1 = queue1.peek();
        System.out.println("Peeked element: " + peeked1);
 
        System.out.println("Queue after peek: " + queue1);
    }
}
