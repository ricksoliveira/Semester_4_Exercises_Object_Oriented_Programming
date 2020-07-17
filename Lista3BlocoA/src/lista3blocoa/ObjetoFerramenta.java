package lista3blocoa;

public class ObjetoFerramenta implements Ferramentas {

    @Override
    public Animal[] filtraEspecie(Animal[] completo, String especieFiltrar){
        
        int quant = 0;
        
        for(int i=0; i<5; i++){
            if(completo[i].getNomeEspecie().equals(especieFiltrar)){
                quant++;
            }
        }
        
        Animal temp[] = new Bixinho[quant];
        int j=0;
        for(int i=0; i<5; i++){
            if(completo[i].getNomeEspecie().equals(especieFiltrar)){
                temp[j] = completo[i];
                j++;
            }
        }
        
        System.out.println("Especies filtradas");
        for (int i=0; i<quant; i++){
            System.out.println(temp[i].getNomeAnimal());
        }
        
        return temp;
    }

    @Override
    public String[] classificaEspecies(Animal[] completo){
        
        int quant = 1;
        String temp[] = new String[5];
        temp[0] = completo[0].getNomeEspecie();
        
        for(int i=1; i<5; i++){
            for(int j=0; j<5; j++){
                
                if(completo[i].getNomeEspecie().equals(temp[j])){
                    break;
                }
                else if(temp[j] == null){
                    temp[j] = completo[i].getNomeEspecie();
                    quant++;
                    break;
                }
                
            }
        }
        System.out.println("Especies classificadas:");
        for(int i=0; i<quant; i++){
            System.out.println(temp[i]);
        }
        
        return temp;
    }
    
    
    
}
