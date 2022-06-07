package day09_8_25_马士兵.马士兵.算法.排序算法;

public class QuickSort_SortTest {
        public static void main(String[] args) {
            testQuickSort();
        }

        private static void testQuickSort() {
            int[] array = {47, 29, 71, 99, 78, 19, 24, 48};
            QuickSort quickSort = new QuickSort(array);
            quickSort.sort();
            quickSort.print();
        }
    }
