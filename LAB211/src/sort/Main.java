/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sort;

import sort.common.Library;
import sort.controller.Sorting;
import sort.model.Span;

/**
 *
 * @author coi12
 */
public class Main
{

    public static void main(String[] args)
    {
        String title = "Sorting Application";
        String[] options =
        {
            "Bubble Sort", "Quick Sort", "Exit"
        };
        
        int arraySize = Library.getInt("Enter size of array (1->100)", 1, 100);
        int[] array = Library.createRandomNumbersArray(arraySize);
        System.out.println("Created array with " + arraySize + " elements:");
        Library.display(array);
        
        Span span = new Span(array, arraySize);
        
        Sorting sorting = new Sorting(title, options, span);
        sorting.run();
    }
}
