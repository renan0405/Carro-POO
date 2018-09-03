import java.util.Scanner;
public class Principal{
  public static Scanner in = new Scanner(System.in);
  public static void main(String args[]){
  
  Carro car = new Carro();
  car.gas = 0;
  car.pass = 0;
  car.km= 0;
  
  while(true){
        System.out.print("digite um comando(help para ver os comandos):");
        String comando = in.nextLine();
        String c[] = comando.split(" ");
        boolean res;
        if (c[0].equals("sair")){
            break;
        }else{
            switch(c[0]){
                case"help":
                    System.out.println("\tembarcar\n"+"\tdesembarcar\n"+"\tabastecer x\n"+"\tandar x\n"+"\tshow");
                break;    
                    
                case"embarcar":
                   res = car.embarcar(); 
                   if(res == true){
                       System.out.println("pessoa embarcada com sucesso!");                       
                   }else{  
                       System.out.println("Limite de pessoas atingido!");
                   }
                break;
                
                case"desembarcar":
                    res = car.desembarcar();
                    if(res == true){
                        System.out.println("pessoa desembarcarda com sucesso");
                    }else{
                        System.out.println("nao tem ninguem para desembarcar");
                    }
                break;   
                
                case"abastecer":
                    float qtd = Float.parseFloat(c[1]);
                    car.abastecer(qtd);
                    System.out.println("carro abastecido");
                break;
                    
                case"andar":
                    float qtd1 = Float.parseFloat(c[1]);
                    res = car.andar(qtd1);
                   if(res == true){
                       System.out.println("andou com sucesso!");                       
                   }else if(car.pass==0){  
                       System.out.println("ninguem no carro");
                   }else{
                        System.out.println("gasolina insuficiente");
                   }
                break;
                
                case"show":
                    System.out.println(car.Show());
                    break;                              
            }
        }
        
  
  
    } 
  }
}
 
