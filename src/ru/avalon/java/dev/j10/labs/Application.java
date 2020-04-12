package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.initialization.FibonacciInitializer;
import ru.avalon.java.dev.j10.labs.initialization.RandomInitializer;
import ru.avalon.java.dev.j10.labs.sort.BubbleSort;
import ru.avalon.java.dev.j10.labs.sort.SelectionSort;
import ru.avalon.java.dev.j10.labs.sort.ShellSort;

public class Application {

    public static void main(String[] args) {
        int[] array = new int[20];
        FibonacciInitializer fibonacciInitializer = new FibonacciInitializer();
		fibonacciInitializer.initialize(array);
		int sum = 0;
		for (int text : array) {
			System.out.print(text + " ");
			sum = sum + text;
		}
		System.out.println("\nСумма элементов массива: " + sum);

		RandomInitializer randomInitializer = new RandomInitializer(-50, +50);
		randomInitializer.initialize(array);

		BubbleSort bubbleSort = new BubbleSort();
		bubbleSort.sort(array);

		System.out.println("\nСортировка пузырьком: ");
		for (int text : array) {
			System.out.print(text + " ");
		}
		System.out.println("\n Инициализация: ");
		randomInitializer.initialize(array);

		SelectionSort selectionSort = new SelectionSort();
		selectionSort.sort(array);
		System.out.println("\nСортировка выбором: ");
		for (int text : array) {
			System.out.print(text + " ");
		}

		System.out.println("\n Инициализация: ");
		randomInitializer.initialize(array);

		ShellSort shellSort= new ShellSort();
		selectionSort.sort(array);
		System.out.println("\nСортировка по Шеллу: ");
		for (int text : array) {
			System.out.print(text + " ");
		}

	    /*
	     * TODO(Студент): Выполнить действия над массивом чисел
	     *
	     * 0. Инициализировать переменную array массивом из 20 целых чисел.
	     *
	     * 1. Проинициализировать массив значениями
	     *    последовательности чисел Фибоначчи.
	     *
	     * 2. Найти сумму элементов массива.
	     *
	     * 3. Проинициализировать массив последовательностью
	     *    случайных чисел в диапазоне от -50 до 50.
	     *
	     * 4. Отсортировать массив с использованием
	     *    пузырьковой сортировки.
	     *
         * 5. Проинициализировать массив последовательностью
         *    случайных чисел в диапазоне от -50 до 50.
         *
         * 6. Отсортировать массив с использованием
         *    сортировки выбором.
         *
         * 7. Проинициализировать массив последовательностью
         *    случайных чисел в диапазоне от -50 до 50.
         *
         * 8. Отсортировать массив с использованием
         *    сортировки Шелла.
	     */
    }
}
