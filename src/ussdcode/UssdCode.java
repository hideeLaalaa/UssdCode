/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ussdcode;

import javax.swing.JOptionPane;
import java.lang.IllegalArgumentException;
import java.util.Random;

/**
 *
 * @author HP
 */
public class UssdCode {

   static ussd code = new ussd();
   static String[] tariff = {"Awoof,Brekete,Yakata,Infinito,Bounce,"
           + "Jolof N50,Jolof N25,Flexi,Formula,Jollific8,BiiGy Packs,Generation G"};
   static String input;
   static String[][] cardNo = {
       {"901101684269042","901101943411714","901101130321267","901101558801720","901101955343382",
            "901101773666710","901101318545562","901101560076411","901101098944037","901101301339536"},//#100
       {"902101354015121","902101094006153","902101371022743","902101212525016","902101214155914","902101034170323"
            ,"902101716593610","902101031127510","902101591551700","902101166068474"},//#200
       {"905101924640781","905101163791344","905101226502256","905101626334164","905101732542700","905101433975771"
            ,"905101421875036","905101832995541","905101349372655","905101162850641"},//#500
       {"909101164745175","909101387281733","909101907702081","909101117777041","909101447741405","909101489537028"
            ,"909101184648607","909101652516954","909101409849276","909101413917721"}//#1000
   };

    /**
     * @param args the command line arguments
     */
   
   public static void generateCard(){
       for(int i = 0;i < 4;i++){
           String x = (i==0?"90110":i==1?"90210":i==2?"90510":"90910");
           for(int j=0;j<10;j++){
               System.out.print(x+(1000000000+new Random().nextInt(999999999))+"\t");
           }
           System.out.println();
       }
   }
   
    public static void main(String[] args) {
        // TODO code applicationc logic here
//        generateCard();
        
        ussd test = new ussd();
        int dataSize[][] = {
            {10},
            {6,2,1,7,2,2,5,2,3,7},
            {7,7,2,0,5,2, //1.1
            2,2,//1.2
            0,//1.3
            0,0,0,2,0,3,0,//1.4
            }, 
            {4,3,3},
            {3,3,3},
            {3,3,3},
            {3,3,3},
            {3,3,3}
        };
//        String x="fjjfjf";
        String data[][] = {
            {"at 0"},
            {"at 11","at 12","at 13"},
            {"at 21","at 22","at 23","at 24","at 25","at 26","at 27","at 28","at 29"},
            {"at 31","at 32","at 33"},
            {"at 41","at 42","at 43"},
            {"at 51","at 52","at 53"},
            {"at 61","at 62","at 63"},
            {"at 71","at 72","at 73"}
        };
        
        input = "x";
        int i = 0;
        int j = 0;
//        System.out.println(test.getTree()[0][0][2]);
        while(!input.equals(null)){
//            code.setDataBalance(0.4);
            data = code.getData();
            String dataMsg = data[i][j];
            if(dataMsg.charAt(0)!='*'){
                input = JOptionPane.showInputDialog(dataMsg);
            }else{
                dataMsg=dataMsg.substring(1);
                String msg[]=dataMsg.split(";;");
                dataMsg = processMsg(msg[0],msg[1]);
                JOptionPane.showMessageDialog(null, dataMsg);
                input=null;
            }
            try{
                int next=0;
                if(!input.equals(null)&&!input.equals("*")){
                    next = Integer.parseInt(input);
                }else 
                    if(input.equals("*")){
                        int newJ=0; 
                        i=(i-1<0?0:i-1);
                        for(int k = 0;k<=dataSize[i].length;k++){
                            newJ+=dataSize[i][k];
                            if(newJ-1>=j){
                                j=k;
                                break;
                            }
                        }

                        System.out.println("backLocation: "+i+","+j);
                }
                if(next<=dataSize[i][j] && next>0){
                    int newJ=0;
                    for(int k = 0;k<=j;k++){
                        if(k==j)
                            newJ+=next-1;
                        else
                            newJ+=dataSize[i][k];
                    }
                    j=newJ;
                    i++;
                    System.out.println("Location: "+i+","+j);

                }else if(!input.equals("*"))
                    throw new IllegalArgumentException();


            }catch(IllegalArgumentException e){
                JOptionPane.showMessageDialog(null, "Invalid Input", "Try Again", JOptionPane.ERROR_MESSAGE);
            };

        }
//        String x = JOptionPane.showInputDialog("For Data, Press 1\nFor Credit, Press 2\nTo go back, Press 00");
//        JOptionPane.showMessageDialog(null, "x is: "+x);
    }
    
    static int authRecharge(String x){
        
        int cardAmount=0;
        for(int i = 0;i < 4;i++){
           for(int j=0;j<10;j++){
               if(x.equals(cardNo[i][j])){
                   cardAmount=(i==0?100:i==1?200:i==2?500:1000);
               }
           }
           
       }
       return cardAmount;
    }

    private static String processMsg(String dataType, String dataMsg) {
        
        switch(dataType.toLowerCase()){
            case "packrex":
                dataMsg = code.packageMigrate(dataMsg);
                break;
            case "rechargrex":
                String x="x";
                while(!x.equals(null)){
                    x = JOptionPane.showInputDialog("Please enter recharge card number");
                    int rechargeAmount = authRecharge(x);
                    if(rechargeAmount!=0){
                        code.setAcctBalance(rechargeAmount+code.getAcctBal());
                        dataMsg = "Your recharge of N" +rechargeAmount+ " has been successful, thank you.\n"
                                + "Main Balance: "+code.getAcctBal();
                        break;
                    }else
                        JOptionPane.showMessageDialog(null, "Invalid recharge card pin", "Try Again", JOptionPane.ERROR_MESSAGE);
                }
                break;
            case "datrex":
                String msg[]=dataMsg.split(";");
                int cost = Integer.parseInt(msg[0]);
                int dataDay = Integer.parseInt(msg[1]);
                int time = Integer.parseInt(msg[2]);
                int dataNight = Integer.parseInt(msg[3]);
                //1. N100 = 150MB for 1 day
                code.setDataBalance(dataDay+code.getDataBal());
                if(cost<=code.getAcctBal()){
                    code.setAcctBalance(code.getAcctBal()-cost);
                    dataMsg =  "Congrats! You have received "+dataDay+" MB for N"+cost+",\nValid for "+time+(time>1?" days. ":" day. ")
                            + "You can also share or gift data to your loved ones\nNew Data Balanace: "+code.getDataBal()+" MB";
                    
                }
                break;
        }
        
        return dataMsg;
            
    }
    
}
