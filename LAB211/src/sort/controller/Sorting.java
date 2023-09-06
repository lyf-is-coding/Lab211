/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sort.controller;

import sort.common.Algorithm;
import sort.common.Library;
import sort.model.Span;
import sort.view.Menu;

/**
 *
 * @author coi12
 */
public class Sorting extends Menu
{

    protected int[] array;
    protected int arraySize;

    public Sorting(String title, String[] options, Span span)
    {
        super(title, options);
        arraySize = span.getSize();
        array = span.getArray();
    }

    @Override
    protected void execute(int n)
    {
        switch (n)
        {
            case 1:
                bubbleSort();
                break;
            case 2:
                quickSort();
                break;
            case 3:
                System.out.println("pai pai");
        }
    }

    private void bubbleSort()
    {
        System.out.println("Unsorted array: ");
        Library.display(array);
        
        System.out.println("Sorted array by Bubble Sort: ");
        Algorithm.bubbleSort(array);
        Library.display(array);
    }

    private void quickSort()
    {
        System.out.println("Unsorted array: ");
        Library.display(array);
        
        System.out.println("Sorted array by Quick Sort: ");
        Algorithm.quickSort(array, 0, arraySize - 1);
        Library.display(array);
    }
}
