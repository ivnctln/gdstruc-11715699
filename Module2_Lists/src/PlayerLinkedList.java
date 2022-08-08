import java.util.NoSuchElementException;
import java.util.Objects;

public class PlayerLinkedList {
    private PlayerNode head;
    private PlayerNode last;
    private int size;
    private int index;

    public void addToFront(Player player) {
        PlayerNode playerNode = new PlayerNode(player);
        playerNode.setNextPlayer(head);
        head = playerNode;
        size++;
    }

    public void removeFirst() {
        if (head == null) throw new NoSuchElementException();
        if (head == last) head = last = null;
        else head = head.getNextPlayer();
        size--;
    }

    public void printList() {
        PlayerNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current.getPlayer());
            System.out.print(" -> ");
            current = current.getNextPlayer();
        }
        System.out.println("null");
        System.out.println();
    }

    public void getSize(){
        System.out.println("Elements present in the Linked List: " + size);
        System.out.println();
    }

    public void contains(Player player){
        PlayerNode current = head;
        boolean flag = false;
        while((current != null) && (current.getPlayer() != player)){
            current = current.getNextPlayer();
        }
        if(current != null){
            flag = true;
        }
        System.out.println(flag);
        System.out.println();
    }

    public void indexOf(Player player) {
        PlayerNode current = head;
        index = 0;
        while (player != current.getPlayer()) {
            current = current.getNextPlayer();
            index++;
            if (current == null){
                return;
            }
        }
        System.out.println(index);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlayerLinkedList that = (PlayerLinkedList) o;
        return size == that.size && index == that.index && Objects.equals(head, that.head) && Objects.equals(last, that.last);
    }

    @Override
    public int hashCode() {
        return Objects.hash(head, last, size, index);
    }
}