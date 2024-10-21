#include <cs50.h>
#include <stdio.h>
#include <string.h>
#include <ctype.h>


int main(int argc, string argv[])
{
    // if typed in more than one key, return correct usage and return 1
    if (argc != 2)
    {
        printf("Usage: ./substitution key\n");
        return 1;
    }
    // if the key doesn't contain 26 chars, return fixing message and return 1
    else if (strlen(argv[1]) != 26)
    {
        printf("Key must contain 26 characters.\n");
        return 1;
    }
    else
    {
        for (int j = 0, length1 = strlen(argv[1]); j < length1; j++)
        {
            if (isalpha(argv[1][j]) == false)
            {
                printf("Key must be alphabets.\n");
                return 1;
            }
            for (int i = j+1, length2 = strlen(argv[1])-1 ; i < length2; i++)
            {
                if (argv[1][i] == argv[1][j])
                {
                    printf("Key must not have repeated characters.\n");
                    return 1;
                }
            }
        }

         // Prompt the user some text to encrypt
        string text = get_string("plaintext:  ");

        // Print out the encrypted text (case insensitive)
        printf("ciphertext: ");
        for (int i = 0, length = strlen(text); i < length; i++)
        {
            int posi = (int) toupper(text[i]) - 65;

            if (isupper(text[i]))
            {
                printf("%c", toupper(argv[1][posi]));
            }
            else if (islower(text[i]))
            {
                printf("%c", tolower(argv[1][posi]));
            }
            else
            {
                printf("%c", text[i]);
            }

        }
        printf("\n");
        return 0;
    }

}
