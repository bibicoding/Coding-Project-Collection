# Caesar Cipher

### Video Demo: https://youtu.be/H4lsD-JDmtA
### Description:
The name of this project is "THE CIPHERER". Basically, this program allows the user to encipher and decipher what they want. To encipher, the program further prompts the user to decide how many moves they would like to move, the quantity should be an integer no less than one. To decipher, the program automatically pulls two letters forward for each letter in the given string, deciphering a caesar-ciphered code. If the user didn't select the mode (to encipher as 1 and to decipher as 2) correctly, the program would end right away.

The Program allows user to encipher and decipher a str, the output would be in uppercase.

Technique: Using ASCII Table to convert the alphabets into numbers, then use the numbers to encipher and decipher with the given moves. For instance, enciphering "A" with 2 moves would convert it to "C", while deciphering "A" would convert it to "Y". The letters in the string, if an alphabet, would be converted in uppercase prior to all the shifting and enciphering and deciphering, for it is much straightfoward to change the letters without considering whether it is uppercase or lowercase ("A" and "a" have different corresponding numberes on the ASCII Table). Numbers would not be converted and remain the same, the same goes for punctuations, special symbols, and blank spaces.

Encipher: Allows user to input desired moves
Decipher: Moves the given input forward twice
Other Information: If the str given contains non-alphabet letters, such as numbers and commas, returns the letter without moving

P.S. If the user inputted a blank space when asked for a string to encipher (or decipher), the output remains the same.

Please report any mistakes or bugs if possible, thank you!
