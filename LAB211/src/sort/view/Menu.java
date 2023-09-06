/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sort.view;

import java.util.ArrayList;
import java.util.List;
import sort.common.Library;

/**
 *
 * @author coi12
 */
public abstract class Menu
{

    protected String title;
    protected List<String> options;

    public Menu()
    {
        options = new ArrayList<>();
    }

    public Menu(String title, String[] options)
    {
        this.title = title;
        this.options = new ArrayList<>();
        for (String s : options)
        {
            this.options.add(s);
        }
    }

    private void display()
    {
        System.out.println(title);
        System.out.println("--------------------------------");
        int index = 0;
        for (String s : options)
        {
            System.out.println(++index + ". " + s);
        }
        System.out.println("--------------------------------");
    }

    private int getChoice()
    {
        return Library.getInt("Enter your choice", 1, options.size() + 1);
    }

    protected abstract void execute(int n);

    public void run()
    {
        int n;
        do
        {
            display();
            n = getChoice();
            execute(n);
        }
        while (n < options.size());
    }

}
