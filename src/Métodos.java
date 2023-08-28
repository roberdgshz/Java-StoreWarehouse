
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Roberto
 */
public class Métodos {
    public static void Binario(int []v, int X, Número p, Boolean b){
        p.n = -1;
        int li = 0;
        int ls = v.length-1;
        int i,vi;
        b.b = false;
        while(li <= ls && p.n == -1){
            i = (li + ls)/ 2;
            vi = v[i];
            if(vi == X){
                p.n = i;
                b.b = true;
            }else if(v[i] < X){
                li = i + 1;
            }else{
                ls = i - 1;
            }
        }
    }
    
    public static void quicksort(DefaultTableModel tabla, int a, int b, boolean ascendente)
    {
        if (a < b)
        {
            int p = partition(tabla, a, b, ascendente);
            quicksort(tabla, a, p - 1, ascendente);
            quicksort(tabla, p + 1, b, ascendente);
        }
    }

    public static int partition(DefaultTableModel tabla, int a, int b, boolean ascendente)
    {
        int p = (int) tabla.getValueAt(b, 0);
        int i = a;

        for (int j = a; j <= b; j++)
        {
            if (ascendente)
            {
                if ((int) tabla.getValueAt(j, 0) < p)
                {
                    swap(tabla, i, j);
                    i++;
                }
            }
            else
            {
                if ((int) tabla.getValueAt(j, 0) > p)
                {
                    swap(tabla, i, j);
                    i++;
                }
            }
        }
        
        

        swap(tabla, i, b);
        return i;
    }
    
    public static void swap(DefaultTableModel tabla, int a, int b)
    {
        for(int j = 0; j < tabla.getColumnCount(); j++)
        {
            Object oa = tabla.getValueAt(a, j);
            Object ob = tabla.getValueAt(b, j);
            tabla.setValueAt(oa, b, j);
            tabla.setValueAt(ob, a, j);
        }
    }
    
}
