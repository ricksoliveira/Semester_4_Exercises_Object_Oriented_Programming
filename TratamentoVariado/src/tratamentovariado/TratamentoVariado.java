package tratamentovariado;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TratamentoVariado {

    public static void main(String[] args) {
        
        Divisoria div = new Divisoria();
        Menu menu = new Menu();
        Scanner leitor = new Scanner(System.in);
        int opcaomenu = 0;
        
        do{
            try{
                div.barrasDuplas();
                System.out.println("\tEscolha a opção desejada");
                div.barrasDuplas();

                menu.mostrarMenu();
                div.barrasSimples();
                System.out.print(" - ");
                opcaomenu = leitor.nextInt();

                div.cls();

                switch(opcaomenu){
                    
                    case 1:
                        String operator;
                        Calculadora calc = new Calculadora();
                        
                        div.barrasDuplas();
                        System.out.println("\tCALCULADORA.");
                        div.barrasDuplas();
                        
                        calc.mostrarMenu();
                        div.barrasSimples();
                        
                        System.out.print(" - Digite o primeiro número: ");
                        calc.setNum1(leitor.nextInt());
                        
                        System.out.print(" - Escolha a operação: ");
                        operator = leitor.next();
                        
                        System.out.print(" - Digite o segundo número: ");
                        calc.setNum2(leitor.nextInt());
                        
                        switch(operator){
                            
                            case "+":
                                System.out.println("\n");
                                
                                div.barrasSimples();
                                System.out.println("\tRESULTADO");
                                div.barrasSimples();

                                System.out.print("  " + calc.getNum1());
                                System.out.print("  " + operator);
                                System.out.print("  " + calc.getNum2());
                                System.out.println("  =  " + calc.somar());
                                div.barrasSimples();
                                System.out.println("\n\n");
                                break;
                                
                            case "-":
                                System.out.println("\n");
                                
                                div.barrasSimples();
                                System.out.println("\tRESULTADO");
                                div.barrasSimples();

                                System.out.print("  " + calc.getNum1());
                                System.out.print("  " + operator);
                                System.out.print("  " + calc.getNum2());
                                System.out.println("  =  " + calc.subtrair());
                                div.barrasSimples();
                                System.out.println("\n\n");
                                break;
                                
                            case "*":
                                System.out.println("\n");
                                
                                div.barrasSimples();
                                System.out.println("\tRESULTADO");
                                div.barrasSimples();

                                System.out.print("  " + calc.getNum1());
                                System.out.print("  " + operator);
                                System.out.print("  " + calc.getNum2());
                                System.out.println("  =  " + calc.multiplicar());
                                div.barrasSimples();
                                System.out.println("\n\n");
                                break;
                                
                            case "/":
                                System.out.println("\n");
                                
                                div.barrasSimples();
                                System.out.println("\tRESULTADO");
                                div.barrasSimples();

                                System.out.print("  " + calc.getNum1());
                                System.out.print("  " + operator);
                                System.out.print("  " + calc.getNum2());
                                System.out.println("  =  " + calc.dividir());
                                div.barrasSimples();
                                System.out.println("\n\n");
                                break;
                                
                            case "0":
                                break;
                                
                            default:
                            
                        }
                        
                        break;
                        
                    case 2:
                        div.barrasSimples();
                        System.out.println("Condições da opção 2.");
                        div.barrasSimples();
                        System.out.println("\n");
                        break;
                        
                    case 3:
                        div.barrasSimples();
                        System.out.println("Condições da opção 3.");
                        div.barrasSimples();
                        System.out.println("\n");
                        break;
                        
                    case 4:
                        div.barrasSimples();
                        System.out.println("Condições da opção 4.");
                        div.barrasSimples();
                        System.out.println("\n");
                        break;
                        
                    case 5:
                        div.barrasSimples();
                        System.out.println("Condições da opção 5.");
                        div.barrasSimples();
                        System.out.println("\n");
                        break;
                        
                    case 6:
                        div.barrasSimples();
                        System.out.println("\tSaindo do programa.");
                        div.barrasSimples();
                        System.out.println("\n");
                        break;
                        
                    default:
                        div.barrasSimples();
                        System.out.println("ERRO! Digite um número de 1 a 6.");
                        div.barrasSimples();
                        System.out.println("\n");
                        break;
                }
            }      
            catch(InputMismatchException e){
                div.cls();
                div.barrasSimples();
                System.out.println("ERRO! Letra digitada. Digite apenas números. ");
                div.barrasSimples();
                System.out.println("\n");
                leitor.next();
            }
            
        }while(opcaomenu != 6);
        
    }
    
}
