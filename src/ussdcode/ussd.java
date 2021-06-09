/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ussdcode;

/**
 *
 * @author HP
 */
public class ussd {
    
    private String[][][] ussdTree;
    String[][] data;
    private double dataBalance=1024.55;
    private double acctBalance = 1000;
    private String currentPackage = "Yakata";
    private String phoneNo = "08159095179";

    public ussd() { 
        
//        data = new String[][]{
//            {"1. Data\n2. E-Top-Up-Enjoy 10% Extra this Season\n"
//                    + "3. Berekete\n4. Tariff Plan\n"
//                    + "5. Intl Calls & Roaming\n6. GloRewards\n"
//                    + "7. Voice Offers\n8. Super Value\n"
//                    + "9. Borrow Credit or Data\n10. VAS"},
//            {"1. Buy Data Plan\n2. Gift Data Plan\n"
//                    + "3. Share Data Plan\n4. Check Data Balance\n"
//                    + "5. Manage Data Plan\n6. Blackberry\n"
//                    + "*. Back",
//                "Welcome to Glo e-Services\nPlease select an option\n"
//                    + "1. Airtime\n2. Data\n\n *.Back",
//                "Enjoy 700% bonus to call all network + FREE Data on every recharge\n\n"
//                    + "1. Migrate now\n*. Back",
//                "1. My Package\n2. Check Balance\n3. My Number\n4. Friends & Family Numbers\n"
//                    + "5. Recharge\n6. Tariff Information\n7. Easyshare\n*. Back",
//                "1. International Call Offers\n2. Data Roaming\n*. Back",
//                "Welcome to GloRewards\nGet Instant cashback\nWin #5k-#100M weekly\n"
//                    + "T&Cs applied\n\n1. Accept\n2. Opt-Out\n*. Back",
//                "HOT Deals\n1. NAIRA Multiplier\n2. Call 18 Countries @ Local Rates\n"
//                    + "3. Super HOT Monthly Deals\n4. Check Your Balance\n5. GLO AMEBO - 5x\n*. Back",
//                "1. Glo Super Value Recharge\n2. Super Value Balance\n*. Back",
//                "Dear Customer, Welcome, you are eligible for #1000.\n"
//                    + "Reply with\n1. BMC Info\n2. Borrow Credit\n3. Borrow Data\n*. Back",
//                "1. GameBox\n2. Glo Cloud\n3. Busuu Language learning\n4. Gaming Portal\n"
//                    + "5. Caller Tunes\n6. Borrow Me Credit\n7. Unsunscribe\n*. Back",
//                },
//            {"Please Select\n1. Mini Plans\n2. Monthly Plans\n3. Mega Plans\n4. Super Mega Plans\n"
//                + "5. Special Data Offer\n 6. Social Bundles\n7. Night and Weekend Plans\n*. Back",
//                "Please Select\n1. Mini Plans\n2. Monthly Plans\n3. Mega Plans\n4. Super Mega Plans\n"
//                + "5. Special Data Offer\n 6. Social Bundles\n7. Night and Weekend Plans\n*. Back",
//                "Share data plan\n1. Share\n2. Unshare",
//                getDataBalance(),
//                "25"},
//            {"at 31","at 32","at 33"},
//            {"at 41","at 42","at 43"},
//            {"at 51","at 52","at 53"},
//            {"at 61","at 62","at 63"},
//            {"at 71","at 72","at 73"}
//        };
        
        this.ussdTree = new String[][][]
        {
            {   
                {
                    
                     
                    "1. Buy Data Plan\n2. Gift Data Plan\n"
                    + "3. Share Data Plan\n4. Check Data Balancev"
                    + "5. Manage Data Plan\n6. Blackberry\n"
                    + "7. Back\n8. Exit",
                    
                    "1. Proceed (Auto-Renew)\n2. Proceed (One-Off)",
                    
                    "1. N100 = 150MB for 1 day\n2. N200 = 350MB for 1 day\n"
                    + "3. N500 = 1.31GB for 3 addays\n4. N50 = 50MB for 1 day\n"
                    + "5. More Plans\n6. Back",
                    
                    "1. N1000 = 2.9GB\n2. N200 = 350MB\n"  
                    + "3. N500 = 1.31GB\n4. N50 = 50MB\n"
                    + "5. More Plans\n6. Back"
                    
                    
                    
                },
                {"a2"},
                {"a3"},
                {"a4"},
                {"a5"}, 
                {"a6"},
                {"a7"},
                {"a8"}
            },
            {   
                 {"b1"},{"b2"},{"b3"},{"b4"},{"b5"},{"b6"},{"b7"},{"b8"}
            }    
                
        };
    }
    
    public String[][][] getTree(){
        return ussdTree;
    }
    
    public String[][] getData(){
        return data = new String[][]{
            {"1. Data\n2. E-Top-Up-Enjoy 10% Extra this Season\n"
                    + "3. Berekete\n4. Tariff Plan\n"
                    + "5. Intl Calls & Roaming\n6. GloRewards\n"
                    + "7. Voice Offers\n8. Super Value\n"
                    + "9. Borrow Credit or Data\n10. VAS"},
            {"1. Buy Data Plan\n2. Gift Data Plan\n"
                    + "3. Share Data Plan\n4. Check Data Balance\n"
                    + "5. Manage Data Plan\n6. Blackberry\n"
                    + "*. Back",
                "Welcome to Glo e-Services\nPlease select an option\n"
                    + "1. Airtime\n2. Data\n\n *.Back",
                "Enjoy 700% bonus to call all network + FREE Data on every recharge\n\n"
                    + "1. Migrate now\n*. Back",
                "1. My Package\n2. Check Balance\n3. My Number\n4. Friends & Family Numbers\n"
                    + "5. Recharge\n6. Tariff Information\n7. Easyshare\n*. Back",
                "1. International Call Offers\n2. Data Roaming\n*. Back",
                "Welcome to GloRewards\nGet Instant cashback\nWin #5k-#100M weekly\n"
                    + "T&Cs applied\n\n1. Accept\n2. Opt-Out\n*. Back",
                "HOT Deals\n1. NAIRA Multiplier\n2. Call 18 Countries @ Local Rates\n"
                    + "3. Super HOT Monthly Deals\n4. Check Your Balance\n5. GLO AMEBO - 5x\n*. Back",
                "1. Glo Super Value Recharge\n2. Super Value Balance\n*. Back",
                "Dear Customer, Welcome, you are eligible for #1000.\n"
                    + "Reply with\n1. BMC Info\n2. Borrow Credit\n3. Borrow Data\n*. Back",
                "1. GameBox\n2. Glo Cloud\n3. Busuu Language learning\n4. Gaming Portal\n"
                    + "5. Caller Tunes\n6. Borrow Me Credit\n7. Unsunscribe\n*. Back",
                },
            {"Please Select\n1. Mini Plans\n2. Monthly Plans\n3. Mega Plans\n4. Super Mega Plans\n"
                    + "5. Special Data Offer\n 6. Social Bundles\n7. Night and Weekend Plans\n*. Back",
                "Please Select\n1. Mini Plans\n2. Monthly Plans\n3. Mega Plans\n4. Super Mega Plans\n"
                    + "5. Special Data Offer\n 6. Social Bundles\n7. Night and Weekend Plans\n*. Back",
                "Share data plan\n1. Share\n2. Unshare",
                getDataBalance(),
                "please select\n1. To get Data Settings\n2. To see Details for manual Configuration\n"
                    + "3. To go to Selfcare Portal\n4. Get Data Balance\n5. To Check Sharing Members\n*. Back",
                "All Glo BB10 data Plans are now 3G-4G compatible\n1. Buy 3G-4G BB data\n"
                + "2. Manage\n*. Back",
                
                "Please select type of Airtime\n1. 5X Recharges\n2. Regular Recharges"
                    + "\n\n*. Back",
                "Data Plan Purchase\n\n1. Self\n2. Third Party\n*. Back",
                
                "*Packrex;;Brekete",
                
                "*Disprex;;Dear customer, your profile is "+ currentPackage.toUpperCase(),
                getAcctBalance(),
                getPhoneNumber(),
                "1. Manage Friends & Family\n2. View Friends & family list\n*. Back",
                "*Rechargrex;;true",
                "1. Berekete\n2. 11KOBO Plan\n3. Gbam Plus\n*. Back",
                "*Disprex;;Glo Unlimited"},
            {"1. N100 = 150MB for 1 day\n2. N200 = 350MB for 1 day\n"
                    + "3. N500 = 1.31GB for 3 days\n4. N50 = 50MB for 1 day\n"
                    + "5. More Plans\n6. Back",
                "",
                "at 33"},
            {"*Datrex;;100;150;1;0",
                "*Datrex;;200;350;1;0",
                "*Datrex;;500;1310;3;0",
                "*Datrex;;50;50;1;0"},
            {"at 51","at 52","at 53"},
            {"at 61","at 62","at 63"},
            {"at 71","at 72","at 73"}
        };
        
    }
    
    public void setDataBalance(Double balance){
        dataBalance=balance;
    }
    
    public double getDataBal(){
        return dataBalance;
    }
    
    public void setAcctBalance(Double balance){
        acctBalance=balance;
    }
    
    public String getAcctBalance(){
        return String.format("*Disprex;;Your main balance is: N%.2f", acctBalance);
    }
    
    public double getAcctBal(){
        return this.acctBalance;
    }
    
    public String getPhoneNumber(){
        return String.format("*Disprex;;Your phone number is: %s", phoneNo);
    }
    
    public String packageMigrate(String pack){
        currentPackage = pack;
        return "Dear Customer, you have successfully migrated to Glo"+currentPackage;
    }

    private String getDataBalance() {
        if(dataBalance<1)
            return "*Disprex;;Dear Customer, your plan has expired and do not\n"
                    + "have a data plan. To buy a data plan and\n"
                    + "continue browsing dial *777#";
        else
            return String.format("*Disprex;;Your data balance is: %.2fmb", dataBalance);
    }
        
    
}
