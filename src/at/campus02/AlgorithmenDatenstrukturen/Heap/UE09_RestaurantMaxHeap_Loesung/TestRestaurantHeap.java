package at.campus02.AlgorithmenDatenstrukturen.Heap.UE09_RestaurantMaxHeap_Loesung;

import at.campus02.AlgorithmenDatenstrukturen.Heap.UE09_RestaurantMaxHeap.Restaurant;
import at.campus02.AlgorithmenDatenstrukturen.Heap.UE09_RestaurantMaxHeap.RestaurantMaxHeap;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestRestaurantHeap
{
    @Test
    public void testAdd() {
        at.campus02.AlgorithmenDatenstrukturen.Heap.UE09_RestaurantMaxHeap.RestaurantMaxHeap heap = new at.campus02.AlgorithmenDatenstrukturen.Heap.UE09_RestaurantMaxHeap.RestaurantMaxHeap(3);

        assertTrue(heap.insert(new at.campus02.AlgorithmenDatenstrukturen.Heap.UE09_RestaurantMaxHeap.Restaurant(1, "Leonhardstüberl", 7)));
        assertTrue(heap.insert(new at.campus02.AlgorithmenDatenstrukturen.Heap.UE09_RestaurantMaxHeap.Restaurant(2, "McDowells", 21)));
        assertTrue(heap.insert(new at.campus02.AlgorithmenDatenstrukturen.Heap.UE09_RestaurantMaxHeap.Restaurant(3, "Wilding", 14)));
        assertFalse(heap.insert(new at.campus02.AlgorithmenDatenstrukturen.Heap.UE09_RestaurantMaxHeap.Restaurant(4, "Dean & David", 8)));

        heap.printHeap();
    }

    @Test
    public void testRemove()
    {
        at.campus02.AlgorithmenDatenstrukturen.Heap.UE09_RestaurantMaxHeap.RestaurantMaxHeap heap = new RestaurantMaxHeap(10);

        assertTrue(heap.insert(new at.campus02.AlgorithmenDatenstrukturen.Heap.UE09_RestaurantMaxHeap.Restaurant(1, "Wilding", 34)));
        assertTrue(heap.insert(new at.campus02.AlgorithmenDatenstrukturen.Heap.UE09_RestaurantMaxHeap.Restaurant(2, "Don Camillo", 13)));
        assertTrue(heap.insert(new at.campus02.AlgorithmenDatenstrukturen.Heap.UE09_RestaurantMaxHeap.Restaurant(3, "Kirbys", 4)));
        assertTrue(heap.insert(new at.campus02.AlgorithmenDatenstrukturen.Heap.UE09_RestaurantMaxHeap.Restaurant(4, "Freigeist", 23)));
        assertTrue(heap.insert(new at.campus02.AlgorithmenDatenstrukturen.Heap.UE09_RestaurantMaxHeap.Restaurant(5, "Ankara Grillhaus", 4)));
        assertTrue(heap.insert(new at.campus02.AlgorithmenDatenstrukturen.Heap.UE09_RestaurantMaxHeap.Restaurant(6, "Resis Stüberl", 21)));
        assertTrue(heap.insert(new at.campus02.AlgorithmenDatenstrukturen.Heap.UE09_RestaurantMaxHeap.Restaurant(7, "Hendlstation", 43)));
        assertTrue(heap.insert(new at.campus02.AlgorithmenDatenstrukturen.Heap.UE09_RestaurantMaxHeap.Restaurant(8, "Fontana di trevi", 15)));
        assertTrue(heap.insert(new Restaurant(9, "Grüne Erde", 5)));

        assertEquals("Hendlstation", heap.remove().getRestaurantName());
        assertEquals("Wilding", heap.remove().getRestaurantName());

        heap.printHeap();
    }
}
