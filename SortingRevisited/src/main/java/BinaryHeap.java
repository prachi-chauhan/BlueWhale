/**
 * Binary heap implementation of Priority Queue
 *
 * @author prachichauhan
 */
public class BinaryHeap {
    /**
     * @param type String parameter for the choice of heap
     */
    private final int maxsize;
    private static final int FRONT=1;
    private int size;
    private int[] Heap;
    
    public BinaryHeap(String type, int maxsize) {
        this.maxsize = maxsize;
        this.size = 0;
        Heap = new int[maxsize + 1];
        Heap[0] = Integer.MIN_VALUE;
        if (type == "1") {
            minHeap();
        } else {
            maxHeap();
        }
    }
    
    /**
     * return Parent of the node at position pos
     *
     * @param pos
     * @return
     */
    private int minHeapParent(int pos) {
        return pos / 2;
    }
    
    /**
     * return RightChild of the node at position pos
     *
     * @param pos
     * @return
     */
    private int minHeapRightChild(int pos) {
        return (2 * pos) + 1;
    }
    
    /**
     * return left child of the node at position pos
     *
     * @param pos
     * @return
     */
    private int minHeapLeftChild(int pos) {
        return 2 * pos;
    }
    
    /**
     * return true if node is a leaf node
     * since it is a complete binary tree, leaf exist between size/2 and size
     */
    private boolean isleaf(int pos) {
        if (pos >= (size / 2) && pos <= size) {
            return true;
        }
        return false;
    }
    
    private void swap(int fpos, int spos) {
        int temp = Heap[fpos];
        Heap[fpos] = Heap[spos];
        Heap[spos] = temp;
    }
    
    //heapify
    private void minHeapify(int pos) {
//    if the node is a non Heap node and greater than any of it's children
//        then swap the parent with the lower value child
        if (!isleaf(pos)) {
            if (Heap[pos] > Heap[minHeapRightChild(pos)] ||
                        Heap[pos] > Heap[minHeapLeftChild(pos)]) {
                
                if (Heap[minHeapRightChild(pos)] > Heap[minHeapLeftChild(pos)]) {
//                    swap with left child and heapify the left child
                    swap(pos, minHeapLeftChild(pos));
                    minHeapify(minHeapLeftChild(pos));
                } else {
                    swap(pos, minHeapRightChild(pos));
                    minHeapify(minHeapRightChild(pos));
                }
            }
        }
    }
    
    /**
     * inserting into a min Heap
     * @param element
     */
    public void insert(int element){
        if (this.size > this.maxsize)
            return;
        Heap[++size] = element;
        int current = size;
        while (Heap[current] < Heap[minHeapParent(current)]) {
            swap(current, minHeapParent(current));
            current = minHeapParent(current);
        }
    }
    
    public int remove(){
        int popped= Heap[FRONT];
        Heap[FRONT]=Heap[size--];
        minHeapify(FRONT);
        return popped;
    }
    
    // Function to print the contents of the heap
    public void print()
    {
        for (int i = 1; i <= size / 2; i++) {
            System.out.print(" PARENT : " + Heap[i]
                                     + " LEFT CHILD : " + Heap[2 * i]
                                     + " RIGHT CHILD :" + Heap[2 * i + 1]);
            System.out.println();
        }
    }
    
    /**
     * build min heap using min heapify
     */
    public void minHeap() {
        for (int pos = (size) / 2; pos >= 1; pos--)
            minHeapify(pos);
    }
    
    private void maxHeap() {
    }
    
    
}
