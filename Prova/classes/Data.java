package Prova.classes;

public class Data{

    private int dia,mes,ano;

public Data(int dia, int mes, int ano){ 
    this.dia = dia;
    this.mes = mes;
    this.ano = ano;
}

public int compara(Data d) {
    
    if(this.dia > d.dia){
        return 1;
    }else if(this.ano < d.dia){
        return -1;

    }if(this.mes > d.mes){ 
        return 1;
    }else if(this.mes < d.mes){ 
      return -1;

    }if(this.ano > d.ano){ 
      return 1; 
    }else if(this.ano < d.ano){ 
      return -1;                    
    }
    return 0;
 }

  public int getDia() {
    return dia;
  }

  public int getMes() {
    return mes;
  }

  public int getAno() {
    return ano;
  }

  @Override
  public String toString() {
    return "Data [ano=" + ano + ", dia=" + dia + ", mes=" + mes + "]";
  }
  
}