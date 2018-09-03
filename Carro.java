public class Carro{
    public float gas;
    public float gasMax = 10;
    public int pass;
    public int passMax = 2;
    public float km;
    
    public boolean embarcar(){
        if(this.pass == passMax){
            return false;
        }else {
            pass+=1;
            return true;    
           } 
    }
    public boolean desembarcar(){
        if(this.pass == 0){
            return false;
        }else{
            pass-=1;
            return true;
            }
    }
    public void abastecer(float qtd){
        this.gas += qtd;
        if(this.gas > gasMax){
            this.gas = gasMax;
        }      

    }
    public boolean andar(float qtd){
        if(pass == 0 || qtd/gasMax>gas){
            return false;
        }else{
            this.gas -= qtd/gasMax;
            this.km += qtd;
            return true;
        }
   }
   public String Show(){
        return("pass:" +pass+ ", gasolina:" +gas+ ", Km:" +km);
   }
} 
   
    
