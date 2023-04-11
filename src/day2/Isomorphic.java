package day2;

import java.util.Arrays;

public class Isomorphic {

    public static boolean isIsomorphic(String str1, String str2) {

        if(str1.length()!=str2.length()){
            return false;
        }

        int size = 256;

        int []characterMap = new int[size];

        //0 - no mapping of char stores ;
        Arrays.fill(characterMap,0);

        int []visitedArr = new int[size];

        //0 - false ; 1 - true
        Arrays.fill(visitedArr,0);

        for(int i=0;i<str1.length();i++){

            if(characterMap[str1.charAt(i)]==0){

                if(visitedArr[str2.charAt(i)]==1){
                    return false;
                }


                visitedArr[str2.charAt(i)]=1;

                characterMap[str1.charAt(i)]=str2.charAt(i);

            } else if (characterMap[str1.charAt(i)]!=str2.charAt(i)) {
                return false;
            }


        }

        return true;

    }
}
