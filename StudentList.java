//file name StudentList.java
import java.io;
import java.text.*;
import java.util.*;
public class StudentList{
    public static void main(String[] args){
    //checking arguments
        if(args[0].equals("a")){
        System.outprintln("Loading data ...");
        try{
            BufferedReader string= new BufferedReader(
                new InputStreamReader(
                    new FileInputStream("students.txt");
                   
                )
            )
            String r=string.readLine();
            String i[]=r.split(",");
            for(String j:i){
                System.out.println(j);
                
            }catch (Exception e){
                System.out.println("Data Loaded...");
            }
        }
    }
    //checking arguments
    else if(args[0].equals("r")){
        System.out.println("Loading data...");
        try{
            BufferedReader string= new BufferedReader(
                new InputStreamReader(
                    new FileInputStream("students.txt");
                   
                ))
                String r=string.readLine();
                System.out.println(r);
            String i[]=r.split(",");
            Random var=new Random();
            int y=var.nextInt();
            System.out.println(i[y]);

        }catch(Exception e){
            System.out.println("Data Loaded...");
        }

    }
    else if(args[0].equals("r")){
        System.out.println("Loading data...");
        try{
            BufferedWriter string= new BufferedWriter(
                new FileWriter("students.txt",true);
            )
            String t =args[0].substring(1);
            Date date=new Date();
            String dateformat="dd/mm/yyyy-hh:mm:ss a";
            DateFormat dateFormat=new SimpleDateFormat(dateformat);
            String dateformat = dateFormat.format(date);
            string.write(", "+t+"\n List last updated on "+dateformat);
            string.close();
}catch(Exception e){
    System.out.println("Data Loaded...");
}

}
//checking arguments
else if(args[0].contains("?")){
    System.out.println("Loading data...");
    try{
        BufferedReader string= new BufferedReader(
            new InputStreamReader(
                new FileInputStream("students.txt");
               
            ))
            String r=string.readLine();
            String i[]=r.split(",");
            boolean done=false;
            String t=args[0].substring(1);
            for(int idx=0;idx<i.length && !done;idx++){
                if(i[idx].equals(t)){
                    System.out.println("We found it!");
                    done=true;
                }
            }
    }catch(Exception e){
        System.out.println("Data Loaded...");
    }
}
//checking arguments
else if(args[0].contains("c")){
    System.out.println("Loading data...");
    try{
        BufferedReader string= new BufferedReader(
            new InputStreamReader(
                new FileInputStream("students.txt");
               
            ))
            String D=string.readLine();
            char a[]=D.toCharArray();
            boolean in_word=false;
            int count=0;
            for(char c:a){
                if(c==','){
                    if(!in_word){
                        count++;
                        in_word =true;
                    }else{
                        in_word=false;
                    }
                }
            }
            System.out.println(count+"word(string) found "+ a.length);
        }catch(Exception e){
            System.out.println("Data Loaded...");
        }
    }
}
}