import java.util.*;
import java.io.*;
import javax.swing.*;


public class MIpkMahasiswa
{

    public static void main (String [] args)
    {


 double rata;
        String namaS = JOptionPane.showInputDialog(" NAMA ANDA :  " );
        String jmhsS = JOptionPane.showInputDialog(" Jumlah Mahasiswa :   ");
        double jmhs = Integer.parseInt(jmhsS);
                int[] nilai = new int[100]; 
  Scanner input = new Scanner(System.in);
   int sum = 0;
  for (int i=1; i<= jmhs ;i++ ) 
  {
   try{
 jmhsS = JOptionPane.showInputDialog("Nilai IP Mahasiswa"+i+": ");
 nilai[i]=Integer.parseInt(jmhsS);
 if ( nilai[i] <= 4)
                {
                  sum += nilai[i];                      
                }
          
            else 
                {
				String msg ="IP tidak sesuai ";
                    JOptionPane.showMessageDialog(null, msg);
                    
            }
     
	} catch (Exception e){
    e.printStackTrace();
    break;
   }
  }
  
String grade;
  rata = sum/jmhs; 
  int jmls = (int)(jmhs);
    int i ;
  if ( rata>=2.75)
  {
   grade = "lulus";
  
  }
  else
  { grade = "tidak lulus";}

    

       
    JOptionPane.showMessageDialog (null, " Nama Anda  :   " +namaS+" \nJumlah Mahasiswa  :   "
                                  +jmls+" \n Nilai Rata-Rata IP Mahasiswa : "+rata+"  \n Jumlah keseluruhan IP Mahasiswa :   "
                                   +sum +"\n"+grade);





        
    }


        
}

