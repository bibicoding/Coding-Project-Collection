#include <cs50.h>
#include <ctype.h>
#include <stdio.h>
#include <string.h>

int score(string word);

int main(void)
{
    string word1 = get_string("Player1: ");
    string word2 = get_string("Player2: ");

    int score1 = score(word1);
    int score2 = score(word2);

    if (score1 > score2)
    {
        printf("Player 1 wins!\n");
    }
    else if (score2 > score1)
    {
        printf("Player 2 wins!\n");
    }
    else
    {
        printf("Tie!\n");
    }


}

int score(string word)
{
    int sum = 0;
    int alphascore[26] = {1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 3,
                          1, 1, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4, 10};

    for (int i = 0, length = strlen(word); i < length; i++)
    {
        int x = toupper(word[i]);
        if (65 <= x && x <= 90)
        {
            sum += alphascore[x-65];
        }
    }
    return sum;
}
