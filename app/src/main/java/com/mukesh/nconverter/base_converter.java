package com.mukesh.nconverter;

public class base_converter {

    public String decToBase(String decNum, String toBase) {

        // int tobase=(int)toBase;
        int tobase=Integer.parseInt(toBase);


        double secNum= Double.parseDouble(decNum);
        int firNum=(int) secNum;
        secNum=secNum-firNum;
        decNum="";

        //for first part
        while(firNum!=0){
            char rem='0';
            int h=firNum%tobase;//iske baad ek if dalna hai

            if(h<10){
                firNum=firNum/tobase;
                rem=(char)(h+48);
            }
            else if (h>=10 && h<25){
                firNum=firNum/tobase;
                rem=(char)(h+55);
            }
            decNum=decNum+rem;
        }
        firNum=1;

        //rev the decNum
        StringBuilder input1 = new StringBuilder();
        input1.append(decNum);
        input1.reverse();
        decNum = input1.toString();
        decNum+=".";

        //decimal part
        int cn=0;
        while(secNum > 0 && cn < 10){
            secNum=secNum*tobase;
            int q=(int)secNum;
            if(q<10){
                secNum=secNum-q;
                decNum=decNum+q;
            }
            else if (q>=10 && q<25){
                secNum=secNum-q;
                decNum=decNum+(char)(q+55);
            }
            cn++;
        }
        return decNum;
    }

    public String ranToBase10(String theNum, String fromBase){
        // int frombase=(int)fromBase;
        int frombase=Integer.parseInt(fromBase);

        double ans=0d;
        int totLen=theNum.length();
        theNum+=".";
        int pointAt=theNum.indexOf(".");
        // System.out.println();
        char array[] =theNum.toCharArray();
        int t=pointAt-1;
        double temp=0d;
        for(int i=0;i<totLen;i++){
            if(array[i]=='.')
                continue;
            if((int)(array[i])<=57 && (int)array[i]>=48){
                temp=(double)((int)(array[i])-48)*(Math.pow(frombase,t));
            }
            else if((int)(array[i])<=90 && (int)array[i]>=65){
                temp=(double)((int)(array[i])-55)*(Math.pow(frombase,t));
            }
            ans=ans+temp;
            t--;
        }
        theNum=ans+"";
        return theNum;
    }

    public static void main(String[] args) {

//        String decNum = "276";
//        // decNum.concat("d");
//        int toBase = 10;
//        int fromBase = 10;
//
//        String convertedToBase = decToBase(decNum, toBase);
//        System.out.println(convertedToBase);
//        String backToDec = ranToBase10(decNum, fromBase);
//        System.out.println(backToDec);
    }

}
