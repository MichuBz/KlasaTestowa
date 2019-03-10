import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeapTest {

    @Test
    public void shoildReturnProperValueForParent(){

        Heap heap = new Heap();
                assertEquals(0 , heap.showParents(1));
                assertEquals(0 , heap.showParents(2));
                assertEquals(1 , heap.showParents(3));
                assertEquals(1 , heap.showParents(4));
                assertEquals(2 , heap.showParents(5));
                assertEquals(2 , heap.showParents(6));


    }

}