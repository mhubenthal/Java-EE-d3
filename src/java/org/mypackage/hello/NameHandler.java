package org.mypackage.hello;

/**
 *
 * @author maxhubenthal
 */
public class NameHandler {
    private String name;
    private double[] letterFreq = {.08167, .01492, .02780, .04253, .12702, .02288, .02022, 
        .06094, .06973, .00153, .00747, .04025, .02517, .06749, .07507, 
        .01929, .00098, .05987, .06333, .09056, .02758, .01037, .02465, 
        .00150, .01971, .00074
    };
    
    public NameHandler(){
        name = null;
    }

    /**
     * @return a String representing the ranking of the user's name
     */
    public String getName() {
        name = name.toLowerCase();
        char[] charName = name.toCharArray();
        boolean[] usedLetter = new boolean[26];
        double namePercent = 0.0;
        int charVal = 0;
        boolean alreadyUsed = false;
        for(int i=0; i<charName.length; i++){
            charVal = ((int)charName[i]) - 97; // Convert ASCII value to position in alphabet array 
            if(charVal==-65){
                ;// Skip this value, it is a space
            }
            else{
                // Do not count letters twice
                if(!usedLetter[charVal]){
                    namePercent = namePercent + letterFreq[charVal];
                    usedLetter[charVal] = true;
                }
                else{
                    ;
                }
            }
        }
        namePercent = namePercent*100; // Convert to more readable percentage
        namePercent = (double)Math.round(namePercent*100)/100;
        String percent = Double.toString(namePercent);
        
        // Assign the correct message to the result
        if(namePercent>=80){
            percent = "Congratulations, you have widely used letters in your name: "+namePercent+"% popularity!";
        }
        else if(namePercent<=20){
            percent = "Sorry, the letters in your name are sorely missed: "+namePercent+"% popularity.";
        }
        else{
            percent = "Not bad, the letters in your name are represented pretty well: "+namePercent+"% popularity.";
        }
        return percent;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
}
