// src/main/java/edu/kis/vh/nursery/DefaultCountingOutRhymer.java
package edu.kis.vh.nursery;

/**
 * Implementacja stosu liczb całkowitych używana jako podstawowy rymarz odliczający.
 * Klasa realizuje strukturę danych LIFO (Last In, First Out) o stałej pojemności.
 * Służy jako klasa bazowa dla bardziej wyspecjalizowanych rymarzy ({@link FIFORhymer},
 * {@link HanoiRhymer}).
 *
 * <p>Pojemność stosu wynosi {@value #CAPACITY} elementów.</p>
 *
 * @author edu.kis.vh.nursery
 * @version 1.0
 */
public class DefaultCountingOutRhymer {

    /** Wartość wskaźnika oznaczająca pusty stos. */
    private static final int EMPTY_RHYMER_INDICATOR = -1;

    /** Domyślna wartość zwracana gdy stos jest pusty. */
    private static final int DEFAULT_VALUE = -1;

    /** Maksymalna liczba elementów przechowywanych przez rymarz. */
    private static final int CAPACITY = 12;

    /** Wewnętrzna tablica przechowująca elementy stosu. */
    private final int[] numbers = new int[CAPACITY];

    /**
     * Wskaźnik wierzchołka stosu. Wartość {@code -1} oznacza pusty stos.
     */
    public int total = EMPTY_RHYMER_INDICATOR;

    /**
     * Zwraca aktualny wskaźnik wierzchołka stosu.
     *
     * @return indeks wierzchołka stosu; {@code -1} jeśli stos jest pusty
     */
    public int getTotal() {
        return total;
    }

    /**
     * Dodaje wartość na wierzchołek stosu (operacja push).
     * Jeśli stos jest pełny, wartość jest ignorowana.
     *
     * @param in wartość całkowita do dodania
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     * Sprawdza czy stos jest pusty.
     *
     * @return {@code true} jeśli stos nie zawiera żadnych elementów
     */
    public boolean isEmpty() {
        return total == EMPTY_RHYMER_INDICATOR;
    }

    /**
     * Sprawdza czy stos jest pełny.
     *
     * @return {@code true} jeśli liczba elementów osiągnęła pojemność {@value #CAPACITY}
     */
    public boolean isFull() {
        return total == CAPACITY - 1;
    }

    /**
     * Zwraca wartość z wierzchołka stosu bez jej usuwania (operacja peek).
     *
     * @return wartość na wierzchołku stosu, lub {@value #DEFAULT_VALUE} jeśli stos jest pusty
     */
    protected int peek() {
        if (isEmpty())
            return DEFAULT_VALUE;
        return numbers[total];
    }

    /**
     * Usuwa i zwraca wartość z wierzchołka stosu (operacja pop).
     *
     * @return wartość zdjęta ze stosu, lub {@value #DEFAULT_VALUE} jeśli stos jest pusty
     */
    public int countOut() {
        if (isEmpty())
            return DEFAULT_VALUE;
        return numbers[total--];
    }
}