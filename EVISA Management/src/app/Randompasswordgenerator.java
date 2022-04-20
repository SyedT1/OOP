/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.Random;

/**
 *
 * @author thinker
 */
public class Randompasswordgenerator {

    static String generatePassword(int length) {
        String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String specialCharacters = "!@#$";
        String numbers = "1234567890";
        String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
        Random random = new Random();
        String pwd = "";
        pwd += lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
        pwd += capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
        pwd += specialCharacters.charAt(random.nextInt(specialCharacters.length()));
        pwd += numbers.charAt(random.nextInt(numbers.length()));

        for (int i = 4; i < length; i++) {
            pwd += combinedChars.charAt(random.nextInt(combinedChars.length()));
        }
        return pwd;
    }
}
