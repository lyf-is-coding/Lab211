/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sort.model;

/**
 *
 * @author coi12
 */
public class Span
{

    public int size;
    public int[] array;

    public int getSize()
    {
        return size;
    }

    public Span(int[] array, int size)
    {
        this.size = size;
        this.array = array;
    }

    public void setSize(int size)
    {
        this.size = size;
    }

    public int[] getArray()
    {
        return array;
    }

    public void setArray(int[] array)
    {
        this.array = array;
    }


}
